import java.time.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class EntradaTexto extends Comentarios
{
    private String mensaje;
    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor, String texto)
    {
        super(autor);
        mensaje = texto;
    }

    public void meGustaLaEntrada()
    {
        meGusta();
    }

    public void addComentario(String text)
    {
        addComent(text);
    }

    public String getMensaje()
    {
        return mensaje;
    }

    public LocalDateTime getMomento()
    {
        return getMomentoPublicacion();
    }

    public String toString()
    {
        super.toString();
        String post = super.toString() + mensaje + "\n" ;
        return post;
    }
    public void mostrarPorPantalla(){
        System.out.println(toString());
    }
    
    public String toHtml(){
        String stringHtml = "<div class = \"post\"><h3>" + getUsuario() + "</h3><p class = \"time\">" + getMomento() + "</p>\n";
        stringHtml += "<p>" + getMensaje() + "</p>\n";
        stringHtml += "\n<p>" + getMeGusta() + "<img src = \"like.png\"></img></p>";
        stringHtml += getComentariosHtml();
        stringHtml += "</div>";
        return stringHtml;
    }
}
