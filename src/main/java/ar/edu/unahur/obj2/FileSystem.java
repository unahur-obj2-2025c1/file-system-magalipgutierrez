package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;


// va a ser nuestro cliente-> disparamos las cosas que queremos
public class FileSystem {

    private final List<IElemento> elementos=  new ArrayList<>();

    public void agregarElemnto(IElemento e){
        elementos.add(e);
    }
// aca intenta que la impresion sea lo mas parecido a la imagen 
    public void listar(){
        //aca pregunta el porfes -> cómo se puede ciclar la lista de elemntos -> forEach
        elementos.stream().forEach(
            //por cada elemento hay que pedirle que se muestre
            e-> { e.mostrar(0);}
                

        );
        
    }

    public List<IElemento> getElementos() {
        return elementos;
    }

}
