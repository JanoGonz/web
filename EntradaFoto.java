import java.time.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class EntradaFoto
{
    private String usuario;
    private String urlImagen;
    private String titulo;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;
    /**
     * Constructor for objects of class EntradaFoto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        usuario = autor;
        urlImagen = url;
        this.titulo = titulo;
        ArrayList<String> comentarios = new ArrayList<String>();
        cantidadMeGusta = 0;
        momentoPublicacion = LocalDateTime.now();
    }
    
    public void meGusta()
    {
        cantidadMeGusta++;
    }
    
    public void addComentario(String text)
    {
    }
    
    public String getUrlImagen()
    {
        return urlImagen;
    }
    
    public String getTituloImagen()
    {
        return titulo;
    }
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    public String toString()
    {
        return "";
    }
}
