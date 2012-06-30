/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Augusto
 */
public class arquivo {

    String fileName;
    String pathString;

    public String getfileName() {
        return this.fileName;
    }

    public void setfileName(String fileName) {
        this.fileName = fileName;
    }

    public String getpathString() {
        return this.pathString;
    }

    public void setpathString(String fileName) {
        this.fileName = fileName;
    }

    public void criaArquivo() {
    }

    public void leArquivoTxt(String fileName) throws IOException {
        try {
            FileReader leitor = new FileReader(fileName);
            BufferedReader armazenaArquivo = new BufferedReader(leitor);
            String valorLinha = armazenaArquivo.readLine();
            while (valorLinha != null) {
                System.out.println(valorLinha);
                valorLinha = armazenaArquivo.readLine();
            }
            armazenaArquivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
