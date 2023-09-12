package test;

import avion.AvionPesado;
import copControl.Mapa;
import copControl.Posicion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pista.PistaDoble;

import static org.junit.jupiter.api.Assertions.*;

public class AvionPesadoTest {

    private AvionPesado avionPesado;
    private Mapa mapaDeMovimiento;

    @BeforeEach
    void setUp() {
        Posicion posIni = new Posicion(0, 0);
        Posicion posFin = new Posicion(100, 100);
        avionPesado = new AvionPesado(posIni, posFin, mapaDeMovimiento);
    }

    

    @Test
    void puedeAterrizar() {
        try {
            PistaDoble pista = new PistaDoble(new Posicion(5, 5));
            assertFalse(avionPesado.puedeAterrizar(pista));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
