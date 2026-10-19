public class NodoRed {
    private int id;
    private String nombre;
    private String direccionIP;
    private String tipo;
    private boolean activo;

    //atributo estatico
    private static int totalModos = 0;

    // Constructor reuqerido
    public NodoRed(String nombre , String direccionIP , String tipo ) {
        totalModos++;
        this.id = totalModos;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.tipo = tipo;
        this.activo = false;

    }
    //METODO ESTATICO PARA CONSULTAR
    public static int getTotalNodos(){
        return totalModos;
    }

}
