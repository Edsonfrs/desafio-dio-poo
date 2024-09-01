package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    LocalDate data;

    // Método Abstrato
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    // Constructor
    public Mentoria() {
    }

    // Getters and Setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    // ToString
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
