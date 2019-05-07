import java.io.*;
import java.util.ArrayList;

public abstract class muroToHtml extends Muro{
    public void main(String [] arg){
        FileWriter archivo = null;
        PrintWriter pr = null;
        try {
            archivo = new FileWriter ("web.html");
            pr = new PrintWriter (archivo);
            String head = "<!doctype html><html lang=\"en\"><head><meta charset=\"UTF-8\"><title>CaraBook</title>	<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\"></head><body><div class = \"navbar\"><a>Inicio</a></div><div class = \"main\">";
            pr.println(head);
            for(Entrada entradaActual: getEntradas()){
                pr.append(entradaActual.toHtml());
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
