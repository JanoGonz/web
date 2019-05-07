import java.time.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Entrada
{
    // instance variables - replace the example below with your own
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;

    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(String usuario)
    {
        this.usuario = usuario;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0; 
    }

    public void meGusta()
    {
        cantidadMeGusta++;
    }

    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }

    public String getUsuario(){
        return usuario;
    }

    public int getMeGusta(){
        return cantidadMeGusta;
    }
    
    public String toString(){
        String detallesEntrada = usuario + "\n" + "Hace 10 minutos" + "\n" + cantidadMeGusta + "\n";
        return detallesEntrada;
    }
    
    public String toHtml(){
        return "aaaaaaaaaaaaaaaaaa";
    }
}
