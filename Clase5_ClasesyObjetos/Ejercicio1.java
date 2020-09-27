package Clase5_ClasesyObjetos;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String args[]) {

        String nombrePersona =
                DatosPersonales.pedirNombrePersona();

        String apellidoPersona =
                DatosPersonales.pedirApellidoPersona();

        int edadPersona =
                DatosPersonales.pedirEdadPersona();
        System.out.println("Su nombre es " + nombrePersona + " " + apellidoPersona + " y su edad es  " + edadPersona);

        DatosPersonales.calcularAñoNaciemiento(edadPersona);

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su Sueldo");
        int sueldo = input.nextInt();

        double ivaSueldo =
                CalcularImpuestos.calcularIva(sueldo);
        double irpfSueldo =
                CalcularImpuestos.calcularIRPF(sueldo);

        System.out.println(" Su sueldo es " + sueldo);
        System.out.println(" Paga de Iva : " + ivaSueldo + " $ ");
        System.out.println(" Paga de IRPF " + irpfSueldo + " $ ");


    }


}

