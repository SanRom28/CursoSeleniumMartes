package Clase3MetodosParte2;

import java.util.Scanner;

//Crear un método llamado valorAbsoluto, que reciba un número y retorne el valor
//absoluto del mismo. Ej. si se recibe un -4, el método debe retornar 4.
public class Ejercicio7 {


public static void main (String arg[]){
    Scanner input = new Scanner (System.in);
    int num= input.nextInt();
    System.out.println("El valor absoluto es " + valorAbsoluto(num));
}
public static int valorAbsoluto (int num) {
    if (num < 0) {
        return num * (-1);
    }
    return num;
}
}