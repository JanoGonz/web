import java.time.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Comentarios here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Comentarios extends Entrada
{

    private ArrayList<String> comentarios;
    /**
     * Constructor for objects of class Comentarios
     */
    public Comentarios(String usuario){
        super(usuario);
        comentarios = new ArrayList<String>(); 
    }
    
    public void addComent(String text)
    {
        comentarios.add(text);
    }
    
    public String getComentarios(){
        String comentariosTotales = "No hay comentarios\n";
        if (comentarios.size() > 0){
            comentariosTotales = "Comentarios: \n";
            for (String mensaje: comentarios){
                comentariosTotales += mensaje + "\n";
            }
        }
        return comentariosTotales;
    }
    
    public String toString(){
        String stringComentarios = super.toString() + getComentarios();
        return stringComentarios;
    }
    
    public String getComentariosHtml(){
        String comentariosHtml = "";
        comentariosHtml += "<div class = \"comentarios\">";
        for (String mensaje: comentarios){
            comentariosHtml += "<p class = \"single-comment\" href = \"#\">"+ mensaje +"</p>";
        }
        comentariosHtml += "</div>";
        return comentariosHtml;
    }
    
    public String toHtml(){
        return "aaaaaaaaa";
    }
}
