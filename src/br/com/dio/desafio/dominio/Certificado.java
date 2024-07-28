package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Certificado {
    private String devNome;
    private String bootcampNome;
    private LocalDate dataConclusao;

    public Certificado(String devNome, String bootcampNome, LocalDate dataConclusao) {
        this.devNome = devNome;
        this.bootcampNome = bootcampNome;
        this.dataConclusao = dataConclusao;
    }

    public String getDevNome() {
        return devNome;
    }

    public void setDevNome(String devNome) {
        this.devNome = devNome;
    }

    public String getBootcampNome() {
        return bootcampNome;
    }

    public void setBootcampNome(String bootcampNome) {
        this.bootcampNome = bootcampNome;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    @Override
    public String toString() {
        return "Certificamos que  " + devNome + '\'' +
                "completou o curso ' " + bootcampNome + '\'' +
                "na data:  " + dataConclusao;
    }
}
