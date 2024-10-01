public class CartaoCredito {
    private String numero;
    private String titular;
    private double limite;
    private double saldoUsado;

    public CartaoCredito(String numero, String titular, double limite) {
        this.numero = numero;
        this.titular = titular;
        this.limite = limite;
        this.saldoUsado = 0;
    }

    public void usarCredito(double valor) {
        if (valor <= (limite - saldoUsado)) {
            saldoUsado += valor;
        } else {
            System.out.println("Limite insuficiente.");
        }
    }

    public void pagarFatura(double valor) {
        saldoUsado -= valor;
    }

    public double getLimiteDisponivel() {
        return limite - saldoUsado;
    }
}
