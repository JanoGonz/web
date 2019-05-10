import java.time.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class EntradaEvento extends Entrada
{
    private String mensaje;
    public EntradaEvento(String autor, String texto)
    {
        super(autor);
        mensaje = texto;
    }

    public void meGustaLaEntrada()
    {
        meGusta();
    }

    public String getMensaje()
    {
        return mensaje;
    }

    public String getMomento()
    {
        return getMomentoPublicacion();
    }

    public String toString()
    {
        String post = super.toString() +mensaje + "\n";
        return post;
    }
    
        public void mostrarPorPantalla(){
        System.out.println(toString());
    }
}