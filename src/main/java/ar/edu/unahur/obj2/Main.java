package ar.edu.unahur.obj2;

public class Main {
    public static void main(String[] args) {
        //ArrayList<Integer> arr= (ArrayList<Integer>) Arrays.asList(3,5,6,7);
        //ArrayList<Integer> arr2= (ArrayList<Integer>) arr.stream().map(e->e*2);
        
        //System.out.println(arr);
        //arr2.stream().forEach(e-> System.out.println(e));

        Carpeta carpeta1= new Carpeta("carpeta A nivel 1");
        Carpeta carpeta2= new Carpeta("carpeta B nivel 1");
        Carpeta carpeta3= new Carpeta("carpeta A nivel 2");
        Carpeta root = new Carpeta("root");

        Archivo file1= new Archivo("jpg", "Dibujo A", 250);
        //Archivo file2= new Archivo("mp3", "Pop", 400);
        Archivo file3= new Archivo("jpg", "Rock", 400);
        Archivo file4= new Archivo("mp3", "Audio A", 350);
        Archivo file5= new Archivo("mp4", "Video A", 700);
        Archivo file6= new Archivo("mp3", "video", 750);
        Archivo file7= new Archivo("jpg", "foto", 250);

        carpeta1.agregar(file1);
        carpeta1.agregar(file7);
        carpeta2.agregar(file6);
        carpeta2.agregar(file5);
        carpeta2.agregar(file3);
        carpeta3.agregar(file4);
        root.agregar(carpeta1);
        root.agregar(carpeta2);

        

    }
}