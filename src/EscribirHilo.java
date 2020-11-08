
public class EscribirHilo extends Thread{

    @Override
    public void run() {
        Main.Ejecucion(getName());
    }
}
