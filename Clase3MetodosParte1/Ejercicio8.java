package Clase3MetodosParte1;
//Crear un método que retorne verdadero si y sólo si el número es par,
// e lo contrario, debe retornar falso.
        import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        if (esPar(num) == true) {
            System.out.println("El numero es par");
        } else {
            System.out.println("eL numero es impar");
        }
    }
    public static boolean esPar(int num){

            if (num % 2 == 0) {
            return true;
            } else {
                return false;

            }
        }
    }


