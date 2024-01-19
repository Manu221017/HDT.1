

public class RadioTest {

    @Test
    void testEncender() {
        Radio radio = new Radio();
        radio.encender();
        assertEquals("encendido", radio.obtenerEstado());
    }

    private void assertEquals(int i, double d) {
       
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    void testCambiarModo() {
        Radio radio = new Radio();
        radio.cambiarModo();
        assertEquals("FM", radio.obtenerModo());
        radio.cambiarModo();
        assertEquals("AM", radio.obtenerModo());
    }

    private void assertEquals(String string, String obtenerModo) {
        
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    void testSintonizarEstacion() {
        Radio radio = new Radio();
        radio.sintonizarEstacion("arriba");
        assertEquals(540, radio.obtenerFrecuencia());
        radio.sintonizarEstacion("abajo");
        assertEquals(530, radio.obtenerFrecuencia());

        radio.cambiarModo();  // Cambiar a FM
        radio.sintonizarEstacion("arriba");
        assertEquals((int) 88.1, radio.obtenerFrecuencia());
        radio.sintonizarEstacion("abajo");
        assertEquals((int) 87.9, radio.obtenerFrecuencia());
    }

    @Test
    void testGuardarYSeleccionarPreseleccion() {
        Radio radio = new Radio();
        radio.sintonizarEstacion("arriba");
        radio.guardarPreseleccion(1);
        assertEquals(540, radio.obtenerPreseleccion()[0]);

        radio.sintonizarEstacion("arriba");
        radio.guardarPreseleccion(2);
        assertEquals(550, radio.obtenerPreseleccion()[1]);

        radio.seleccionarPreseleccion(1);
        assertEquals(540, radio.obtenerFrecuencia());

        radio.seleccionarPreseleccion(2);
        assertEquals(550, radio.obtenerFrecuencia());
    }
}
