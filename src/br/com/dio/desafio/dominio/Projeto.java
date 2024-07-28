package br.com.dio.desafio.dominio;

public class Projeto extends Conteudo {
    @Override
    public double calcularXp() {
        return XP_PADRAO + 30d;
    }

    public Projeto() {
    }

    @Override
    public String toString() {
        return "Projeto:" +
                "título:'" + getTitulo() + '\'' +
                ", descrição:'" + getDescricao();
    }
}
