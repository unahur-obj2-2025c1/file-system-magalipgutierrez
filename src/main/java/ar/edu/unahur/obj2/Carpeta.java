package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carpeta implements IElemento{
    // List < aca adentro va el tipo> -> la interface es la lista y la interface para implemtarlo es q va a ser un array
  private List<IElemento> listElementos = new ArrayList<>();
  //muy parecido a -> IElemento elemento = new Acrhivo(); ---> aca se 
                    // del lado derecho es la interface, izquierdo lo concreto
  private String nombre;

  //constructor 
  public Carpeta(String nombre){
    this.nombre=nombre;
  }
  // no devuelve nada aca
  public void agregar(IElemento e){
    listElementos.add(e);
  }
  @Override
  public String nombre() {
    
    return nombre;
    
  }
  @Override
  public Integer tamanio() {
    //stream() nos permite trabajar a los elemntos de la lista con metodos como find(), mind(), map()
    // a la lista convetila en un flujo d ebytes
    //adentro hay que poner qué queremos!
    return listElementos.stream().mapToInt(e->e.tamanio()).sum();
    // se conviete primero ne una lista de tamnio-> mapToInt(e->e.tamanio())
    //aparece la RECURSIVIDAD ADENTRO DEL CLOSURE -> e.tamanio()

  }
  @Override
  public void mostrar(Integer identacion) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
  }
  @Override
  public IElemento archivoMasPesado() {
   // no se le puede pedir un max a una lista vacia-> se soluciona con el OrElse()
   //si no esta presente, te tira una excepction

    return listElementos.stream().map(e-> e.archivoMasPesado()).max(
        Comparator.comparingInt(e-> e.tamanio())
    ).orElseThrow();
    // hace un mapeo para llevar a todo a uno solo, que te devuelva el archivo mas pesado
    // orElseThrow() tira una exception por si la lista esta vacia-Z ya que no tendría max y romepría en ese caso
  }

}
