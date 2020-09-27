package Clase3VariablesBooleanos;
//Método que retorne verdadero si el número recibido por parámetro es mayor a 18.
// De lo contrario, se debe retornar falso.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su Edad");
        int edadUsuario = input.nextInt();
        boolean esMayor = esMayorA18(edadUsuario);
        if (esMayor == true) {
            System.out.println("El Usuario es Mayor de edad");
        } else {
            System.out.println("El Usuario es Menor de Edad");
        }
    }

    public static boolean esMayorA18(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
}

