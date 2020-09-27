package Clase3VariablesBooleanos;

import java.util.Enumeration;
import java.util.Scanner;

//Realizar un método que retorne verdadero si el número recibido por parámetro es impar
//y mayor a 20

        public class Ejercicio5{

        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            int num = input.nextInt();
            boolean numero = esImparMayorque20 (num);
            if (numero == true){
            System.out.println("Es Par y Mayor a 20");

        }else{
                System.out.println("Es Impar y menor a 20");
            }
        }

            public static boolean esImparMayorque20 (int num) {
            if (num % 2 == 1 && num >20) {
                return true;
            } else {
                return false;
            }

            }



            }




