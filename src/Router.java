public class Router {
    //atributos Privados
    private int id;
    private String nombre;
    private String direccionIP;
    private int cantidadPuertos;
    private boolean activo;

    // Atributo estatico compratido
    private static int totalRouters = 0;
    // Constructor requerido
    public Router(String nombre , String direccionIP, int cantidadPuertos ){
        totalRouters++;
        this.id = totalRouters;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.cantidadPuertos = cantidadPuertos;
        this.activo = false;

    }
    // Metodos solicitados
    public void encender() {
        this.activo = false;
        System.out.println("El router " + id + " ha sido encendido");


    }
    public void apagar() {
        this.activo = false;
        System.out.println("El router " + nombre + " ha sido apagado.");
    }

    public void mostrarInformacion() {
        System.out.println("Router ID: " + id + " | Nombre: " + nombre + " | IP: " + direccionIP + " | Puertos: " + cantidadPuertos + " | Activo: " + activo);
    }

    // Método estático para consultar el total de routers
    public static int getTotalRouters() {
        return totalRouters;
    }
}
