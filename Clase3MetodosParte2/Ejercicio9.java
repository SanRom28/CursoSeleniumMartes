package Clase3MetodosParte2;
//Realizar un método llamado calcularPromedio , que solicite el ingreso de números
//hasta que se ingrese 0, y que calcule el promedio de los mismos. Se debe utilizar el
//método ingresarNumero.

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String args []){
        System.out.println( "El Promedio es " + calcularPromedio());
    }
    public static float calcularPromedio (){
        int contador = 0;
        int suma = 0;
        int num = ingresarNumero ( "Ingrese Numero");
        while (num!=0){
            contador ++;
            suma=suma+num;
            num = ingresarNumero ("Ingrese otro Numero");

        }
        if (contador >0){
            return (float)suma/contador;

        }else{
            return 0;
        }
    }
    public static int ingresarNumero (String mensaje){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        int num = input.nextInt();
        return num;

    }
}
