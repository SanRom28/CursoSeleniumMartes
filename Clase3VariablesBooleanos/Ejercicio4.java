package Clase3VariablesBooleanos;
//package Clase3VariablesBooleanos;
//Realizar un método que retorne verdadero si el número recibido por parámetro es impar

import java.util.Scanner;

    public class Ejercicio4 {

        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese su Edad");
            int edadUsuario = input.nextInt();
            boolean edadImpar= esImpar(edadUsuario);
            if (edadImpar == true) {
                System.out.println("Su Edad es Impar");
            } else {
                System.out.println("Su Edad es Par");
            }
        }
    public static boolean esImpar (int num) {
        if (num % 2 == 1) {
            return true;
        } else {
            return false;

        }

    }

    }


