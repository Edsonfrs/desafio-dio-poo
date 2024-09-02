import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java - 1");
        curso1.setDescricao("Curso Java básico");
        curso1.setCargaHoraria(150);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Banco de Dados - 1");
        curso2.setDescricao("Curso de Banco de Dados - Mysql");
        curso2.setCargaHoraria(180);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso de PosgreSQL");
        curso3.setDescricao("Dominando a base de dados PosgreSQL");
        curso3.setCargaHoraria(170);

        Curso curso4 = new Curso();
        curso4.setTitulo("Curso Padrões de Projetos Java");
        curso4.setDescricao("Aprofundamento em Padrões de Projetos Java");
        curso4.setCargaHoraria(170);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java - 1");
        mentoria1.setDescricao("Mentoria de Java com JPA e correlatos");
        mentoria1.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(mentoria1);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Domine os conceitos de Java e técnicas avançadas de desenvolvimento neste Boot");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(curso3);
        bootCamp.getConteudos().add(curso4);
        bootCamp.getConteudos().add(mentoria1);


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");

        devCamila.inscreverBootCamp(bootCamp);
        System.out.println("Dev: " + devCamila.getNome());
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularXp());
        System.out.println("XP: " + devCamila.calcularXp());

        System.out.println();

        Dev devEdson = new Dev();
        devEdson.setNome("Edson");

        devEdson.inscreverBootCamp(bootCamp);
        System.out.println("Dev: " + devEdson.getNome());
        System.out.println("Conteúdos Inscritos: " + devEdson.getConteudosInscritos());
        devEdson.progredir();
        devEdson.progredir();
        devEdson.progredir();
        devEdson.progredir();
        devEdson.progredir();
        System.out.println("Conteúdos Inscritos: " + devEdson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + devEdson.getConteudosConcluidos());
        System.out.println("XP: " + devEdson.calcularXp());



    }

}