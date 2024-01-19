// Radio.java
public class Radio {
    private String estado;
    private String modo;
    private double frecuencia;
    private double[] preseleccion;

    public Radio() {
        this.estado = "apagado";
        this.modo = "AM";
        this.frecuencia = 530;
        this.preseleccion = new double[12];
    }

    public void encender() {
        this.estado = "encendido";
    }

    public void apagar() {
        this.estado = "apagado";
    }

    public String obtenerEstado() {
        return estado;
    }

    public void cambiarModo() {
        if (this.modo.equals("AM")) {
            this.modo = "FM";
        } else {
            this.modo = "AM";
        }
    }

    public String obtenerModo() {
        return modo;
    }

    public void sintonizarEstacion(String direccion) {
        if (this.modo.equals("AM")) {
            double paso = 10.0;
            if (direccion.equals("arriba")) {
                this.frecuencia = (this.frecuencia + paso) % 1620;
            } else if (direccion.equals("abajo")) {
                this.frecuencia = (this.frecuencia - paso + 1620) % 1620;
            }
        } else if (this.modo.equals("FM")) {
            double paso = 0.2;
            if (direccion.equals("arriba")) {
                this.frecuencia = (this.frecuencia + paso) % 108;
            } else if (direccion.equals("abajo")) {
                this.frecuencia = (this.frecuencia - paso + 108) % 108;
            }
        }
    }

    public double obtenerFrecuencia() {
        return frecuencia;
    }

    public void guardarPreseleccion(int boton) {
        preseleccion[boton - 1] = frecuencia;
    }

    public double[] obtenerPreseleccion() {
        return preseleccion;
    }

    public void seleccionarPreseleccion(int boton) {
        if (preseleccion[boton - 1] != 0) {
            this.frecuencia = preseleccion[boton - 1];
        }
    }
}
