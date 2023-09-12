package test;

import avion.*;
import copControl.Mapa;
import copControl.Posicion;
import pista.PistaDoble;
import pista.PosicionesEntradaVaciaException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PistaDobleTest {

    private PistaDoble pistaDoble;
    private AvionSimple avionSimple;
    private AvionPesado avionPesado;
    private AvionComputarizado avionComputarizado;
    private Helicoptero helicoptero;
    private Mapa mapa;

    @BeforeEach
    void setUp() throws PosicionesEntradaVaciaException {
        Posicion posicionEntrada = new Posicion(10, 10);
        pistaDoble = new PistaDoble(posicionEntrada);
        avionSimple = new AvionSimple(new Posicion(5, 5), new Posicion(15, 15), mapa);
        avionPesado = new AvionPesado(new Posicion(5, 5), new Posicion(15, 15), mapa);
        avionComputarizado = new AvionComputarizado(new Posicion(5, 5), mapa);
        helicoptero = new Helicoptero(new Posicion(5, 5), new Posicion(15, 15), mapa);
    }

    @Test
    void puedeAterrizarDeberiaPermitirAvionSimple() {
        assertTrue(pistaDoble.puedeAterrizar(avionSimple));
    }

    @Test
    void puedeAterrizarNoDeberiaPermitirAvionPesado() {
        assertFalse(pistaDoble.puedeAterrizar(avionPesado));
    }

    @Test
    void puedeAterrizarDeberiaPermitirAvionComputarizado() {
        assertTrue(pistaDoble.puedeAterrizar(avionComputarizado));
    }

    @Test
    void puedeAterrizarNoDeberiaPermitirHelicoptero() {
        assertFalse(pistaDoble.puedeAterrizar(helicoptero));
    }

}
