import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente alysson = new Cliente();
        alysson.setNome("Alysson");
        alysson.setEndereco("Rua A, 123");
        alysson.setTelefone("1234-5678");

        // Criando um banco
        Banco banco = new Banco("Banco Exemplo");

        // Criando contas
        Conta cc = new ContaCorrente(alysson);
        Conta cp = new ContaPoupanca(alysson);

        // Adicionando contas ao banco
        banco.setContas(List.of(cc, cp));

        // Testando funcionalidades da conta
        cc.depositar(100);
        System.out.println("Saldo após depósito na Conta Corrente:");
        cc.imprimirExtrato();

        cc.transferir(50, cp);
        System.out.println("\nExtrato após transferência da Conta Corrente para a Conta Poupança:");
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        // Testando cartão de crédito
        CartaoCredito cartao = new CartaoCredito("1234-5678-9012-3456", alysson.getNome(), 500);
        cartao.usarCredito(200);
        System.out.println("\nLimite disponível após uso do cartão de crédito: R$" + cartao.getLimiteDisponivel());

        cartao.pagarFatura(100);
        System.out.println("Limite disponível após pagamento da fatura: R$" + cartao.getLimiteDisponivel());

        // Testando investimentos
        Investimento investimento = new Investimento("Ações", 1000, 10);
        double rendimento = investimento.calcularRendimento();
        System.out.println("\nRendimento após um ano em " + investimento.getNome() + ": R$" + (rendimento - investimento.getValorInicial()));

        // Imprimindo transações da conta
        System.out.println("\nTransações da Conta Corrente:");
        cc.imprimirTransacoes();
        System.out.println("Transações da Conta Poupança:");
        cp.imprimirTransacoes();
    }
}