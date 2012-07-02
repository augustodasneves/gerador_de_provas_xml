/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exec.frames;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Collections;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import main.gabarito;
import main.perguntas;
import main.prova;
import main.xml;
import org.xml.sax.SAXException;

/**
 *
 * @author Augusto
 */
public class frmProva extends javax.swing.JFrame {

    /**
     * Creates new form frmProva
     */
    public frmProva() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblmateria = new javax.swing.JLabel();
        cmb = new javax.swing.JComboBox();
        lblmateria1 = new javax.swing.JLabel();
        cmb1 = new javax.swing.JComboBox();
        lblmateria2 = new javax.swing.JLabel();
        jtxtProfessor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jbtnGerar = new javax.swing.JButton();
        jtxtCaminho = new javax.swing.JTextField();
        jbtnCaminho = new javax.swing.JButton();
        jlblnumPerguntas = new javax.swing.JLabel();
        jtxtNumPerguntas = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de Criação de Provas");
        setIconImages(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblmateria.setText("Matéria:");

        cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbActionPerformed(evt);
            }
        });

        lblmateria1.setText("Nível:");

        cmb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fácil", "Médio", "Díficil" }));
        cmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb1ActionPerformed(evt);
            }
        });

        lblmateria2.setText("Professor:");

        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Perguntas Pré-Selecionadas:");

        jbtnGerar.setText("Gerar Prova");
        jbtnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGerarActionPerformed(evt);
            }
        });

        jtxtCaminho.setEditable(false);

        jbtnCaminho.setText("Selecione o Caminho");
        jbtnCaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCaminhoActionPerformed(evt);
            }
        });

        jlblnumPerguntas.setText("Nº Perguntas:");

        jtxtNumPerguntas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmateria1)
                            .addComponent(lblmateria))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 191, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtxtCaminho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnCaminho))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmateria2)
                            .addComponent(jlblnumPerguntas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtProfessor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxtNumPerguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmateria)
                    .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmateria1)
                    .addComponent(cmb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmateria2)
                    .addComponent(jtxtProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblnumPerguntas)
                    .addComponent(jtxtNumPerguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCaminho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnGerar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Vector dadosMaterias;
        try {
            dadosMaterias = xml.getMaterias();
            for (int i = 0; i < dadosMaterias.size(); i++) {
                cmb.addItem(dadosMaterias.elementAt(i));
            }
        } catch (IOException ex) {
            Logger.getLogger(frmProva.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(frmProva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void cmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbActionPerformed
        try {
            Vector perguntas=xml.getPerguntas(cmb1.getSelectedItem().toString().toLowerCase(), cmb.getSelectedItem().toString().toLowerCase());
            Collections.shuffle(perguntas);
            jList1.setListData(perguntas);
        } catch (IOException ex) {
            Logger.getLogger(frmProva.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(frmProva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbActionPerformed

    private void cmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb1ActionPerformed
        try {
            Vector perguntas=xml.getPerguntas(cmb1.getSelectedItem().toString().toLowerCase(), cmb.getSelectedItem().toString().toLowerCase());
            Collections.shuffle(perguntas);
            jList1.setListData(perguntas);
        } catch (IOException ex) {
            Logger.getLogger(frmProva.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(frmProva.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cmb1ActionPerformed

    public boolean validaProva(){
        boolean valido=true;
        if(jtxtCaminho.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Local para geração da prova não escolhido", "Erro", JOptionPane.ERROR_MESSAGE);
            valido=false;
            return valido;
        }
        if(jtxtProfessor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o nome do Professor", "Erro", JOptionPane.ERROR_MESSAGE);
            valido=false;
            return valido;
        }
        
        if(jtxtNumPerguntas.getText().isEmpty()){
            try{
            Integer.parseInt(jtxtNumPerguntas.getText());
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Digite corretamente o número de perguntas da prova", "Erro", JOptionPane.ERROR_MESSAGE);
                valido=false;
                return valido;
            }
            JOptionPane.showMessageDialog(null, "Digite o nome do Professor", "Erro", JOptionPane.ERROR_MESSAGE);
            valido=false;
            return valido;
        }
        return valido;
    }
    
    private void jbtnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGerarActionPerformed
        boolean evalidoProva;
        evalidoProva=this.validaProva();
        if(evalidoProva==true){
        prova provaGerar = new prova();
        Calendar data=Calendar.getInstance();
        provaGerar.setData(String.valueOf(data.get(Calendar.DATE))+"/"+String.valueOf(data.get(data.MONTH))+"/"+String.valueOf(data.get(data.YEAR)));
        provaGerar.setMateria(cmb.getSelectedItem().toString());
        provaGerar.setProfessor(jtxtProfessor.getText());
        Vector perguntasProva = new Vector();
        for (int i = 1; i <= jList1.getModel().getSize() && i<=Integer.parseInt(jtxtNumPerguntas.getText()); i++) {
            perguntas perguntaNova=new perguntas();
            try {
                perguntaNova = xml.getDetalhePergunta(jList1.getModel().getElementAt(i-1).toString());
            } catch (IOException ex) {
                Logger.getLogger(frmProva.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
                Logger.getLogger(frmProva.class.getName()).log(Level.SEVERE, null, ex);
            }
            perguntasProva.add(perguntaNova);
        }
        provaGerar.setPerguntas(perguntasProva);
        try {
            prova.geraProva(provaGerar, jtxtCaminho.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível gerar a prova", "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }finally{
            JOptionPane.showMessageDialog(null, "Prova Gerada com sucesso!", "Sucesso", JOptionPane.PLAIN_MESSAGE);
            int respostaGabarito=JOptionPane.showConfirmDialog(null, "Você deseja gerar o gabarito desta prova?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if(respostaGabarito==JOptionPane.YES_OPTION){
                gabarito gabaritoProva=new gabarito();
                gabaritoProva.geraGabarito(provaGerar,jtxtCaminho.getText());
            }
        }
        }
    }//GEN-LAST:event_jbtnGerarActionPerformed

    private void jbtnCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCaminhoActionPerformed
        JFileChooser selecionaArquivo=new JFileChooser();
        selecionaArquivo.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        selecionaArquivo.setDialogTitle("Escolha o diretório para salvar a prova");
        
        int res = selecionaArquivo.showOpenDialog(null);
                    if(res == JFileChooser.APPROVE_OPTION){
                        File diretorio = selecionaArquivo.getSelectedFile();
                        String nomeDir=diretorio.getAbsolutePath();
                        jtxtCaminho.setText(nomeDir);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Voce não selecionou nenhum diretório.");
    }//GEN-LAST:event_jbtnCaminhoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmProva().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmb;
    private javax.swing.JComboBox cmb1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCaminho;
    private javax.swing.JButton jbtnGerar;
    private javax.swing.JLabel jlblnumPerguntas;
    private javax.swing.JTextField jtxtCaminho;
    private javax.swing.JFormattedTextField jtxtNumPerguntas;
    private javax.swing.JTextField jtxtProfessor;
    private javax.swing.JLabel lblmateria;
    private javax.swing.JLabel lblmateria1;
    private javax.swing.JLabel lblmateria2;
    // End of variables declaration//GEN-END:variables
}