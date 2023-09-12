package test;

import avion.AvionComputarizado;
import copControl.Mapa;
import pista.PistaDoble;
import copControl.Posicion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AvionComputarizadoTest {
    private Mapa mapa;
    private AvionComputarizado avion;

    @BeforeEach
    public void setUp() {
        mapa = new Mapa();
        avion = new AvionComputarizado(new Posicion(0, 0), mapa);
    }

    @Test
    public void testPuedeAterrizar() {
        try {
            PistaDoble pista = new PistaDoble(new Posicion(5, 5));
            assertTrue(avion.puedeAterrizar(pista));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
