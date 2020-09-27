package Clase3MetodosParte1;

import java.util.Scanner;

public class Ejercicio5 {
//Método que reciba un número entero y un número double, y retorne su mutiplicación

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un mumero");
        int num1 = input.nextInt();
        System.out.println("Ingrese otro numero");
        double num2 = input.nextDouble();
        double num =  mostrarDoble(num2);
        System.out.println("el doble del numero ingresado" + num);
        System.out.println("resultado de los dos numeros ingresado" + multiplicacion(num1,num));
        int num3 = input.nextInt();
        System.out.println("Llegaste el resultado" + resultado(num1,num3));


    }

    public static double mostrarDoble(double num2) {
        double num = num2 * 2;
        return num;
    }


    public static double multiplicacion(int num1, double num) {

        return num1 * num;
    }

    public static int resultado(int num1, int num3) {

        return num1 * num3;

    }


}






