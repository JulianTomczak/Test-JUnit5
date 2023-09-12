package test;

import copControl.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class JuegoTest {

    private Juego juego;
    private Nivel nivel;
    private Jugador jugador;
    private List<Nivel> niveles;
    private Mapa mapa;

    @BeforeEach
    void setUp() {
        jugador = new Jugador("Jugador1");
        nivel = new Nivel(mapa,new Dificultad(2,2,1));
        niveles = new ArrayList<>();
        niveles.add(nivel);
        juego = new Juego(jugador, niveles);
    }

    @Test
    void estaJugandoseDeberiaRetornarTrueInicialmente() {
        assertTrue(juego.estaJugandose());
    }


}
