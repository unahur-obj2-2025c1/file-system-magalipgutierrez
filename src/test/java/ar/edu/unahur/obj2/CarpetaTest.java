package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
    Archivo txt = new Archivo("notas", ".txt", 250);
    Archivo img= new Archivo("Foto1", ".jpg", 400);
    Archivo mp3= new Archivo("Rock", ".mp3", 300);
    Archivo video= new Archivo("Video1", ".mp4", 450);

    Carpeta root= new Carpeta("root");
    Carpeta sub1= new Carpeta("Sub1");
    Carpeta sub2= new Carpeta ("sub2");

    
    @Test
    void dadaUnacarpetaQueContieneSubcarpetas_ObtengoElTamanioTotal() {
        sub1.agregar(txt);
        sub2.agregar(mp3);
        sub2.agregar(img);
        root.agregar(sub1);
        root.agregar(sub2);
        root.agregar(video);

        assertEquals(1400, root.tamanio());
        assertEquals(250, sub1.tamanio());
        assertEquals(700, sub2.tamanio());
        
        //el archivo mas pesado
        assertEquals(video, root.archivoMasPesado());

        assertTrue(video.tamanio().equals(450));
        assertEquals(".mp4.Video1", video.nombre());


    }

}
