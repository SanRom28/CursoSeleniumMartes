package Clase3MetodosParte1;
//Método que reciba dos enteros y retorne la multiplicación de la misma
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Ingrese un mumero");
        int numero1 = imput.nextInt();
        System.out.println("Ingrese oyto numero");
        int numero2 = imput.nextInt();
        int multi= multiplicar(numero1,numero2);

        System.out.println("La multiplicacion es " + multi);

    }
        public static int multiplicar (int num1,int num2){
            return num1 * num2;

        }
    }


