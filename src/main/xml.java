package main;

import java.io.File;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author Augusto
 */
public class xml {
    public static Vector getPerguntas()throws IOException, SAXException{
        Vector dadosAgencia=new Vector();
        try {
            DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
            DocumentBuilder db;
            db = dbf.newDocumentBuilder();
            Document doc = (Document) db.parse(new File("src/resources/perguntas.xml"));

            Element elem = doc.getDocumentElement();
            NodeList nl = elem.getElementsByTagName("pergunta");
            for (int i = 0; i < nl.getLength(); i++) {
                Element tag = (Element) nl.item(i);
                dadosAgencia.add((Object)tag.getAttribute("descricao"));
            }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(materias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dadosAgencia;
    }
    public static Vector getPerguntas(String Nivel,String Materia)throws IOException, SAXException{
        Vector dadosAgencia=new Vector();
        try {
            DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
            DocumentBuilder db;
            db = dbf.newDocumentBuilder();
            Document doc = (Document) db.parse(new File("src/resources/perguntas.xml"));

            Element elem = doc.getDocumentElement();
            NodeList nl = elem.getElementsByTagName("pergunta");
            for (int i = 0; i < nl.getLength(); i++){
                Element tag = (Element) nl.item(i);
                if(tag.getAttribute("nivel").equals(misc.limparString(Nivel)) &&  misc.limparString(tag.getAttribute("materia")).toUpperCase().equals(misc.limparString(Materia).toUpperCase())){
                    dadosAgencia.add((Object)tag.getAttribute("descricao"));
                }
            }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(materias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dadosAgencia;
    }
    
    public static perguntas getDetalhePergunta(String Pergunta)throws IOException, SAXException{
        perguntas novaPergunta=new perguntas();
        try {
            DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
            DocumentBuilder db;
            db = dbf.newDocumentBuilder();
            Document doc = (Document) db.parse(new File("src/resources/perguntas.xml"));

            Element elem = doc.getDocumentElement();
            NodeList nl = elem.getElementsByTagName("pergunta");
            for (int i = 0; i < nl.getLength(); i++){
                Element tag = (Element) nl.item(i);
                if(tag.getAttribute("descricao").equals(Pergunta)){
                    novaPergunta.setDescricao(tag.getAttribute("descricao"));
                    novaPergunta.setMateria(tag.getAttribute("materia"));
                    novaPergunta.setNivel(tag.getAttribute("nivel"));
                    NodeList listaRespostas=tag.getElementsByTagName("resposta");
                    Vector respostas=new Vector();
                    for(int j=0;j<listaRespostas.getLength();j++){
                        Element resposta=(Element)listaRespostas.item(j);                        
                        String descricao=resposta.getAttribute("descricao");
                        String correta=resposta.getAttribute("correta").toString();
                        respostas.add((Object)correta+","+descricao);
                    }
                    novaPergunta.setListaRespostas(respostas);
                }
            }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(materias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return novaPergunta;
    }
    
    public static Vector editaPergunta(perguntas perguntaOriginal,Vector perguntaEditada) throws SAXException, IOException{
        Vector dadosAgencia=new Vector();
        try {
            DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
            DocumentBuilder db;
            db = dbf.newDocumentBuilder();
            Document doc = (Document) db.parse(new File("src/resources/perguntas.xml"));

            Element elem = doc.getDocumentElement();
            NodeList nl = elem.getElementsByTagName("materia");
            for (int i = 0; i < nl.getLength(); i++) {
                Element tag = (Element) nl.item(i);
                dadosAgencia.add((Object)tag.getAttribute("descricao"));
            }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(materias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dadosAgencia;
    }
    
    public static Vector getMaterias()throws IOException, SAXException{
        Vector dadosAgencia=new Vector();
        try {
            DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
            DocumentBuilder db;
            db = dbf.newDocumentBuilder();
            Document doc = (Document) db.parse(new File("src/resources/materia.xml"));

            Element elem = doc.getDocumentElement();
            NodeList nl = elem.getElementsByTagName("materia");
            for (int i = 0; i < nl.getLength(); i++) {
                Element tag = (Element) nl.item(i);
                dadosAgencia.add((Object)tag.getAttribute("descricao"));
            }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(materias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dadosAgencia;
    }
    
}
