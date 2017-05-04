/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MyLibrary;
import static model.MyLibrary.create;
import model.Persona;
import model.Sesso;

/**
 *
 * @author antoninom
 */
public class Aggiorna extends javax.swing.JFrame {

        String fileName = "data.dat";
        int find;
        Persona p=null;
        ArrayList<Persona> list = null;

    
    /**
     * Creates new form Aggiorna
     */
    public Aggiorna() {
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

        btnGSesso = new javax.swing.ButtonGroup();
        lblTitolo = new javax.swing.JLabel();
        lblCerca = new javax.swing.JLabel();
        txtCerca = new javax.swing.JTextField();
        btnCerca = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCognome = new javax.swing.JTextField();
        lblNome1 = new javax.swing.JLabel();
        lblDataNascita = new javax.swing.JLabel();
        txtDataNascita = new javax.swing.JTextField();
        txtLuogoNascita = new javax.swing.JTextField();
        lblLuogoNascita = new javax.swing.JLabel();
        lblSesso = new javax.swing.JLabel();
        rbtnM = new javax.swing.JRadioButton();
        rbtnF = new javax.swing.JRadioButton();
        rbtnA = new javax.swing.JRadioButton();
        btnSalva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitolo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTitolo.setText("Aggiorna persona");

        lblCerca.setText("Cerca per posizione");

        txtCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCercaActionPerformed(evt);
            }
        });

        btnCerca.setText("Cerca");
        btnCerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaActionPerformed(evt);
            }
        });

        lblNome.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtCognome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCognomeActionPerformed(evt);
            }
        });

        lblNome1.setText("Cognome");

        lblDataNascita.setText("Data Nascita");

        txtDataNascita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascitaActionPerformed(evt);
            }
        });

        txtLuogoNascita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLuogoNascitaActionPerformed(evt);
            }
        });

        lblLuogoNascita.setText("Luogo Nascita");

        lblSesso.setText("Sesso");

        btnGSesso.add(rbtnM);
        rbtnM.setText("M");
        rbtnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMActionPerformed(evt);
            }
        });

        btnGSesso.add(rbtnF);
        rbtnF.setText("F");

        btnGSesso.add(rbtnA);
        rbtnA.setText("Altro");

        btnSalva.setText("Salva");
        btnSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitolo)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCerca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCerca, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerca))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLuogoNascita)
                            .addComponent(lblSesso))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnM)
                                    .addComponent(rbtnF)
                                    .addComponent(rbtnA)
                                    .addComponent(btnSalva)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtLuogoNascita, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNome)
                            .addGap(52, 52, 52)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDataNascita)
                                .addComponent(lblNome1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDataNascita, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                .addComponent(txtCognome)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitolo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCerca)
                    .addComponent(txtCerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome1)
                    .addComponent(txtCognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataNascita)
                    .addComponent(txtDataNascita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLuogoNascita)
                    .addComponent(txtLuogoNascita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSesso)
                    .addComponent(rbtnM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalva)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCercaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCercaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCognomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCognomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCognomeActionPerformed

    private void txtDataNascitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascitaActionPerformed

    private void txtLuogoNascitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLuogoNascitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLuogoNascitaActionPerformed

    private void rbtnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnMActionPerformed

    private void btnSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvaActionPerformed
        
        try{
        
            list.get(find).setNome(txtNome.getText());
            list.get(find).setCognome(txtCognome.getText());
            list.get(find).setLuogoNascita(txtLuogoNascita.getText());        
        
            GregorianCalendar datadiNascita; 
            SimpleDateFormat dataNascita = new SimpleDateFormat("dd/MM/yyyy");
            Date date = dataNascita.parse(txtDataNascita.getText());
            datadiNascita = (GregorianCalendar) GregorianCalendar.getInstance();
            datadiNascita.setTime(date);        
            list.get(find).setDataNascita(datadiNascita);        

        
        
            if(rbtnM.isSelected()){
                list.get(find).setSex(Sesso.MASCHIO);            
            }else if(rbtnF.isSelected()){
                list.get(find).setSex(Sesso.FEMMINA);         
             }else if(rbtnA.isSelected()){
                list.get(find).setSex(Sesso.ALTRO);          
            }
            create(fileName,list);

        }catch(ParseException ex) {
        Logger.getLogger(Aggiorna.class.getName()).log(Level.SEVERE, null, ex);
    }
        

        
        
    }//GEN-LAST:event_btnSalvaActionPerformed

    private void btnCercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaActionPerformed
        
        find = Integer.parseInt(txtCerca.getText());
        
        p=new Persona();
        list=new ArrayList<Persona>();
        list=MyLibrary.read(fileName);
        for(Object o : list){
            if(o instanceof Persona)
            p=(Persona)o;
        }        
        
        String nome = p.getNome();
        String cognome = p.getCognome();
        String luogoNascita = p.getLuogoNascita();
        
        
        SimpleDateFormat dataNascita = new SimpleDateFormat("dd/MM/yyyy");
        dataNascita.setCalendar(list.get(find).getDataNascita());
        //String dataNascitaFormattata = dataNascita.format(p.getDataNascita().getTime());
        
               
        txtNome.setText(list.get(find).getNome());
        txtCognome.setText(list.get(find).getCognome());
        txtLuogoNascita.setText(list.get(find).getLuogoNascita());
       
        
        if (list.get(find).getSex()==Sesso.MASCHIO){
            rbtnM.doClick();
        }else if(list.get(find).getSex()==Sesso.FEMMINA){
            rbtnF.doClick();
        }else if(list.get(find).getSex()==Sesso.ALTRO){
            rbtnA.doClick();
        }
        
        
        
        
        
    }//GEN-LAST:event_btnCercaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aggiorna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aggiorna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aggiorna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aggiorna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aggiorna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerca;
    private javax.swing.ButtonGroup btnGSesso;
    private javax.swing.JButton btnSalva;
    private javax.swing.JLabel lblCerca;
    private javax.swing.JLabel lblDataNascita;
    private javax.swing.JLabel lblLuogoNascita;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblSesso;
    private javax.swing.JLabel lblTitolo;
    private javax.swing.JRadioButton rbtnA;
    private javax.swing.JRadioButton rbtnF;
    private javax.swing.JRadioButton rbtnM;
    private javax.swing.JTextField txtCerca;
    private javax.swing.JTextField txtCognome;
    private javax.swing.JTextField txtDataNascita;
    private javax.swing.JTextField txtLuogoNascita;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
