//Ejercicio1

package Clase5_ClasesyObjetos;

import java.util.Scanner;

public class DatosPersonales {

    public static String pedirNombrePersona() {
        Scanner input = new Scanner(System.in);
        System.out.println(" Ingrese su Nombre");
        String nombre = input.next();
        return nombre;

    }

    public static String pedirApellidoPersona() {
        Scanner input = new Scanner(System.in);
        System.out.println(" Ingrese su Apellido");
        String apellido = input.next();
        return apellido;
    }

    public static int pedirEdadPersona() {
        Scanner input = new Scanner(System.in);
        System.out.println(" Ingrese su Edad");
        int edad = input.nextInt();
        return edad;
    }
    public static void calcularAñoNaciemiento(int edad){
        int año = 2020 - edad;
        System.out.println( " Nacio en el año " + año);
    }
}