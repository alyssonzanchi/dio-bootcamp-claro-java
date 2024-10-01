import lombok.Getter;

@Getter
public class Investimento {
    private String nome;
    private double valorInicial;
    private double rendimentoAnual;

    public Investimento(String nome, double valorInicial, double rendimentoAnual) {
        this.nome = nome;
        this.valorInicial = valorInicial;
        this.rendimentoAnual = rendimentoAnual;
    }

    public double calcularRendimento() {
        return valorInicial * (1 + rendimentoAnual / 100);
    }
}
