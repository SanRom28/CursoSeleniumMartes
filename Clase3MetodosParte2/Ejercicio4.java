package Clase3MetodosParte2;
//Crear un método llamado tipoTriangulo, que dado 3 valores enteros recibidos por
//parámetro, imprima en pantalla si es escaleno, si es equilátero o isósceles.


import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio de Programa");

        System.out.println("Ingrese el valor del primer lado1");
        int lado1 = input.nextInt();

        System.out.println("Ingrese el valor del segundo lado2");
        int lado2 = input.nextInt();

        System.out.println("Ingrese el valor del tercer lado3");
        int lado3 = input.nextInt();

        int triangulo = tipoDeTriangulo(lado1,lado2,lado3);
        
    }
        public static int tipoDeTriangulo (int lado1, int lado2, int lado3 ){
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El Triangulo es Equilatero");
            } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado2) {
                System.out.println("El Triangulo es Escaleno");
            } else {
                System.out.println("El Triangulo es Isoceles");


            }


            return lado1;
        }
    }

