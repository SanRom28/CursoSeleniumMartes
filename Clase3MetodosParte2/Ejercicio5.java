package Clase3MetodosParte2;

import java.io.PrintStream;
import java.util.Scanner;

//Crear un método llamado factorial que reciba un número y retorne el factorial de ese
//número.
//Ej. si el número recibido es 5, se deberá retornar el siguiente valor: 5*4*3*2*1.
//Sugerencia: utilizar un acumulador.
public class Ejercicio5 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio de prograna");
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        int fact= factorial(num);
        System.out.println("El Factorial es " + factorial (num));

    }

    public static int factorial (int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;

    }
        return  fact;

}
}


