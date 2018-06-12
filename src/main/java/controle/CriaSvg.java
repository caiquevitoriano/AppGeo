/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import com.vividsolutions.jts.geom.Geometry;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author caique
 */
public class CriaSvg {
    
    private final File arquivo;
    
    public CriaSvg() throws IOException {

     arquivo = new File("Saida.svg");

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
        
    } 
     
    public void criaArquivo(String svg2, String svg4) throws IOException {     

        FileWriter fw = new FileWriter(arquivo, false);
        PrintWriter pw = new PrintWriter(fw);
        String svg1 =    "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n\n" +                       
                        "<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n\n" +
                        "<svg xmlns=\"http://www.w3.org/2000/svg\"\n" +
                        "	xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"200\" height=\"200\" viewBox=\"";
      
        String svg3 =   "\">\n" +
                        "\n" +
                        "	<path d=\"";
        
        String svg5 =   "\"\n" +
                        "		stroke=\"blue\" stroke-width=\"0.01\"\n" +
                        "		fill=\"blue\" fill-opacity=\"0.5\"/>\n" +
                        "	\n" +
                        "	<path d=\"";
        
        
        
        
        
        
        
        

     
    
    
}
}