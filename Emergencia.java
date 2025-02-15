public class Emergencia {
    private final String tipo;
    private final String ubicacion;
    private final int nivelGravedad; // 1-bajo ; 2- medio , 3- alto Todo:pasar a enum
    private final int tiempoRespuesta; // minutos

    public Emergencia(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.nivelGravedad = nivelGravedad;
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getNivelGravedad() {
        return nivelGravedad;
    }

    public int getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    @Override
    public String toString() {
        return "Emergencia [ Tipo=" + tipo + ", Ubicación=" + ubicacion + ", Nivel de gravedad=" + nivelGravedad
                + ", Tiempo de respuesta=" + tiempoRespuesta + "]";
    }

    
    
}
