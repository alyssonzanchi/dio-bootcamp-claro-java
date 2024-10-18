//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentFacade paymentFacade = new PaymentFacade();

        paymentFacade.makePayment(PaymentMethod.CREDIT_CARD, 100);
        paymentFacade.makePayment(PaymentMethod.PAYPAL, 150);

        // Tentativa de pagamento inválido
        paymentFacade.makePayment(PaymentMethod.CREDIT_CARD, -50);
    }
}