package Clase3VariablesBooleanos;
//Dado un número, un máximo y un mínimo (recibido por parámetro), retorne verdadero si
//el número está dentro del máximo y el mínimo. Si el número se encuentra dentro del
//max y min, el programa debe mostrar “El número es válido” sino, se debe retornar, “El
//numero esta fuera de rango.”

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Ingrese un numero minimo");
        int minimo = input.nextInt();

        System.out.println(" Ingrese un numero maximo");
        int maximo = input.nextInt();

        System.out.println(" Ingrese un numero ");
        int numero = input.nextInt();

        boolean esNumeroValido = numeroDentroDeRango(numero, maximo, minimo);
        if (esNumeroValido) {
            System.out.println("Es un numero valido");
        } else {
            System.out.println("No es un nmumero valido");
        }

    }

    public static boolean numeroDentroDeRango(int num, int max, int min) {

        if (num <= max && min >= num) {
            return true;
        } else {
            return false;

        }
    }
}