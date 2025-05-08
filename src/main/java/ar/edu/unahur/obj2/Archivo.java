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
        // usamos la fc nombre-> tipo string
        System.out.println(this.nombre() ) ;
    }

    @Override
    public IElemento archivoMasPesado() {
        //el mas pesado que hay sin comparacion entre archivos, es el mismo archivo en el que estamos
        return this;
    }
   //porque este comportamiento lo hereda de "object"
   //para hacer el metodo de comparacion
   // un == que usabamos antes
// sourse Action-> hashCode...

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((tamanio == null) ? 0 : tamanio.hashCode());
        result = prime * result + ((extension == null) ? 0 : extension.hashCode());
        return result;
    }
//para hacer comparacion por igualdad
    @Override
    public boolean equals(Object obj) { // habiamos puetso Archivo a, pero admite a cualquier obj mientras sea del mismo tipo
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Archivo other = (Archivo) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (tamanio == null) {
            if (other.tamanio != null)
                return false;
        } else if (!tamanio.equals(other.tamanio))
            return false;
        if (extension == null) {
            if (other.extension != null)
                return false;
        } else if (!extension.equals(other.extension))
            return false;
        return true;
    }


}
