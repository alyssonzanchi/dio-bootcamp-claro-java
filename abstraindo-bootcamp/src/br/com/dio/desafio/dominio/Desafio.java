package br.com.dio.desafio.dominio;

public class Desafio extends Conteudo {
    private String nivelDificuldade;
    private int xpAdicional;

    public Desafio() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + xpAdicional;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public int getXpAdicional() {
        return xpAdicional;
    }

    public void setXpAdicional(int xpAdicional) {
        this.xpAdicional = xpAdicional;
    }

    @Override
    public String toString() {
        return "Desafio{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", nivelDificuldade='" + nivelDificuldade + '\'' +
                ", xpAdicional=" + xpAdicional +
                '}';
    }
}
