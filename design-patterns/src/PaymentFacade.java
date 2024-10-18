public class PaymentFacade {
    public void makePayment(PaymentMethod method, int amount) {
        PaymentStrategy paymentStrategy = switch (method) {
            case CREDIT_CARD -> new CreditCardPayment();
            case PAYPAL -> new PayPalPayment();
            default -> throw new IllegalArgumentException("Método de pagamento inválido");
        };

        try {
            paymentStrategy.pay(amount);
        } catch (Exception e) {
            System.err.println("Erro ao realizar pagamento: " + e.getMessage());
        }
    }
}
