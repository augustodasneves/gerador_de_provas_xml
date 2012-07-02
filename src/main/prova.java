/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
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

    public static void geraProva(prova provaMontada,String localPath){
         try {  
            String br=" \r\n";
            Calendar data=Calendar.getInstance();
            FileWriter arquivoProva = new FileWriter(new File(localPath+"\\prova_"+String.valueOf(data.get(Calendar.DATE))+"_"+String.valueOf(data.get(data.MONTH))+"_"+String.valueOf(data.get(data.YEAR))+".txt"));  
            arquivoProva.write("Curso: Sistemas de Informação"+br);
            arquivoProva.write("Disciplina:"+provaMontada.getMateria()+br);
            arquivoProva.write("Data:"+provaMontada.getData()+br);
            arquivoProva.write("Professor:"+provaMontada.getProfessor()+br);
            arquivoProva.write("Aluno:"+br);
            arquivoProva.write("Nota:"+br);
            arquivoProva.write(br);
            arquivoProva.write("Prova"+br);
            arquivoProva.write(br+"Assinale a alternativa correta:"+br);
            for(int i=1;i<=provaMontada.getPerguntas().size();i++){
                perguntas perguntaProva=(perguntas)provaMontada.getPerguntas().elementAt(i-1);
                arquivoProva.write(br+i+"."+perguntaProva.getDescricao()+br);
                for(int j=0;j<perguntaProva.getListaRespostas().size();j++){
                    String[] resposta=perguntaProva.getListaRespostas().elementAt(j).toString().split(",");
                    arquivoProva.write("( ) "+resposta[1]+br);
                }
            }            
            arquivoProva.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }
    
}
