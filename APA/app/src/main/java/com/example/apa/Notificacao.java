package com.example.apa;

public class Notificacao {
    private String titulo;
    private String subtitulo;
    private int segundos;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public Notificacao(String titulo, String subtitulo, int segundos) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.segundos = segundos;
    }

    public Notificacao() {
    }
}
