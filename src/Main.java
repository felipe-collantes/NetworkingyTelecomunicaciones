//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // --- PRUEBA PRACTICA NT3.1 NODOS DE RED
        NodoRed n1 = new NodoRed("RouterCentral", "192.168.1.1", "Router");
        NodoRed n2 = new NodoRed("SwitchCore", "192.168.1.2", "Switch");
        NodoRed n3 = new NodoRed("FirewallP", "192.168.1.3", "Firewall");
        NodoRed n4 = new NodoRed("AccessPoint", "192.168.1.4", "AP");
        NodoRed n5 = new NodoRed("ServidorDNS", "192.168.1.5", "Server");

        System.out.println("Total de nodos: " + NodoRed.getTotalNodos());

        // --- PRUEBA PRACTICA NT3.2 ROUTERS
        Router r1 = new Router("RouterPrincipal" , "192.168.1.1" , 8 );
        r1.encender();
        r1.mostrarInformacion();
        System.out.println("Total de Routers " + Router.getTotalRouters());

    }
}