/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
    Date data;
    String professor;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
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


}
