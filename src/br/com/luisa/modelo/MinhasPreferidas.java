package br.com.luisa.modelo;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao()>=8){
            System.out.println(audio.getTítulo() + " é considerado sucesso absoluto e preferido por todos!");
        } else{
            System.out.println(audio.getTítulo()+" também é um dos que todo mundo está curtindo!");
        }
    }
}
