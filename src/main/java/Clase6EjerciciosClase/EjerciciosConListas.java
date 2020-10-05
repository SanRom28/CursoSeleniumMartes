package Clase6EjerciciosClase;

import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosConListas {

    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        ArrayList<String> listaNombres = new ArrayList<String>();
        ArrayList<Integer> listaDNI = new ArrayList<Integer>();
        listaDNI.add(444444);
        listaDNI.add(55555555);

        System.out.println("Esta vacia? " + listaNombres.isEmpty());

        listaNombres.add("John");
        listaNombres.add("Cate");
        listaNombres.add("Brianne");
        listaNombres.add("Alan");

        imprimirListaString(listaNombres);
        System.out.println("Borrando.......");
        listaNombres.remove(2);
        imprimirListaString(listaNombres);

        System.out.println("Clear.......");
        listaNombres.clear();
        imprimirListaString(listaNombres);

        //System.out.println("Esta vacia? " + listaNombres.isEmpty());
        //System.out.println(listaNombres);

        //System.out.println("Ingrese una posicion ");
        //int pos = input.nextInt();
        //String nombre = listaNombres.get(pos);
        //System.out.println("El nombre es " + nombre);

        System.out.println("Ingrese un nombre");
        String unNombre = input.next();
        int posicion = listaNombres.indexOf(unNombre);
        if (posicion == -1) {
            System.out.println("Este nombre no se encuentra en la lista");
        } else {
            System.out.println(unNombre + " esta en la posicion " + posicion);
        }

    }

    public static void imprimirListaString(ArrayList<String> listaStrings) {
        if (listaStrings.isEmpty() == true) {
            System.out.println("La lista esta vacia!!");
        } else {
            System.out.println("Elementos de la lista:");
            for(int i = 0; i < listaStrings.size(); i++){
                System.out.println("**** " + listaStrings.get(i));
            }
        }

    }
}
