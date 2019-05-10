import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.io.*;

public class Muro
{
    private ArrayList<Entrada> entradas;
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        entradas = new ArrayList<Entrada>();
    }
    
    public void addEntrada(Entrada entrada)
    {
        entradas.add(entrada);
    }
    
    public String toString(){
        String contenidoMuro = "";
        for (Entrada entradaActual: entradas){
            contenidoMuro += entradaActual.toString() + "\n";
        }
        System.out.println(contenidoMuro);
        return contenidoMuro;
    }
    
    public ArrayList<Entrada> getEntradas(){
        return entradas;
    }
    
    public void muroHtml(){
        FileWriter archivo = null;
        PrintWriter pr = null;
        try {
            archivo = new FileWriter ("web.html");
            pr = new PrintWriter (archivo);
            String head = "<!doctype html><html lang=\"en\"><head><meta charset=\"UTF-8\"><title>CaraBook</title>	<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\"></head><body><div class = \"navbar\"><ul><li><a href= \"#\" class=\"logo\"><img src=\"logo.png\"></a></li><li><a href=\"#\">Inicio</a></li></ul></div><div class = \"main\">";
;
            pr.println(head);
            String contenidoEntrada = "";
            for(Entrada entradaActual: getEntradas()){
                contenidoEntrada = entradaActual.toHtml();
                pr.append(contenidoEntrada);
            }
            String bottom = "</div></body></html>";
            pr.append(bottom);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            try {
                if (null != archivo)
                    archivo.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
