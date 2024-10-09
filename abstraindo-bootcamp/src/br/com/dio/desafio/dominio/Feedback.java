package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Feedback {
    private Dev dev;
    private Conteudo conteudo;
    private int nota;
    private String comentario;

    public Feedback(Dev dev, Conteudo conteudo, int nota, String comentario) {
        this.dev = dev;
        this.conteudo = conteudo;
        this.nota = nota;
        this.comentario = comentario;
    }

    public Dev getDev() {
        return dev;
    }

    public Conteudo getConteudo() {
        return conteudo;
    }

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "dev=" + dev.getNome() +
                ", conteudo='" + conteudo.getTitulo() + '\'' +
                ", nota=" + nota +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
