package Clase6EjerciciosClase;

import java.util.Scanner;

public class EjerciciosConArreglos {

    public static void main(String[] args) {


        // System.out.println("Datos del array");


        // System.out.println("Ingrese el largo del arreglo");
        // int unLargo = input.nextInt();
        //  String [] nombreAlumnos = crearArregloString(unLargo);

        //  System.out.println("El largo del arreglo de alumnos es " + nombreAlumnos.length);


        //imprimirArreglo(edades); // i;

        Scanner input = new Scanner(System.in);

        int[] edades = new int[5];
        double[] temperatura = new double[10];
        String[] diasSemana = new String[7];
        String[] meses = new String[12];

        System.out.println("Datos del array");
        edades[2] = 19;
        edades[3] = 22;
        diasSemana[0] = "Domingo";
        diasSemana[1] = "Lunes";
        diasSemana[2] = "Martes";
        diasSemana[3] = "Miercoles";
        diasSemana[4] = "Jueves";
        diasSemana[5] = "Viernes";
        diasSemana[6] = "Sabado";
        System.out.println("****** DIAS SEMANA  *********");

        imprimirArreglo(diasSemana);
        System.out.println("****** EDADES *********");

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Ingrese una edad");
            edades[i] = input.nextInt();
        }

        for (int i = 0; i < edades.length; i++) {
            System.out.println(" Posicion " + i + " es " + edades[i]);
        }


    }

    public static void imprimirArreglo(String[] arreglo) {
        for (int pos = 0; pos < arreglo.length; pos++) {
            System.out.println("La posicion " + pos + " es " + arreglo[pos]);

        }

    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int pos = 0; pos < arreglo.length; pos++) {
            System.out.println("La posicion " + pos + " es " + arreglo[pos]);

        }
    }
}

     gis



    /*public static String [] crearArregloString (int largo){
        String [] arregloStrings = new String[largo];
        return arregloStrings;
    }

    public static Double [] crearArregloDouble (int largo){
        Double [] arregloDouble = new Double[largo];
        return arregloDouble;










