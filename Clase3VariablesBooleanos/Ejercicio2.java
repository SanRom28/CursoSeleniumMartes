package Clase3VariablesBooleanos;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

import java.util.Scanner;

//Dado un número, retorne verdadero si el número es menor a 0.
public class Ejercicio2 {


        public static void main (String args[]) {
            Scanner input = new Scanner(System.in);

            System.out.println("Ingrese un numero");
            int num = input.nextInt();
            boolean esMenor = MenorACero(num);
            if (esMenor == true) {
                System.out.println("El Numero es Menor a cero");
            } else {
                System.out.println("El Numero es Mayor a Cero");
            }
        }



            public static boolean MenorACero ( int num){
            if (num < 0) {
                return true;
            } else {
                return false;
            }
        }


    }
