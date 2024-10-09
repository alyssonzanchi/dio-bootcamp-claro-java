package br.com.dio.desafio.dominio;

public class Projeto extends Conteudo {
    private int duracao;

    public Projeto() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + (duracao * 2);
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
