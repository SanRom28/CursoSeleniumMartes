package Clase3MetodosParte1;
//Crear un método que reciba un número entero n, y muestre en pantalla la suma
//desde 1 hasta ese número n. Ej. Si n es 4, se debe mostrar en pantalla 10

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio de Programa");
        System.out.println("Ingrese un numero ");
        int unNumero = input.nextInt();
        sumatoria(unNumero);


        System.out.println("Fin de Programa!!!");
    }

    public static void sumatoria(int n) {
        int suma = 0;
        if (n < 0) {
            System.out.println("Debe ingresar un numero positivo");
        } else {
            for (int i = 1; i <= n; i++) {
                suma = suma + i;

            }

            System.out.println("La sumatoria de 1 hasta " + n + "es: " + suma);
        }
    }
}