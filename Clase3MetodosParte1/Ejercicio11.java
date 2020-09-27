package Clase3MetodosParte1;

import java.util.Scanner;

//Crear un método que reciba un entero, y muestre en pantalla la cantidad de
//dólares y de euros que representa ese número
public class Ejercicio11 {

    public static float EURO = 150;
    public static float DOLAR = 125;

    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        float pesos= input.nextFloat();
        convesrionMonedas(pesos);
    }

    public static void convesrionMonedas (float numero){
        System.out.println(numero * EURO);
        System.out.println(numero * DOLAR);
    }
}
