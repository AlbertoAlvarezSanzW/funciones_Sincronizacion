
public class EscribirHilo extends Thread{

    @Override
    public void run() {
        // llamada a la la clase principal con el metodo ejecución
        Main.Ejecucion(getName());
    }
}
