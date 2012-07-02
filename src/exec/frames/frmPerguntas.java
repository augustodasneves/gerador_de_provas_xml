/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exec.frames;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import main.misc;
import main.perguntas;
import main.xml;
import org.xml.sax.SAXException;

/**
 *
 * @author Augusto
 */
public class frmPerguntas extends javax.swing.JFrame {
    private perguntas perguntaOriginal;
    private boolean novo;
    /**
     * Creates new form frmPerguntas
     */
    public frmPerguntas() {
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
        lblmateria1 = new javax.swing.JLabel();
        cmb = new javax.swing.JComboBox();
        cmb1 = new javax.swing.JComboBox();
        btngroupRespostas = new javax.swing.ButtonGroup();
        lblmateria2 = new javax.swing.JLabel();
        lblmateria3 = new javax.swing.JLabel();
        cmb2 = new javax.swing.JComboBox();
        cmb3 = new javax.swing.JComboBox();
        jlblDescricao = new javax.swing.JLabel();
        jtxtEnunciado = new javax.swing.JTextField();
        jRbtn1 = new javax.swing.JRadioButton();
        jRbtn2 = new javax.swing.JRadioButton();
        jRbtn3 = new javax.swing.JRadioButton();
        jRbtn4 = new javax.swing.JRadioButton();
        jtxtalt1 = new javax.swing.JTextField();
        jtxtalt2 = new javax.swing.JTextField();
        jtxtalt3 = new javax.swing.JTextField();
        jtxtalt4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jbtnEditar = new javax.swing.JButton();
        jlblttlEditar1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        lblmateria4 = new javax.swing.JLabel();
        lblmateria5 = new javax.swing.JLabel();
        cmb4 = new javax.swing.JComboBox();
        cmb5 = new javax.swing.JComboBox();
        jbtnExcluir = new javax.swing.JButton();
        jbtnNovo = new javax.swing.JButton();

        lblmateria.setText("Matéria:");

        lblmateria1.setText("Nível:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulário de Edição de Perguntas");
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblmateria2.setText("Matéria:");

        lblmateria3.setText("Nível:");

        cmb2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb2ItemStateChanged(evt);
            }
        });
        cmb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb2ActionPerformed(evt);
            }
        });

        cmb3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fácil", "Médio", "Díficil" }));
        cmb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb3ActionPerformed(evt);
            }
        });

        jlblDescricao.setText("Enunciado:");

        btngroupRespostas.add(jRbtn1);

        btngroupRespostas.add(jRbtn2);

        btngroupRespostas.add(jRbtn3);

        btngroupRespostas.add(jRbtn4);

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Perguntas Filtradas:");

        jbtnEditar.setText("Enviar");
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jlblttlEditar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblttlEditar1.setText("Detalhes da Pergunta");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lblmateria4.setText("Nível:");

        lblmateria5.setText("Matéria:");

        cmb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb4ActionPerformed(evt);
            }
        });

        cmb5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb5ItemStateChanged(evt);
            }
        });
        cmb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb5ActionPerformed(evt);
            }
        });

        jbtnExcluir.setText("Excluir");
        jbtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExcluirActionPerformed(evt);
            }
        });

        jbtnNovo.setText("Novo");
        jbtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblmateria3)
                                .addComponent(lblmateria2))
                            .addGap(14, 14, 14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmb3, 0, 245, Short.MAX_VALUE)
                                .addComponent(cmb2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnExcluir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbtnNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblmateria4)
                        .addGap(14, 14, 14)
                        .addComponent(cmb4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtEnunciado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRbtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtalt1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRbtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtalt3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRbtn3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtalt2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRbtn4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtalt4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblmateria5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlblttlEditar1)
                                .addGap(216, 216, 216))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(223, 223, 223)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnExcluir)
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblttlEditar1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmateria5)
                            .addComponent(cmb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmateria4)
                            .addComponent(cmb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblDescricao)
                            .addComponent(jtxtEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtalt1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtalt3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtalt2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtalt4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnEditar)
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmateria2)
                            .addComponent(cmb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmateria3)
                            .addComponent(cmb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb3ActionPerformed
        try {
            jList1.setListData(xml.getPerguntas(cmb3.getSelectedItem().toString().toLowerCase(), cmb2.getSelectedItem().toString().toLowerCase()));
        } catch (IOException ex) {
            Logger.getLogger(frmProva.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(frmProva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmb3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Vector dadosMaterias;
        try {
            dadosMaterias = xml.getMaterias();
            for (int i = 0; i < dadosMaterias.size(); i++) {
                cmb2.addItem(dadosMaterias.elementAt(i));
            }
        } catch (IOException ex) {
            Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    
    
    private void cmb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb2ActionPerformed
        try {
            jList1.setListData(xml.getPerguntas(cmb3.getSelectedItem().toString().toLowerCase(), cmb2.getSelectedItem().toString().toLowerCase()));
        } catch (IOException ex) {
            Logger.getLogger(frmProva.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(frmProva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmb2ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            this.novo=false;
            perguntas pergunta = xml.getDetalhePergunta(jList1.getSelectedValue().toString());
            this.perguntaOriginal=pergunta;
            Vector dadosMaterias;
            try {
                dadosMaterias = xml.getMaterias();
                for (int i = 0; i < dadosMaterias.size(); i++) {
                    cmb5.addItem(dadosMaterias.elementAt(i));
                    if(dadosMaterias.elementAt(i).equals(pergunta.getMateria().toString())){
                        cmb5.setSelectedIndex(i);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
                Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            for(int i=0;i<=2;i++){
                switch(i){
                    case 0:
                    cmb4.addItem("Fácil");
                    if(misc.limparString(cmb4.getItemAt(i).toString()).toLowerCase().equals(pergunta.getNivel())){
                        cmb4.setSelectedIndex(i);
                    }
                        break;
                        case 1:
                    cmb4.addItem("Médio");
                    if(misc.limparString(cmb4.getItemAt(i).toString()).toLowerCase().equals(pergunta.getNivel())){
                        cmb4.setSelectedIndex(i);
                    }
                        break;
                            case 2:
                    cmb4.addItem("Díficil");
                    if(misc.limparString(cmb4.getItemAt(i).toString()).toLowerCase().equals(pergunta.getNivel())){
                        cmb4.setSelectedIndex(i);
                    }
                        break;
                }
            }
            
            jtxtEnunciado.setText(pergunta.getDescricao());
            Vector respostas = pergunta.getListaRespostas();
            for (int i = 0; i < respostas.size(); i++) {
                String[] Alternativa = respostas.elementAt(i).toString().split(",");
                String Check = Alternativa[0];

                switch (i) {
                    case 0:
                        jtxtalt1.setText(Alternativa[1]);
                        if ("sim".equals(Check)) {
                            jRbtn1.setSelected(true);
                        }
                        break;
                    case 1:
                        jtxtalt2.setText(Alternativa[1]);
                        if ("sim".equals(Check)) {
                            jRbtn2.setSelected(true);
                        }
                        break;
                    case 2:
                        jtxtalt3.setText(Alternativa[1]);
                        if ("sim".equals(Check)) {
                            jRbtn3.setSelected(true);
                        }
                        break;
                    case 3:
                        jtxtalt4.setText(Alternativa[1]);
                        if ("sim".equals(Check)) {
                            jRbtn4.setSelected(true);
                        }
                        break;

                }

            }
        } catch (IOException ex) {
            Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cmb2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb2ItemStateChanged
    }//GEN-LAST:event_cmb2ItemStateChanged

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        
        perguntas perguntaEditada=new perguntas();
        perguntaEditada.setDescricao(jtxtEnunciado.getText());
        perguntaEditada.setNivel(misc.limparString(cmb4.getSelectedItem().toString().toLowerCase()));        
        perguntaEditada.setMateria(cmb5.getSelectedItem().toString());
        Vector respostasEditadas=new Vector();
        for(int i=0;i<=3;i++){
            String RadioCorreta=null;
            String alternativa=null;
            Boolean selecao=null;
            switch(i){
                case 0:
                    selecao=jRbtn1.isSelected();
                    alternativa=jtxtalt1.getText().toString();
                    break;
                    case 1:
                    selecao=jRbtn2.isSelected();
                    alternativa=jtxtalt2.getText().toString();
                    break;
                        case 2:
                    selecao=jRbtn3.isSelected();
                    alternativa=jtxtalt3.getText().toString();
                    break;
                            case 3:
                    selecao=jRbtn4.isSelected();
                    alternativa=jtxtalt4.getText().toString();
                    break;
            }
            if(selecao.booleanValue()){
                RadioCorreta="sim";
            }else{
                RadioCorreta="nao";
            }
            respostasEditadas.add(RadioCorreta+","+alternativa);
        }
        perguntaEditada.setListaRespostas(respostasEditadas);
        try {
            if(novo==true){
                xml.adicionaPergunta(perguntaEditada);
            }else{
                xml.editaPergunta(this.perguntaOriginal, perguntaEditada);
            }
            this.limpaFormPergunta();
            jList1.setModel(new DefaultListModel());
            
            
        } catch (IOException ex) {
            Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void cmb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb4ActionPerformed

    private void cmb5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb5ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb5ItemStateChanged

    private void cmb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb5ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        
    }//GEN-LAST:event_jList1MouseClicked

    private void jbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExcluirActionPerformed
        
        try {
            perguntas pergunta = xml.getDetalhePergunta(jList1.getSelectedValue().toString());
            xml.removePergunta(pergunta);
            this.limpaFormPergunta();
            jList1.setModel(new DefaultListModel());
        } catch (IOException ex) {
            Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnExcluirActionPerformed

    private void jbtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNovoActionPerformed
        this.limpaFormPergunta();
        this.novo=true;        
            Vector dadosMaterias;
            try {
                dadosMaterias = xml.getMaterias();
                for (int i = 0; i < dadosMaterias.size(); i++) {
                    cmb5.addItem(dadosMaterias.elementAt(i));
                }
            } catch (IOException ex) {
                Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
                Logger.getLogger(frmPerguntas.class.getName()).log(Level.SEVERE, null, ex);
            }
            cmb4.addItem("Fácil");
            cmb4.addItem("Médio");
            cmb4.addItem("Díficil");
    }//GEN-LAST:event_jbtnNovoActionPerformed
    public void limpaFormPergunta(){
        cmb5.removeAllItems();
        cmb4.removeAllItems();
        jtxtEnunciado.setText("");
        jtxtalt1.setText("");
        jtxtalt2.setText("");
        jtxtalt3.setText("");
        jtxtalt4.setText("");
        jRbtn1.setSelected(false);
        jRbtn2.setSelected(false);
        jRbtn3.setSelected(false);
        jRbtn4.setSelected(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         *
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
            java.util.logging.Logger.getLogger(frmPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmPerguntas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.ButtonGroup btngroupRespostas;
    private javax.swing.JComboBox cmb;
    private javax.swing.JComboBox cmb1;
    private javax.swing.JComboBox cmb2;
    private javax.swing.JComboBox cmb3;
    private javax.swing.JComboBox cmb4;
    private javax.swing.JComboBox cmb5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JRadioButton jRbtn1;
    private javax.swing.JRadioButton jRbtn2;
    private javax.swing.JRadioButton jRbtn3;
    private javax.swing.JRadioButton jRbtn4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnExcluir;
    private javax.swing.JButton jbtnNovo;
    private javax.swing.JLabel jlblDescricao;
    private javax.swing.JLabel jlblttlEditar1;
    private javax.swing.JTextField jtxtEnunciado;
    private javax.swing.JTextField jtxtalt1;
    private javax.swing.JTextField jtxtalt2;
    private javax.swing.JTextField jtxtalt3;
    private javax.swing.JTextField jtxtalt4;
    private javax.swing.JLabel lblmateria;
    private javax.swing.JLabel lblmateria1;
    private javax.swing.JLabel lblmateria2;
    private javax.swing.JLabel lblmateria3;
    private javax.swing.JLabel lblmateria4;
    private javax.swing.JLabel lblmateria5;
    // End of variables declaration//GEN-END:variables
}
