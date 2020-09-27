package Clase5_ClasesyObjetos;

public class Persona {
    //atributos de la clase persona

    private String nombre;
    private String apellido;
    private int edad;

    private String unNombre;
    private String unApellido;
    private int unaEdad;

    //metodo constructor sin parametros

    public Persona() {
        this.nombre = "Sandra";
        this.apellido = "Romeo";
        this.edad = 51;

        //metodo constructor con parametros
    }
        public Persona(String unNombre, String unApellido, int unaEdad){
            this.nombre = unNombre;
            this.apellido = unApellido;
            this.edad = unaEdad;
        }
            public void mostrarDatosPersona() {
            System.out.println("Su nombre es " + this.nombre + " " + this.apellido + " y tiene " + this.edad + " anos ");
        }
        }
