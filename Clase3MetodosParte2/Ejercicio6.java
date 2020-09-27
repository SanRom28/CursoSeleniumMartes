package Clase3MetodosParte2;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.Scanner;

public class Ejercicio6 {


 public static void main (String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el numero max permitido: ");
    int max = input.nextInt();

    System.out.println("Ingrese el mumero min permitido: " );
    int min = input.nextInt();

    System.out.println( "Ingrese otro numero : ");
    int num= input.nextInt();

    int numeroValido = validarNuemro (  "Numero Valido!!! ", "Numero fuera de rango",
     max,min,num);

 }
 public static int validarNuemro (String mensaje, String error, int maximo, int minimo,int numero) {

     Scanner input = new Scanner(System.in);
     while ((numero > maximo) || (numero < minimo)) {
     System.out.println(error);
     numero = input.nextInt();
 }
 System.out.println(mensaje);
 return numero;

}
}