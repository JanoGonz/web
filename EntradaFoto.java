import java.time.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class EntradaFoto extends Comentarios
{
    private String urlImagen;
    private String titulo;
    /**
     * Constructor for objects of class EntradaFoto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
    }
    
    public void meGustaLaEntrada()
    {
        meGusta();
    }
    
    public void addComentario(String text)
    {
        addComent(text);
    }
    
    public String getUrlImagen()
    {
        return urlImagen;
    }
    
    public String getTituloImagen()
    {
        return titulo;
    }
    
    public LocalDateTime getMomento()
    {
        return getMomentoPublicacion();
    }
    
    public String toString()
    {
        String post = super.toString() + urlImagen + "\n" + titulo + "\n";
        return post;
    }
    
    public void mostrarPorPantalla(){
        System.out.println(toString());
    }
    
    public String toHtml(){
        String stringHtml = "<div class = \"post\"><h3>" + getUsuario() + "</h3><p class = \"time\">" + getMomento() + "</p>\n";
        stringHtml += "<p>" + getTituloImagen() + "</p>\n";
        stringHtml += "<img src=\""+ getUrlImagen() + "\">";
        stringHtml += "<p>" + getMeGusta() + "<img src = \"like.png\"></p>";
        stringHtml += getComentariosHtml();
        stringHtml += "</div>";
        return stringHtml;
    }

}
