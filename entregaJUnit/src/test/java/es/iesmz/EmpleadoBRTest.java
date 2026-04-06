package es.iesmz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoBRTest {

    @BeforeEach
    public void beforeEach(){
        System.out.println("EXECUTE PROVA");
    }

    //Test calculaSalarioBruto
    @Test
    public void testCalculaSalarioBruto_venedor_ventasAltas_horasExtra() {
        float real = EmpleadoBR.calculaSalarioBruto(
                TipoEmpleado.venedor, 2000.0f, 8.0f);
        float esperado = 1360.0f; // 1000 + 200 + (8*20)
        assertEquals(esperado, real, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto_venedor_ventasMedias() {
        float real = EmpleadoBR.calculaSalarioBruto(
                TipoEmpleado.venedor, 1200.0f, 0.0f);
        float esperado = 1100.0f; // 1000 + 100
        assertEquals(esperado, real, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto_venedor_sinPrima() {
        float real = EmpleadoBR.calculaSalarioBruto(
                TipoEmpleado.venedor, 500.0f, 0.0f);
        float esperado = 1000.0f;
        assertEquals(esperado, real, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto_encarregat_ventasAltas() {
        float real = EmpleadoBR.calculaSalarioBruto(
                TipoEmpleado.encarregat, 2000.0f, 0.0f);
        float esperado = 1700.0f; // 1500 + 200
        assertEquals(esperado, real, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto_tipoNull() {
        float real = EmpleadoBR.calculaSalarioBruto(
                null, 1000.0f, 5.0f);
        assertEquals(-1.0f, real, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto_ventasNegativas() {
        float real = EmpleadoBR.calculaSalarioBruto(
                TipoEmpleado.venedor, -100.0f, 2.0f);
        assertEquals(-1.0f, real, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto_horasExtraNegativas() {
        float real = EmpleadoBR.calculaSalarioBruto(
                TipoEmpleado.venedor, 1000.0f, -3.0f);
        assertEquals(-1.0f, real, 0.01);
    }


    //Test calculaSalarioNeto
    @Test
    public void testCalculaSalarioNeto_sinRetencion() {
        float real = EmpleadoBR.calculaSalarioNeto(900.0f);
        float esperado = 900.0f;
        assertEquals(esperado, real, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto_tramo16() {
        float real = EmpleadoBR.calculaSalarioNeto(1200.0f);
        float esperado = 1200.0f * 0.84f; // 16% retención
        assertEquals(esperado, real, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto_tramo18() {
        float real = EmpleadoBR.calculaSalarioNeto(1500.0f);
        float esperado = 1500.0f * 0.82f; // 18% retención
        assertEquals(esperado, real, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto_brutoNegativo() {
        float real = EmpleadoBR.calculaSalarioNeto(-500.0f);
        assertEquals(-1.0f, real, 0.01);
    }
}