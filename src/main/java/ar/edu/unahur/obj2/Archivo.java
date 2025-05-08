package ar.edu.unahur.obj2;
// te paras en archivo y vas a abajo de todo -> quick Fix ....(ctrl +) en azul, ya se puede gregas todos los metodos de la interface
public class Archivo implements IElemento{
    // atributos privados
    private String nombre;
    private Integer tamanio;
    private String extension;

    public Archivo(String extension, String nombre, Integer tamanio) {
        this.extension = extension;
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    //hay que definir un constructor que reciba  a los atributos
    
    @Override
    public String nombre() {
       // se puede escribir this.nombre + "." extension;
        return nombre+ "."+ extension;
    }

    @Override
    public Integer tamanio() {
       
        return tamanio;
    }

    @Override
    public void mostrar(Integer identacion) {
        
        throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
    }

    @Override
    public IElemento archivoMasPesado() {
        //el mas pesado que hay sin comparacion entre archivos, es el mismo archivo en el que estamos
        return this;
    }

}
