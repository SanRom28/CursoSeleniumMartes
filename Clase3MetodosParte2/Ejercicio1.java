package Clase3MetodosParte2;

import java.util.Scanner;

//Dado un número, un máximo y un mínimo (recibido por parámetro), retorne verdadero si
//el número está dentro del máximo y el mínimo. Si el número se encuentra dentro del
//max y min, el método debe mostrar “El numero es valido” sino, se debe retornar, “El
//numero esta fuera de rango.”
public class Ejercicio1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero maximo:  ");
        int max = input.nextInt();
        System.out.println("Ingrese un numero minimo:  ");
        int min = input.nextInt();
        System.out.println("Ingrese un numero numero:  ");
        int num = input.nextInt();

        if (numValido(num, max, min) == true) {
            System.out.println("El numero es valido");

        } else {
            System.out.println("El numero esta fuera de ese rango");
        }
    }

    public static boolean numValido(int num, int max, int min) {
        if (num > min && num < max) {
        return true;
        } else {
            return false;

        }

    }
}