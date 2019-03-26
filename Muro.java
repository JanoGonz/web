import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Muro
{
    private ArrayList<EntradaTexto> mensajes;
    private ArrayList<EntradaFoto> fotos;
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        ArrayList<EntradaTexto> mensajes = new ArrayList<EntradaTexto>();
        ArrayList<EntradaFoto> fotos = new ArrayList<EntradaFoto>();
    }

    public void addEntradaTexto(EntradaTexto entradaTexto)
    {
        mensajes.add(entradaTexto);
    }

    public void addEntradaFoto(EntradaFoto entradaFoto)
    {
        fotos.add(entradaFoto);
    }

    public String toString()
    {
        String contenidoMuro = "No hay entradas";
        if (mensajes != null || fotos != null)
        {
            contenidoMuro = "";
            if (mensajes != null){
                contenidoMuro += "=============== Mensajes ===============\n";
                for (EntradaTexto entrada: mensajes){
                    contenidoMuro += entrada.toString() + "\n";
                }
                contenidoMuro += "======================================\n\n";
            }
            if (fotos != null){
                contenidoMuro += "=============== Fotos ===============\n";
                for (EntradaFoto entrada: fotos){
                    contenidoMuro += entrada.toString() + "\n";
                }
                contenidoMuro += "======================================";
            }
        }
        return contenidoMuro;
    }
}
