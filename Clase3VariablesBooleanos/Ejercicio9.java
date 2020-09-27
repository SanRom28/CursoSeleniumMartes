package Clase3VariablesBooleanos;
//Dado una año de nacimiento, retorne verdadero si la persona tiene 18 años o mas, y
//falso si han pasado menos años. Sugerencia: Usar una variable estática.

public class Ejercicio9 {
    private static int EDAD_DE_MAYORIA = 18;

    public static void main(String args[]) {
        int num = 15;
        boolean mayorDeEdad = esMayorDeEdad(num);
        if (mayorDeEdad == true) {
            System.out.println("es mayor de Edad");
        } else {
            System.out.println("es menor de Edad");
        }
    }
    public static boolean esMayorDeEdad (int num){
        if (num >=18){
            return true;
        }else{
            return false;
        }
    }


}
