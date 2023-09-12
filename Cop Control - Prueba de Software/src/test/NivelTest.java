package test;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import copControl.*;
import avion.*;

import java.util.List;

public class NivelTest {

    private Nivel nivel;
    private Mapa mapa;
    private Dificultad dificultad;

    @BeforeEach
    void setUp() {
        mapa = new Mapa();
        dificultad = new Dificultad(2,2,1);
        nivel = new Nivel(mapa, dificultad);
    }

    @Test
    void testGetAvionEnPosicion() {
        Posicion posicion = new Posicion(0,0);
        Posicion posicion2 = new Posicion(100,100);
        AvionSimple avionEsperado = new AvionSimple(posicion,posicion2,mapa);
        List<Avion> avionesEnAire = mapa.getAvionesEnAire();
        avionesEnAire.add(avionEsperado);

        Avion avionObtenido = nivel.getAvionEnPosicion(posicion);

        assertEquals(avionEsperado, avionObtenido);
    }
}


