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
        mensajes = new ArrayList<EntradaTexto>();
        fotos = new ArrayList<EntradaFoto>();
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
        if (mensajes.size() > 0 || fotos.size() > 0)
        {
            contenidoMuro = "";
            if (mensajes.size() == 0){
                contenidoMuro += "=============== Mensajes ===============\n";
                for (EntradaTexto entrada: mensajes){
                    contenidoMuro += entrada.toString() + "\n";
                }
                contenidoMuro += "======================================\n\n";
            }
            if (fotos.size() == 0){
                contenidoMuro += "=============== Fotos ===============\n";
                for (EntradaFoto entrada: fotos){
                    contenidoMuro += entrada.toString() + "\n";
                }
                contenidoMuro += "======================================";
            }
        }
        System.out.println(contenidoMuro);
        return contenidoMuro;
    }
}
