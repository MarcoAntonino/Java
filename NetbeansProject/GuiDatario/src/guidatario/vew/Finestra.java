/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidatario.vew;

import guidatario.model.Datario;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author antoninom
 */
public class Finestra extends javax.swing.JFrame {

    /**
     * Creates new form Finestra
     */
    public Finestra() {
        
       
        initComponents(); //questo istanzia lblOrario, quindi va messo prima
        
        GregorianCalendar ny = new GregorianCalendar();
        ny.add(Calendar.HOUR_OF_DAY, -6);
        
        GregorianCalendar pechino = new GregorianCalendar();
        pechino.add(Calendar.HOUR_OF_DAY, +6);
        
        
        
        Datario d1 = new Datario(ny, lblOrarioNewYork);
        Datario d2 = new Datario(pechino, lblOrarioPechino);
        Datario d3 = new Datario(lblOrarioRoma);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOrarioRoma = new javax.swing.JLabel();
        lblOrarioNewYork = new javax.swing.JLabel();
        lblOrarioPechino = new javax.swing.JLabel();
        lblNewYork = new javax.swing.JLabel();
        lblRoma = new javax.swing.JLabel();
        lblPechino = new javax.swing.JLabel();
        lblTitolo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNewYork.setText("New York");

        lblRoma.setText("Roma");

        lblPechino.setText("Pechino");

        lblTitolo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitolo.setText("ORARIO-->Fuso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitolo)
                    .addComponent(lblPechino)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRoma)
                            .addComponent(lblNewYork))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrarioPechino)
                            .addComponent(lblOrarioNewYork)
                            .addComponent(lblOrarioRoma))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitolo)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNewYork)
                    .addComponent(lblOrarioNewYork))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoma)
                    .addComponent(lblOrarioRoma))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPechino)
                    .addComponent(lblOrarioPechino))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finestra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblNewYork;
    private javax.swing.JLabel lblOrarioNewYork;
    private javax.swing.JLabel lblOrarioPechino;
    private javax.swing.JLabel lblOrarioRoma;
    private javax.swing.JLabel lblPechino;
    private javax.swing.JLabel lblRoma;
    private javax.swing.JLabel lblTitolo;
    // End of variables declaration//GEN-END:variables
}
