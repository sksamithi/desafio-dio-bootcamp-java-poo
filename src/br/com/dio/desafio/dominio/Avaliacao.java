package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Avaliacao {
    private String devNome;
    private String conteudoTitulo;
    private int nota;
    private String comentario;
    private LocalDate dataAvaliacao;

    public Avaliacao(String devNome, String conteudoTitulo, int nota, String comentario, LocalDate dataAvaliacao) {
        this.devNome = devNome;
        this.conteudoTitulo = conteudoTitulo;
        this.nota = nota;
        this.comentario = comentario;
        this.dataAvaliacao = dataAvaliacao;
    }

    public String getDevNome() {
        return devNome;
    }

    public void setDevNome(String devNome) {
        this.devNome = devNome;
    }

    public String getConteudoTitulo() {
        return conteudoTitulo;
    }

    public void setConteudoTitulo(String conteudoTitulo) {
        this.conteudoTitulo = conteudoTitulo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(LocalDate dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    @Override
    public String toString() {
        return "Avaliacao: " +
                " do aluno(a) = '" + devNome + '\'' +
                " sobre o tema '" + conteudoTitulo + '\'' +
                " teve nota = " + nota +
                ". Comentarios adicionais = '" + comentario + '\'' +
                ". Data da avaliação: " + dataAvaliacao;
    }
}
