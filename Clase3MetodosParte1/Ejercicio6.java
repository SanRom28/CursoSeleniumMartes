package Clase3MetodosParte1;
//Realizar un método que reciba dos números y retorne el mayor ambos

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio de Programa");
        System.out.println("Ingrese un numero ");
        int unNumero = input.nextInt();
        System.out.println("Ingrese otro  numero!!");
        int otroNumero = input.nextInt();
        int mayor = obtenerMayor(unNumero,otroNumero);
        System.out.println("El mayor numero es" + mayor);

        System.out.println("Fin de Programa!!!");

        }
        public static int obtenerMayor(int numero1, int numero2){
        if ( numero1> numero2 ) {
            return numero1;
        } else {
            return numero2;

        }
    }

        }


