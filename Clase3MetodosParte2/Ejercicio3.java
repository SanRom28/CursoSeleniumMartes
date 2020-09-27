package Clase3MetodosParte2;
//Crear un método que retorne la suma de los números pares entre 1 y n, siendo n un parámetro.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String args []){
        Scanner input = new Scanner (System.in);
        System.out.println( "Ingrese un numero");
        int num = input.nextInt();
        System.out.println("La suma de los numeros pares entre 1 y : " + "el numero ingresado es de " +
                sumaNumPares(num));
    }
        public static int sumaNumPares ( int num){
        int suma = 0;
        for ( int i=1; i<num; i++){
            if (i%2==0){
                suma=suma+i;
            }
        }
        return suma;
    }
}
