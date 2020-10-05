package Clase6EjerciciosClase;

import java.util.Scanner;

public class EjerciciosClaseConsulta {


    public static void main (String args []){
        Scanner input = new Scanner(System.in);
        int [] arregloNumeros = new int [5];

        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese un numero");
            arregloNumeros[i] = input.nextInt();
        }

        procesarNumeros(arregloNumeros);
    }

    public static void procesarNumeros(int [] unArreglo){
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        for (int i = 0; i < unArreglo.length; i++){
            if (unArreglo[i] < 0) {
                contadorNegativos++;
            } else if (unArreglo[i] > 0){
                contadorPositivos++;
            } else {
                contadorCeros++;
            }
        }

        System.out.println("La cantidad de positivos es " + contadorPositivos);
        System.out.println("La cantidad de negativos es " + contadorNegativos);
        System.out.println("La cantidad de ceros es " + contadorCeros);
    }



}
