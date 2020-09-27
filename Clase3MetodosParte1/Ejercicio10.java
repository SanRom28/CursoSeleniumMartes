package Clase3MetodosParte1;

import java.util.Scanner;

//Crear un método que permita reciba el alto y ancho de un paralelogramo tipo, y retorne su area.
public class Ejercicio10 {

    public static void main(String args[]) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Ingrese el alto ");
        float alto = imput.nextFloat();
        System.out.println("Ingrese el ancho ");
        float ancho = imput.nextFloat();
        System.out.println("El area del paralelogramo es " + areaParalelogramoTipo(alto, ancho));

    }

    public static float areaParalelogramoTipo(float alto, float ancho) {

        float area = alto * ancho;
        return area;


    }

}