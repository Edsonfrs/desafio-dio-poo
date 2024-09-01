import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java - 1");
        curso1.setDescricao("Curso Java básico");
        curso1.setCargaHoraria(150);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso de Banco de Dados - 1");
        curso1.setDescricao("Curso de Banco de Dados - Mysql");
        curso1.setCargaHoraria(180);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java - 1");
        mentoria1.setDescricao("Mentoria de Java com JPA e correlatos");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria1);

    }

}