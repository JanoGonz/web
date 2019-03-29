

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MuroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MuroTest
{
    /**
     * Default constructor for test class MuroTest
     */
    public MuroTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void test01() {
        Muro muroNuevo = new Muro();
        EntradaTexto entrada1 = new EntradaTexto("Pepito", "Hola");
        EntradaTexto entrada2 = new EntradaTexto("Juancar", "Esos");
        EntradaFoto entrada3 = new EntradaFoto("Juanito", "https:imgur.com/yup", "SUP BROS");
        EntradaFoto entrada4 = new EntradaFoto("Jhonny", "https:gyazo.com/4y6z3ww", "FOTON");
        muroNuevo.addEntradaTexto(entrada1);
        muroNuevo.addEntradaFoto(entrada3);
        muroNuevo.addEntradaFoto(entrada4);
        muroNuevo.addEntradaTexto(entrada2);
        String resultadoEsperado = "=============== Mensajes ===============\nPepito - Hace 10 segundos\n\nHola\nNo hay comentarios\n0 me gusta\n\nJuancar - Hace 10 segundos\n\nEsos\nNo hay comentarios\n0 me gusta\n\n=============== Fotos ===============\nJuanito - Hace 10 segundos\n\nSUP BROS - https:imgur.com/yup\nNo hay comentarios\n0 me gusta\n\nJhonny - Hace 10 segundos\n\nFOTON - https:gyazo.com/4y6z3ww\nNo hay comentarios\n0 me gusta\n\n";
        String resultadoObtenido = muroNuevo.toString();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }  
}
