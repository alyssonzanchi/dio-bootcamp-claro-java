import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public abstract class Conta implements ContaInterface {
    private static final int AGENCIA_PADRAO = 491;
    private static int sequencial = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<String> transacoes;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = sequencial++;
        this.cliente = cliente;
        this.transacoes = new ArrayList<>();
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        transacoes.add("Saque de R$" + valor);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        transacoes.add("Depósito de R$" + valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        transacoes.add("Transferência de R$" + valor + " para conta " + contaDestino.getNumero());
    }

    public void imprimirTransacoes() {
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s\n", this.cliente.getNome());
        System.out.printf("Agencia: %d\n", this.agencia);
        System.out.printf("Numero: %d\n", this.numero);
        System.out.printf("Saldo: %.2f", this.saldo);
    }
}
