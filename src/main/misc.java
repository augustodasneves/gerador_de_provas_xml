/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.Normalizer;

/**
 *
 * @author Augusto
 */
public class misc {
    public static String limparString(String nome)     {  
    nome = nome.replaceAll(" ","_");  
    nome = Normalizer.normalize(nome, Normalizer.Form.NFD);  
    nome = nome.replaceAll("[^\\p{ASCII}]", "");  
    return nome;  
}  
}
