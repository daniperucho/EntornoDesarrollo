package es.iesmz.tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiasLluviaTest {

    @Test
    void testRegistroDiaCorrecto() {
        DiasLluvia d = new DiasLluvia();
        assertTrue(d.registroDia(5, 3, true));
        assertTrue(d.consultarDia(5, 3));
    }

    @Test
    void testRegistroDiaInvalido() {
        DiasLluvia d = new DiasLluvia();
        assertFalse(d.registroDia(32, 1, true));
        assertFalse(d.registroDia(10, 13, true));
    }

    @Test
    void testRegistroDiaFallido(){
        DiasLluvia d = new DiasLluvia();
        assertNotEquals(true, d.registroDia(40, 5, true));
    }

    @Test
    void testConsultarDiaNoRegistrado() {
        DiasLluvia d = new DiasLluvia();
        assertFalse(d.consultarDia(10, 2));
    }

    @Test
    void testContarDiasLluviosos() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(1, 1, true);
        d.registroDia(2, 1, true);
        d.registroDia(3, 1, false);
        assertEquals(2, d.contarDiasLluviosos());
    }
    @Test
    void testContarDiasLluviosos2(){
        DiasLluvia d = new DiasLluvia();
        d.registroDia(1, 1, false);
        d.registroDia(2, 1, false);
        assertEquals(0, d.contarDiasLluviosos());
    }
    @Test
    void testContarDiasLluviososFallido() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(1, 1, true);
        assertNotEquals(0, d.contarDiasLluviosos());
    }

    @Test
    void testConsultarDiaFallido() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(5, 3, true);
        assertNotEquals(true, d.consultarDia(6, 3));
    }

    @Test
    void testTrimestreLluvioso() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(1, 1, true);  // trimestre 1
        d.registroDia(1, 4, true);  // t2
        d.registroDia(2, 4, true);  // t2
        assertEquals(2, d.trimestreLluvioso());
    }

    @Test
    void testTrimestreLluvioso2() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(1, 7, true);
        d.registroDia(2, 7, true);
        assertEquals(2, d.trimestreLluvioso());
    }
    @Test
    void testTrimestreLluviosoFallido(){
        DiasLluvia d = new DiasLluvia();
        d.registroDia(1, 1, true);
        assertNotEquals(5, d.trimestreLluvioso());
    }


    @Test
    void testPrimerDiaLluvia() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(10, 1, true);
        d.registroDia(5, 1, true);
        assertEquals(5, d.primerDiaLluvia());
    }

    @Test
    void testPrimerDiaLluviaNinguno() {
        DiasLluvia d = new DiasLluvia();
        assertEquals(0, d.primerDiaLluvia());
    }

    @Test
    void testPrimerDiaLluviaFallido(){
        DiasLluvia d = new DiasLluvia();
        d.registroDia(10, 1, true);
        assertNotEquals(3, d.primerDiaLluvia());
    }
}
