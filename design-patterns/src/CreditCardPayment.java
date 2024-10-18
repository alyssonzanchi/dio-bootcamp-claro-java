public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) throws Exception {
        if (amount <= 0) throw new Exception("Valor inválido para pagamento.");
        System.out.println("Pagamento de " + amount + " " + Config.getInstance().getCurrency() + " realizado com Cartão de Crédito.");
        Logger.log("Pagamento de " + amount + " realizado com Cartão de Crédito.");
    }
}