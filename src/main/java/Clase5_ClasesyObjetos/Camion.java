package Clase5_ClasesyObjetos;

public class Camion {

    private String color;
    private int chapa;

    public Camion(){
        this.color = "Blanco";
        this.chapa = 111111;
    }
    //Contructor con parametros

    public Camion (String unColor, int unaChapa){
        this.color = unColor;
        this.chapa= unaChapa;
    }

    public void setChapa (int unaChapa){
        this.chapa = unaChapa;
    }
    public int getChapa(){
        return this.chapa;
    }
    public String toString (){
        return "El color del camion es " + this.color + " y su chapa es " + this.chapa;
    }
}
