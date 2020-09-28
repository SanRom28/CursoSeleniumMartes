package Clase5_ClasesyObjetos;

public class Producto {

    //Atributos
    private String nombre;
    private int codigo;
    private String nroLote;
    private boolean esImportado;
    private int nroProducto;

    //es una variable de la clase Producto (static)

    private static int CONTADOR_PRODUCTO = 0;

    //Contructor sin parametros
    public Producto() {
        this.nombre = "desconocido";
        this.codigo = 0;
        this.nroLote = "desconocido";
        this.esImportado = false;
        CONTADOR_PRODUCTO = CONTADOR_PRODUCTO + 1;
        this.nroProducto = CONTADOR_PRODUCTO;

    }


    public Producto(String unNombre, int unCodigo, String lote, boolean importado, int producto) {
        this.nombre = unNombre;
        this.codigo = unCodigo;
        this.nroLote = lote;
        this.esImportado = importado;
        CONTADOR_PRODUCTO = CONTADOR_PRODUCTO + 1;
        this.nroProducto = CONTADOR_PRODUCTO;
    }

    //setters y getters....
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setCodigo(int unCodigo) {
        this.codigo = unCodigo;

    }
    public int getCodigo(){
        return this.codigo;

    }
    public void setEsImportado (boolean esImportado){
        this.esImportado= esImportado;
    }
    public boolean getEsImportado(){
        return this.esImportado;

    }
    public String toString() {
        String textoAImprimir = "El producto" + this.nombre + " y codigo" + this.codigo;
        if (this.esImportado == true){
            textoAImprimir += "Es Importado.";
        }else{
            textoAImprimir += " es Nacional.";
        }
        textoAImprimir += "Su lote es " + this.nroLote + " y el nro producto es" + this.nroProducto;
        return textoAImprimir;

    }
}
