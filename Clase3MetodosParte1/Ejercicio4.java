package Clase3MetodosParte1;
//Método que reciba dos números y retorne su suma

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Ingrese un mumero");
        int numero1 = imput.nextInt();
        System.out.println("Ingrese otro numero");
        int numero2 = imput.nextInt();
        int sum = suma(numero1, numero2);

        System.out.println("La suma es " + sum);

    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }
}