package Clase5_ClasesyObjetos;

public class GestionPersonas {

    public static void main(String args[]) {

    /*   String nombrePersona =
                DatosPersonales.pedirNombrePersona();

        String apellidoPersona =
                DatosPersonales.pedirApellidoPersona();

        int edadPersona =
                DatosPersonales.pedirEdadPersona();
 //creacion del objeto persona en memoria
        //se llama el objeto persona 1

        Persona persona1 = new Persona(nombrePersona,apellidoPersona,edadPersona);
        System.out.println( "Datos de la Persona 1");
        persona1.mostrarDatosPersona();

        String nombrePersona2 = DatosPersonales.pedirNombrePersona();
        String apellidoPersona2 = DatosPersonales.pedirApellidoPersona();
        int edadPersona2 = DatosPersonales.pedirEdadPersona();

        Persona persona2 = new Persona(nombrePersona2,apellidoPersona2,edadPersona2);



        System.out.println( "Datos de la Persona 1");
        persona1.mostrarDatosPersona();
        System.out.println( "Datos de la Persona 2");
        persona2.mostrarDatosPersona();

 */
        Persona persona3 = new Persona();

        System.out.println("Datos de la Persona 3 Antes de Modificar");
        System.out.println(persona3.getNombre());
        System.out.println(persona3.getApellido());
        System.out.println(persona3.getEdad());


        persona3.setNombre("Carlos");
        persona3.setApellido("Reino");
        persona3.setEdad(16);
        System.out.println("Datos de la Persona 3 Despues de Modificar");
        System.out.println(persona3.getNombre());
        System.out.println(persona3.getApellido());
        System.out.println(persona3.getEdad());


        // System.out.println(persona1);
        // System.out.println( persona2);
        System.out.println(persona3);


    }
}