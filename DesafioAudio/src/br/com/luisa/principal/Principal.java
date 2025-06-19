package br.com.luisa.principal;

import br.com.luisa.modelo.MinhasPreferidas;
import br.com.luisa.modelo.Musica;
import br.com.luisa.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTítulo("Risk");
        minhaMusica.setArtista("Deftones");
        minhaMusica.setAlbum("Diamond Eyes");
        minhaMusica.setGenero("Metal");

        for (int i = 0; i < 1000; i++){
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++){
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTítulo("Mano a Mano");
        meuPodcast.setApresentador("Mano Brown");

        for (int i = 0; i<5000; i++){
            meuPodcast.reproduz();
        }

        for (int i = 0; i<1000; i++){
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);


    }
}
