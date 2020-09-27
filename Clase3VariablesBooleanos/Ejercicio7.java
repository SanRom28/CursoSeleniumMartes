package Clase3VariablesBooleanos;
//Realizar un método que reciba dos números enteros y retorne verdadero si la suma es
//mayor a 100. De lo contrario, debe retornar falso.

import java.util.Scanner;

public class Ejercicio7 {

    public static void main (String args[]){
        int num1= 0;
        int num2= 0;
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese primer numero");
        num1 = input.nextInt();
        System.out.println("ingrese segundo numero");
        num2 = input.nextInt();
        boolean sumo = sumaMayora100(num1,num2 );
       System.out.println("El resultado es " + sumo);


    }

    public static boolean sumaMayora100 (int num1, int num2){
        int suma = num1 + num2;
                if (suma >=100){
                    return true;

                }else
                    return false;

    }
}
