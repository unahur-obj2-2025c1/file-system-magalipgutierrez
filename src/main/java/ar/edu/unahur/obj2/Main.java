package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr= (ArrayList<Integer>) Arrays.asList(3,5,6,7);
        ArrayList<Integer> arr2= (ArrayList<Integer>) arr.stream().map(e->e*2);
        
        System.out.println(arr);
        arr2.stream().forEach(e-> System.out.println(e));
    }
}