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
        this.nombre = "Desconocido";
        this.apellido = "";
        this.edad = 0;

    }

    public Persona (String unApellido){
        this.nombre = " ";
        this.apellido = unApellido;
        this.edad = 0;


        //metodo constructor con parametros
    }
        public Persona(String unNombre, String unApellido, int unaEdad){
            this.nombre = unNombre;
            this.apellido = unApellido;
            this.edad = unaEdad;
        }

        public String getNombre (){
          return this.nombre;
        }
        public void setNombre (String unNombre){
          this.nombre = unNombre;
        }
        public String getApellido (){
        return this.apellido;
        }
        public void setApellido (String unApellido){
        this.apellido = unApellido;
        }
        public int getEdad (){
        return this.edad;
        }

    public void setEdad(int unaEdad) {
        this.edad=unaEdad;
    }

   //public void mostrarDatosPersona() {
           // System.out.println("Su nombre es " + this.nombre + " " + this.apellido + " y tiene " + this.edad + " anos ");


        private boolean esMayorDeEda() {
            if (this.edad >= 18) {
                return true;
            } else {
                return false;
            }
        }

        public String toString(){
          String retorno = "Su nombre es " + this.nombre + " " +
            this.apellido + " y tiene " + this.edad + " anos " ;
          if (this.esMayorDeEda()== true) {
              retorno = retorno +  " La persona es mayor de edad ";
          }else{
              retorno = retorno + " La persona NO es mayor de edad ";
          }
           return retorno;

        }
        }
