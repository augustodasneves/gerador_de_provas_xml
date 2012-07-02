/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Augusto
 */
public class gabarito{
    private String gabaritoMontado;
    private String localPath;
    public void geraGabarito(prova provaMontada,String pastaGabarito){
            String br=" \r\n";
            String textoGabarito="";
            textoGabarito+="Curso: Sistemas de Informação"+br;
            textoGabarito+=("Disciplina:"+provaMontada.getMateria()+br);
            textoGabarito+=("Data:"+provaMontada.getData()+br);
            textoGabarito+=("Professor:"+provaMontada.getProfessor()+br);
            textoGabarito+=("Aluno:"+br);
            textoGabarito+=("Nota:"+br);
            textoGabarito+=(br);
            textoGabarito+=("Gabarito"+br);
            textoGabarito+=(br+"Assinale a alternativa correta:"+br);
            for(int i=1;i<=provaMontada.getPerguntas().size();i++){
                perguntas perguntaProva=(perguntas)provaMontada.getPerguntas().elementAt(i-1);
                textoGabarito+=(br+i+"."+perguntaProva.getDescricao()+br);
                for(int j=0;j<perguntaProva.getListaRespostas().size();j++){
                    String[] resposta=perguntaProva.getListaRespostas().elementAt(j).toString().split(",");
                    String correta=resposta[0].equals("sim")?"X":" ";
                    textoGabarito+=("("+correta+") "+resposta[1]+br);
                }
            }
            JFrame frameGabarito=new JFrame();
            JTextArea areaTextoGabarito=new JTextArea();
            areaTextoGabarito.setText(textoGabarito);
            areaTextoGabarito.setEditable(false);
            frameGabarito.add(areaTextoGabarito);
            frameGabarito.setLocationRelativeTo(null);
            frameGabarito.pack();
            frameGabarito.setVisible(true);
            frameGabarito.show();
            this.gabaritoMontado=textoGabarito;
            this.localPath=pastaGabarito;
            int respostaGabarito=JOptionPane.showConfirmDialog(null, "Você deseja salvar o gabarito desta prova?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if(respostaGabarito==JOptionPane.YES_OPTION){
                frameGabarito.dispose();
                this.salvaGabarito();
            }
    }
    
    public void salvaGabarito(){
        Calendar data=Calendar.getInstance();
        try {
            FileWriter arquivoProva = new FileWriter(new File(this.localPath+"\\gabarito_"+String.valueOf(data.get(Calendar.DATE))+"_"+String.valueOf(data.get(data.MONTH))+"_"+String.valueOf(data.get(data.YEAR))+".txt"));
            arquivoProva.write(this.gabaritoMontado);
            arquivoProva.close();
        } catch (IOException ex) {
            Logger.getLogger(gabarito.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            JOptionPane.showMessageDialog(null, "Gabarito salvo com sucesso!", "Sucesso", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
