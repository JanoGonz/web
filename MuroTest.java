

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
    private EntradaFoto entradaF1;
    private EntradaTexto entradaT1;
    private Muro muro1;

    
    
    
    

    
    
    
    

    
    
    
    

    

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
        entradaF1 = new EntradaFoto("Autor foto", "https://i.imgur.com/fE3vtOp.jpg", "Titulo foto");
        entradaF1.addComentario("Comentario 1");
        entradaF1.addComentario("Comentario 2");
        entradaF1.meGustaLaEntrada();
        entradaF1.meGustaLaEntrada();
        entradaF1.meGustaLaEntrada();
        entradaT1 = new EntradaTexto("Autor texto", "Texto");
        entradaT1.addComentario("Comentario xd");
        entradaT1.addComentario("Comentario 2");
        entradaT1.addComentario("Comentario 3");
        entradaT1.meGustaLaEntrada();
        muro1 = new Muro();
        muro1.muroHtml();
        muro1.muroHtml();
        muro1.addEntrada(entradaT1);
        muro1.addEntrada(entradaF1);
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
}
