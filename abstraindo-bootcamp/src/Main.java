import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Projeto projeto = new Projeto();
        projeto.setTitulo("Projeto de API");
        projeto.setDescricao("Construção de uma API RESTful");
        projeto.setDuracao(5);

        Desafio desafio = new Desafio();
        desafio.setTitulo("Desafio de Algoritmos");
        desafio.setDescricao("Resolver problemas de algoritmos.");
        desafio.setNivelDificuldade("Médio");
        desafio.setXpAdicional(15);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(projeto);
        bootcamp.getConteudos().add(desafio);

        Dev devAlysson = new Dev();
        devAlysson.setNome("Alysson");
        devAlysson.inscreverBootcamp(bootcamp);

        Feedback feedback = new Feedback(devAlysson, curso1, 5, "Excelente curso!");
        System.out.println(feedback);

        Notificacao notificacao = new Notificacao("Novo conteúdo disponível!");
        notificacao.adicionarDev(devAlysson);
        notificacao.enviarNotificacoes();

        System.out.println("Conteúdos Inscritos Alysson" + devAlysson.getConteudosInscritos());
        devAlysson.progredir();
        devAlysson.progredir();
        devAlysson.progredir();
        devAlysson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Alysson" + devAlysson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Alysson" + devAlysson.getConteudosConcluidos());
        System.out.println("XP:" + devAlysson.calcularTotalXp());

        System.out.println("--------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
    }
}