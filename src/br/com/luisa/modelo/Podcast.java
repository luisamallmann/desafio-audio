package br.com.luisa.modelo;

public class Podcast extends Audio{
    private String apresentador;
    private String descrcao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescrcao() {
        return descrcao;
    }

    public void setDescrcao(String descrcao) {
        this.descrcao = descrcao;
    }

    @Override
    public int getClassificacao(){
        if(this.getTotalCurtidas() > 500){
            return 10;
        }else{
            return 8;
        }
    }
}
