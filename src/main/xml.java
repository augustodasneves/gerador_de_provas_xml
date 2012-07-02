package main;

import java.io.File;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
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
    
    public static void editaPergunta(perguntas perguntaOriginal,perguntas perguntaEditada) throws IOException, XPathExpressionException, TransformerConfigurationException, TransformerException, SAXException{
          try {
            //Carrega XML já salvo em disco
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db;
            db = dbf.newDocumentBuilder();
            Document doc = (Document) db.parse(new File("src/resources/perguntas.xml"));
            Element root = doc.getDocumentElement();
            //Procura o nodo selecionado
            NodeList nl = root.getElementsByTagName("pergunta");
            //Alterar elemento
            Element oldChild = (Element) nl.item(0);
            Element newChild = (Element) nl.item(0);
            newChild.setAttribute("descricao", perguntaEditada.getDescricao().toString());            
            newChild.setAttribute("materia", perguntaEditada.getMateria().toString());            
            newChild.setAttribute("nivel", perguntaEditada.getNivel().toString());            
            NodeList respostasOld=newChild.getElementsByTagName("resposta");
            NodeList respostasNew=newChild.getElementsByTagName("resposta");
            for(int i=0;i<respostasNew.getLength();i++){
                Element resposta=(Element)respostasNew.item(i);
                String[] dadosResposta=perguntaEditada.getListaRespostas().elementAt(i).toString().split(",");
                resposta.setAttribute("correta", dadosResposta[0]);
                resposta.setAttribute("descricao", dadosResposta[1]);
                newChild.replaceChild(respostasNew.item(i),respostasOld.item(i));
            }
            root.removeChild(oldChild);
            root.appendChild(newChild);
            //Grava XML
            TransformerFactory tranFactory = TransformerFactory.newInstance(); 
            Transformer aTransformer = tranFactory.newTransformer(); 
            Source src = new DOMSource(doc); 
            Result dest = new StreamResult(new File("src/resources/perguntas.xml")); 
            aTransformer.transform(src, dest); 
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(xml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void removePergunta(perguntas pergunta) throws IOException, XPathExpressionException, TransformerConfigurationException, TransformerException, SAXException{
          try {
            //Carrega XML já salvo em disco
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db;
            db = dbf.newDocumentBuilder();
            Document doc = (Document) db.parse(new File("src/resources/perguntas.xml"));
            Element root = doc.getDocumentElement();
            //Procura o nodo selecionado
            NodeList nl = root.getElementsByTagName("pergunta");
            //Alterar elemento
            boolean excluiu=false;
            for(int i=0;i<nl.getLength() || excluiu==false;i++){
                Element noPergunta=(Element)nl.item(i);
                if(noPergunta.getAttribute("descricao").toString().equals(pergunta.getDescricao())){
                    root.removeChild(noPergunta);
                    excluiu=true;
                }
            }
            //Grava XML
            TransformerFactory tranFactory = TransformerFactory.newInstance(); 
            Transformer aTransformer = tranFactory.newTransformer(); 
            Source src = new DOMSource(doc); 
            Result dest = new StreamResult(new File("src/resources/perguntas.xml")); 
            aTransformer.transform(src, dest); 
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(xml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void adicionaPergunta(perguntas pergunta) throws IOException, XPathExpressionException, TransformerConfigurationException, TransformerException, SAXException{
          try {
            //Carrega XML já salvo em disco
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db;
            db = dbf.newDocumentBuilder();
            Document doc = (Document) db.parse(new File("src/resources/perguntas.xml"));
            Element root = doc.getDocumentElement();
            //Procura o nodo selecionado
            NodeList nl = root.getElementsByTagName("pergunta");
            //Alterar elemento
            Element novaPergunta=doc.createElement("pergunta");
            novaPergunta.setAttribute("descricao", pergunta.getDescricao().toString());            
            novaPergunta.setAttribute("materia", pergunta.getMateria().toString());            
            novaPergunta.setAttribute("nivel", pergunta.getNivel().toString());            
            for(int i=0;i<pergunta.getListaRespostas().size();i++){
                Element resposta=doc.createElement("resposta");
                String[] dadosResposta=pergunta.getListaRespostas().elementAt(i).toString().split(",");
                resposta.setAttribute("correta", dadosResposta[0]);
                resposta.setAttribute("descricao", dadosResposta[1]);
                novaPergunta.appendChild(resposta);
            }
            root.appendChild(novaPergunta);
            //Grava XML
            TransformerFactory tranFactory = TransformerFactory.newInstance(); 
            Transformer aTransformer = tranFactory.newTransformer(); 
            Source src = new DOMSource(doc); 
            Result dest = new StreamResult(new File("src/resources/perguntas.xml")); 
            aTransformer.transform(src, dest); 
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(xml.class.getName()).log(Level.SEVERE, null, ex);
        }
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
