public class AccidenteVehicular extends Emergencia implements Responder {

    public AccidenteVehicular(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super(tipo, ubicacion, nivelGravedad, tiempoRespuesta);
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("Llegando la ambulancia.");
    }

    @Override
    public void evaluarEstado() {
        System.out.println("Revisar signos vitáles del involucrado.");
    }

}
