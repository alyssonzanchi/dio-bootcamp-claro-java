public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) throws Exception {
        if (amount <= 0) throw new Exception("Valor inválido para pagamento.");
        System.out.println("Pagamento de " + amount + " " + Config.getInstance().getCurrency() + " realizado com PayPal.");
        Logger.log("Pagamento de " + amount + " realizado com PayPal.");
    }
}