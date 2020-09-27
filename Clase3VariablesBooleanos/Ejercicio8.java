package Clase3VariablesBooleanos;
//Realizar un método llamado esMayor que reciba un número, y retorne verdadero si el
//número es mayor a 0, de lo contrario, se debe retornar falso. Luego, solicitar al usuario
//que ingrese un número. Sii es positivo, se debe imprimir: “El número es positivo”, de lo
//contrario, “El número es negativo” (Se debe utilizar el método realizado anteriormente)

import java.util.Scanner;

public class Ejercicio8 {
     public static void main (String args[]){

         Scanner input = new Scanner (System.in);
         System.out.println("Ingrese un numero");
         int num = input.nextInt();
         boolean resultado  = esMayor(num);
         System.out.println ( " El numero es mayor a cero " + resultado);

     }

    public static boolean esMayor (int num){
        if (num>0){
            return true;
        }else{
            return false;

        }
    }
}
