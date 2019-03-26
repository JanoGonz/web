import java.time.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;


public class EntradaTexto
{
    // instance variables - replace the example below with your own
    private String usuario;
    private String mensaje;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor, String texto)
    {
        usuario = autor;
        mensaje = texto;
        comentarios = new ArrayList<String>();
        cantidadMeGusta = 0;
        momentoPublicacion = LocalDateTime.now();
    }
    
    public void meGusta()
    {
        cantidadMeGusta++;
    }
    
    public void addComentario(String text)
    {
        comentarios.add(text);
    }
    
    public String getMensaje()
    {
        return mensaje;
    }
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    public String toString()
    {
        String post = "";
        post += usuario + " - ";
        Period period = Period.between(momentoPublicacion.toLocalDate(), LocalDate.now());
        Duration dateAgo = Duration.between(momentoPublicacion, LocalDateTime.now());
        if (dateAgo.toMinutes() < 60){
            post += "Hace " + dateAgo.toMinutes() + " minutos\n\n";
        } else {
            if (dateAgo.toHours() < 24){
                post += "Hace " + dateAgo.toHours() + " horas\n\n";
            } else {
                post += "Hace " + period.getDays() + " días\n\n";
            }
        }
        post += mensaje + "\n--------------------------\n";
        if (comentarios == null) {
           post += "No hay comentarios\n";
        } else {
            post += "Comentarios:\n";
            for (String mensaje: comentarios){
                post += mensaje + "\n";
            }
        }
        post += "--------------------------------------\n";
        post += cantidadMeGusta + " me gusta";
        System.out.println(post);
        return post;
    }
}
