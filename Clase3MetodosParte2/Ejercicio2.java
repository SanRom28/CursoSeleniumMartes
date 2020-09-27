package Clase3MetodosParte2;

import java.util.Scanner;

//Método llamado convertirAMillas , que reciba un entero llamado kilómetros y retorne el
//equivalente a las millas. Se debe imprimir el valor en millas en pantalla. (1 milla = 1.6
//kms)
public class Ejercicio2 {

public static final float Millas;

    static {
        Millas = (float) 1.6;
    }

    public static void main (String args[]){
    Scanner input= new Scanner (System.in);
    System.out.println("Ingrese un numero en Km: ");
    int Km= input.nextInt();
    System.out.println("El equivalente a millas es: " + convertirMillas (Km));
}

        public static float convertirMillas (int km){
        double millas = Millas * km;
        return  (float) millas;

    }




    }



