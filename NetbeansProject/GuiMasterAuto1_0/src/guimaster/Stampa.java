/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guimaster;

import enumeration.Alimentazione;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Auto;
import model.MyLibrary;

/**
 *
 * @author antoninom
 */
public class Stampa extends javax.swing.JInternalFrame {

    String fileName = "auto.dat";
    int find;
    Auto a=null;
    ArrayList<Auto> list = null;
    String txtName = "auto.txt";
    
    
    /**
     * Creates new form Stampa
     */
    public Stampa() {
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

        rbtngAlimentazione = new javax.swing.ButtonGroup();
        lblStampa = new javax.swing.JLabel();
        lblCerca = new javax.swing.JLabel();
        txtCerca = new javax.swing.JTextField();
        btnCerca = new javax.swing.JButton();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblModello = new javax.swing.JLabel();
        txtModello = new javax.swing.JTextField();
        lblCilindrata = new javax.swing.JLabel();
        txtCilindrata = new javax.swing.JTextField();
        lblColore = new javax.swing.JLabel();
        txtColore = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rbtnBenzina = new javax.swing.JRadioButton();
        rbtnDiesel = new javax.swing.JRadioButton();
        rbtnGPL = new javax.swing.JRadioButton();
        rbtnMetano = new javax.swing.JRadioButton();
        rbtnIbrida = new javax.swing.JRadioButton();
        btnStampa = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lblStampa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblStampa.setText("Stampa");

        lblCerca.setText("Cerca per posizione");

        btnCerca.setText("Cerca");
        btnCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaActionPerformed(evt);
            }
        });

        lblMarca.setText("Marca");

        lblModello.setText("Modello");

        lblCilindrata.setText("Cilindrata");

        lblColore.setText("Colore");

        jLabel1.setText("Alimentazione");

        rbtngAlimentazione.add(rbtnBenzina);
        rbtnBenzina.setText("Benzina");

        rbtngAlimentazione.add(rbtnDiesel);
        rbtnDiesel.setText("Diesel");

        rbtngAlimentazione.add(rbtnGPL);
        rbtnGPL.setText("GPL");

        rbtngAlimentazione.add(rbtnMetano);
        rbtnMetano.setText("Metano");

        rbtngAlimentazione.add(rbtnIbrida);
        rbtnIbrida.setText("Ibrida");

        btnStampa.setText("Stampa");
        btnStampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStampaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblStampa)
                .addGap(231, 231, 231))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtnGPL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbtnMetano))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtnBenzina)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbtnDiesel))
                                    .addComponent(rbtnIbrida)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCerca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCerca, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCerca))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnStampa)
                                .addGap(116, 116, 116)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCilindrata)
                            .addComponent(lblModello)
                            .addComponent(lblColore))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtColore)
                            .addComponent(txtModello)
                            .addComponent(txtCilindrata))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStampa)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCerca)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCerca)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModello, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModello))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCilindrata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCilindrata))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rbtnBenzina)
                    .addComponent(rbtnDiesel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnGPL)
                    .addComponent(rbtnMetano))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addComponent(rbtnIbrida)
                .addGap(33, 33, 33)
                .addComponent(btnStampa)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaActionPerformed
        
        find = Integer.parseInt(txtCerca.getText());
        
        
        a=new Auto();
        list = new ArrayList<Auto>();
        list = MyLibrary.read(fileName);
        for(Object o : list){
            if(o instanceof Auto)
            a=(Auto)o;
        }
        
        rbtngAlimentazione.clearSelection();

        if (find>(list.size()-1)){
            JOptionPane.showMessageDialog(this, "Elemento inesistente");

        }else{
            txtMarca.setText(list.get(find).getMarca());
            txtModello.setText(list.get(find).getModello());
            txtCilindrata.setText(Integer.toString(list.get(find).getCilindrata()));
            txtColore.setText(list.get(find).getColore());

            if(list.get(find).getAlimentazione()==Alimentazione.BENZINA){
                rbtnBenzina.doClick();
            }else if(list.get(find).getAlimentazione()==Alimentazione.DIESEL){
                rbtnDiesel.doClick();
            }else if(list.get(find).getAlimentazione()==Alimentazione.GPL){
                rbtnGPL.doClick();
            }else if(list.get(find).getAlimentazione()==Alimentazione.METANO){
                rbtnMetano.doClick();
            }else if(list.get(find).getAlimentazione()==Alimentazione.IBRIDA){
                rbtnIbrida.doClick();
            }
        }



    }//GEN-LAST:event_btnCercaActionPerformed

    private void btnStampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStampaActionPerformed
        
        String marca = txtMarca.getText();
        String modello = txtModello.getText();
        String colore = txtColore.getText();
        int cilindrata = Integer.parseInt(txtCilindrata.getText());
        
        Auto a = new Auto (marca, modello, null, cilindrata, colore);
        
        if (rbtnBenzina.isSelected()){
            a.setAlimentazione(Alimentazione.BENZINA);
        }else if (rbtnDiesel.isSelected()){
            a.setAlimentazione(Alimentazione.DIESEL);
        }else if (rbtnGPL.isSelected()){
            a.setAlimentazione(Alimentazione.GPL);
        }else if (rbtnMetano.isSelected()){
            a.setAlimentazione(Alimentazione.METANO);
        }else if (rbtnIbrida.isSelected()){
            a.setAlimentazione(Alimentazione.IBRIDA);
        }
        
        MyLibrary.createTxt(txtName, a);
        
    }//GEN-LAST:event_btnStampaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerca;
    private javax.swing.JButton btnStampa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCerca;
    private javax.swing.JLabel lblCilindrata;
    private javax.swing.JLabel lblColore;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModello;
    private javax.swing.JLabel lblStampa;
    private javax.swing.JRadioButton rbtnBenzina;
    private javax.swing.JRadioButton rbtnDiesel;
    private javax.swing.JRadioButton rbtnGPL;
    private javax.swing.JRadioButton rbtnIbrida;
    private javax.swing.JRadioButton rbtnMetano;
    private javax.swing.ButtonGroup rbtngAlimentazione;
    private javax.swing.JTextField txtCerca;
    private javax.swing.JTextField txtCilindrata;
    private javax.swing.JTextField txtColore;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModello;
    // End of variables declaration//GEN-END:variables
}
