package br.com.luisa.modelo;

public class Audio {
    private String título;
    private int totalReproducoes;
    private int totalCurtidas;
    private double duracao;
    private int classificacao;

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public void curtir(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalReproducoes++;
    }
}
