


public class Main {

    public static void main(String[] args){

        final int MAXIMO = 10;

        for (int i =0; i < MAXIMO; i++){
            EscribirHilo hilo = new EscribirHilo();
            hilo.setName("Hilo: "+i);
            hilo.start();

        }
    }

    public synchronized static void Ejecucion(String nombreHilo){
        try {
            System.out.println(nombreHilo+" esta escribiendose en la base de datos");
            Thread.sleep(1000);
            System.out.println(nombreHilo+" ha terminado en la base de datos.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
