package Clase5_ClasesyObjetos;


import java.util.Scanner;

public class GestionProducto {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Producto prod1 = new Producto();
        System.out.println(prod1);
        prod1.setNombre("Harina");
        prod1.setCodigo(4000);
        prod1.setEsImportado(true);
        System.out.println(prod1);

        System.out.println("*************");

        System.out.println("Ingrese el nombre del producto");
        String nombreProd = input.nextLine();


        Producto prod2 = new Producto(nombreProd, 1000, " ARS-500 ", false, 90);
        System.out.println(prod2);
        Producto prod3 = new Producto();
        Producto prod4 = new Producto();
        System.out.println(prod3);
        System.out.println(prod4);

        Producto prod;
        int salir = 1;

        while (salir != 0){
            prod = new Producto();
            System.out.println("Se ha creado un nuevo producto" );
            System.out.println(prod);
            System.out.println("Si desea terminar el programa, ingrese 0");
            salir = input.nextInt ();
        }
    }
}
