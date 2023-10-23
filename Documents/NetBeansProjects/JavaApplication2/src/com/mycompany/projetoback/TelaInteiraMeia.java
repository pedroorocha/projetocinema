/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetoback;

/**
 *
 * @author silvi
 */
public class TelaInteiraMeia extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
	/**
     * Creates new form TelaInteiraMeia
     */
    public TelaInteiraMeia() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIntMeiaValorTotal = new javax.swing.JTextField();
        btnIntMeiaCancelar = new javax.swing.JButton();
        spnMeia = new javax.swing.JSpinner();
        spnInteira = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        btnIntMeiaAvancar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Inteira");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 90, 80, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Meia");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 160, 60, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("R$26,00");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 120, 60, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("R$13,00");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 190, 70, 20);
        getContentPane().add(txtIntMeiaValorTotal);
        txtIntMeiaValorTotal.setBounds(350, 250, 130, 22);

        btnIntMeiaCancelar.setText("Cancelar");
        btnIntMeiaCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntMeiaCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIntMeiaCancelar);
        btnIntMeiaCancelar.setBounds(190, 360, 80, 23);
        getContentPane().add(spnMeia);
        spnMeia.setBounds(390, 180, 64, 22);
        getContentPane().add(spnInteira);
        spnInteira.setBounds(390, 110, 64, 22);

        jButton1.setText("Valor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 250, 75, 23);

        btnIntMeiaAvancar.setText("Avançar");
        btnIntMeiaAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntMeiaAvancarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIntMeiaAvancar);
        btnIntMeiaAvancar.setBounds(435, 360, 80, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Inteira_Meia.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            int inteira = (Integer)spnInteira.getValue();
            int meia = (Integer)spnMeia.getValue();

            int valorIngresso = (inteira * 26) + (meia * 13);
            
            txtIntMeiaValorTotal.setText("R$ " + valorIngresso);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnIntMeiaCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntMeiaCancelarActionPerformed
        this.dispose();
        TelaDeUsuario menu = new TelaDeUsuario();
        menu.setVisible(true);
    }//GEN-LAST:event_btnIntMeiaCancelarActionPerformed

    private void btnIntMeiaAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntMeiaAvancarActionPerformed
        this.dispose();
       // TelaBomboniere bombom = new TelaBomboniere();
        //bombom.setVisible(true);
        
    }//GEN-LAST:event_btnIntMeiaAvancarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInteiraMeia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInteiraMeia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInteiraMeia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInteiraMeia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInteiraMeia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIntMeiaAvancar;
    private javax.swing.JButton btnIntMeiaCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spnInteira;
    private javax.swing.JSpinner spnMeia;
    private javax.swing.JTextField txtIntMeiaValorTotal;
    // End of variables declaration//GEN-END:variables
}
