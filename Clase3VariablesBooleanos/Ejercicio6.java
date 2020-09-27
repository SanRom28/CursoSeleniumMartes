package Clase3VariablesBooleanos;
//Realizar un método llamado esPrimo que reciba un número, y retorne true si solo si el
//número es primo (es divisible entre si, y la unidad)

import java.util.Scanner;

public class Ejercicio6 {
   public static void main (String args []){
       Scanner input = new Scanner(System.in);
       int num = input.nextInt();
       boolean numero = esPrimo(num);
       if (numero == true){
           System.out.println("El numero es Primo");

       }else{
           System.out.println("El numero no es primo");
       }

   }

   public static boolean esPrimo (int num) {
       int contador = 0;
       for (int i = 1; i <= num; i++) {
           if (num % i == 0) {
               contador++;
           }
       }

       if (contador == 2) {
           return true;
       } else {
           return false;
       }

   }
   }