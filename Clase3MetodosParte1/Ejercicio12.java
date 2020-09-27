package Clase3MetodosParte1;

import java.util.Scanner;

//Realizar un método llamado calcularIva , que calcule el IVA (22%) dado un
//número float llamado sueldo, recibido por parámetro. Sugerencia: utilizar
//variables estáticas.
public class Ejercicio12 {

    public static final int IVA = 22;
    public static void main (String args[]){
        Scanner input = new Scanner (System.in);

        System.out.println("Ingrese el sueldo");
        float sueldo = input.nextFloat();

        System.out.println("El IVA de su sueldo es de " + calcularIva (sueldo));
    }
        public static float calcularIva (float sueldo){
        float calculo = IVA * sueldo / 100;
        return calculo;

        }
}
