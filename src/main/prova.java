/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

/**
 *
 * @author Augusto
 */
public class prova{
    Vector perguntas;
    Integer nivel;
    String materia;
    String data;
    String professor;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Vector getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(Vector perguntas) {
        this.perguntas = perguntas;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public static void geraProva(prova provaMontada){
         try {  
            FileWriter arquivo = new FileWriter(new File("Arquivo.txt"));  
            arquivo.write("teste");  
            arquivo.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }
    
}
