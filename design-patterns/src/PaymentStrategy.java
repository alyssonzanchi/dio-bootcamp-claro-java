public interface PaymentStrategy {
    void pay(int amount) throws Exception;
}
