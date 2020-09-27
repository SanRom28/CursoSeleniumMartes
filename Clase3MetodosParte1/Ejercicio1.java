package Clase3MetodosParte1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Inicio del programa!!! ");
        System.out.println("Ingrese un mumero");

        int numero = imput.nextInt();
        int doble = obtenerDoble(numero);
        System.out.println("El doble de " + numero + " es " + doble);
        System.out.println("Fin del programa");
    }

    public static int obtenerDoble(int num) {
        System.out.println("Entre a la funcion obtenerDoble");
        return num * 2;

    }
}