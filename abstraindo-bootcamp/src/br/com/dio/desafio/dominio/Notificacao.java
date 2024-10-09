package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Notificacao {
    private List<Dev> devs = new ArrayList<>();
    private String mensagem;

    public Notificacao(String mensagem) {
        this.mensagem = mensagem;
    }

    public void adicionarDev(Dev dev) {
        devs.add(dev);
    }

    public void enviarNotificacoes() {
        for (Dev dev : devs) {
            System.out.println("Notificação para " + dev.getNome() + ": " + mensagem);
        }
    }
}
