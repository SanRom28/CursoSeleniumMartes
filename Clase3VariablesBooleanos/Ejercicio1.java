package Clase3VariablesBooleanos;


import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero!!");
        int primerNumero = input.nextInt();
        System.out.println("Ingrese el segundo  numero!!");
        int segundoNumero = input.nextInt();
        if (primerNumero==segundoNumero) {
            System.out.println("Los numeros son iguales!!!!");
        }else {
            boolean esMayor = esMayorPrimerpoQueSegundo(primerNumero, segundoNumero);
            if (esMayor == true) {
                System.out.println("El primer numero es Mayor que el segundo");
            } else {
                System.out.println("El  segundo es Mayor!!");
            }
        }
    }
    public static boolean esMayorPrimerpoQueSegundo(int num1, int num2){

        if(num1 > num2){
            return true;
        }else{
            return false;
        }

    }
}