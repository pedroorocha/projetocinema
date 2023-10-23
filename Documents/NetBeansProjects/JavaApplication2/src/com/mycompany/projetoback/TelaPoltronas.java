/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetoback;
import com.mycompany.projetoback.DAO.ClienteDao;
import java.awt.Color;
import com.mycompany.projetoback.DAO.SessãoDao;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import controller.TelaDePoltronaController;
import controller.TelaDeFinalizaçãoController;
import javax.swing.ImageIcon;
/**
 *
 * @author pedro
 */
public class TelaPoltronas extends javax.swing.JFrame {
    SessãoDao d;
    ArrayList<Boolean> listaDePoltronas;
    private String Sessão;
    private String horario;
    private int id;
    int n;
    private int poltronas;
    /**
     * Creates new form TelaPoltronas
     */
    public TelaPoltronas() {
        d = new SessãoDao();
        d.lerPoltronas();
        initComponents();
        listaDePoltronas = new ArrayList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton15 = new javax.swing.JToggleButton();
        loginPanel1 = new com.mycompany.projetoback.loginPanel();
        poltrona28 = new javax.swing.JToggleButton();
        poltrona29 = new javax.swing.JToggleButton();
        poltrona27 = new javax.swing.JToggleButton();
        poltrona20 = new javax.swing.JToggleButton();
        poltrona26 = new javax.swing.JToggleButton();
        poltrona25 = new javax.swing.JToggleButton();
        poltrona23 = new javax.swing.JToggleButton();
        poltrona24 = new javax.swing.JToggleButton();
        poltrona22 = new javax.swing.JToggleButton();
        poltrona21 = new javax.swing.JToggleButton();
        poltrona18 = new javax.swing.JToggleButton();
        poltrona19 = new javax.swing.JToggleButton();
        poltrona16 = new javax.swing.JToggleButton();
        poltrona15 = new javax.swing.JToggleButton();
        poltrona14 = new javax.swing.JToggleButton();
        poltrona13 = new javax.swing.JToggleButton();
        poltrona12 = new javax.swing.JToggleButton();
        poltrona11 = new javax.swing.JToggleButton();
        poltrona10 = new javax.swing.JToggleButton();
        poltrona9 = new javax.swing.JToggleButton();
        poltrona8 = new javax.swing.JToggleButton();
        poltrona7 = new javax.swing.JToggleButton();
        poltrona6 = new javax.swing.JToggleButton();
        poltrona5 = new javax.swing.JToggleButton();
        poltrona4 = new javax.swing.JToggleButton();
        poltrona3 = new javax.swing.JToggleButton();
        poltrona2 = new javax.swing.JToggleButton();
        poltrona1 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jToggleButton15.setText("jToggleButton15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        loginPanel1.setImg(new ImageIcon("C:\\Users\\pedro\\Documents\\NetBeansProjects\\JavaApplication2\\src\\com\\mycompany\\imagens\\tela vermalha.png"));

        poltrona28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N
        poltrona28.setPreferredSize(new java.awt.Dimension(50, 50));

        poltrona29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N
        poltrona29.setPreferredSize(new java.awt.Dimension(50, 50));

        poltrona27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N
        poltrona20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poltrona20ActionPerformed(evt);
            }
        });

        poltrona26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N
        poltrona12.setToolTipText("");

        poltrona11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N
        poltrona6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poltrona6ActionPerformed(evt);
            }
        });

        poltrona5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N
        poltrona4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poltrona4ActionPerformed(evt);
            }
        });

        poltrona3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N

        poltrona1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/imagens/Poltrona Vermelha.png"))); // NOI18N
        poltrona1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poltrona1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Avançar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanel1Layout = new javax.swing.GroupLayout(loginPanel1);
        loginPanel1.setLayout(loginPanel1Layout);
        loginPanel1Layout.setHorizontalGroup(
            loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanel1Layout.createSequentialGroup()
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(poltrona28, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(poltrona29, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(poltrona27, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(poltrona20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(poltrona26, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(poltrona25, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(poltrona23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(poltrona24, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(poltrona22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(poltrona21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(poltrona18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(poltrona19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(poltrona16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(poltrona15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(poltrona8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(poltrona9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jButton2)
                        .addGap(244, 244, 244)
                        .addComponent(jButton1))
                    .addGroup(loginPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(loginPanel1Layout.createSequentialGroup()
                                .addComponent(poltrona7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(poltrona6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(poltrona5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginPanel1Layout.createSequentialGroup()
                                .addComponent(poltrona14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(poltrona13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(poltrona12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(poltrona11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(poltrona10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(poltrona4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(poltrona3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(poltrona2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(poltrona1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94))
        );
        loginPanel1Layout.setVerticalGroup(
            loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poltrona28, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona27)
                    .addComponent(poltrona20)
                    .addComponent(poltrona26)
                    .addComponent(poltrona25)
                    .addComponent(poltrona23)
                    .addComponent(poltrona24))
                .addGap(15, 15, 15)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poltrona22, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona21, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona18, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona19, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poltrona14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poltrona7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(poltrona5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(loginPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void poltrona1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poltrona1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_poltrona1ActionPerformed

    private void poltrona4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poltrona4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poltrona4ActionPerformed

    private void poltrona6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poltrona6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poltrona6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(this.total(this.totalDeIngressos())){
            JOptionPane.showMessageDialog(null, "numeros de poltronas invalida!");
        }else{
            TelaDeFinalizaçãoController t = new TelaDeFinalizaçãoController(); 
            TelaDeFinalização p = new TelaDeFinalização();
            
            t.setPoltronas(this.totalDeIngressos());
            t.setId(this.getId());
            System.out.println(t.getId());
            t.setPoltronas(this.totalDeIngressos());
            t.setListaDepoltronas(this.poltronasSelecionadas());
            
            this.verificaPoltronas(this.pesquisaPoltrona(this.retornaSessão(this.getId()), this.retornaHorario(this.getId())));
            //System.out.println(this.pesquisaPoltrona(this.retornaSessão(this.getId()), this.retornaHorario(this.getId().get(0).toString())));
            p.exportarValor(t);
            p.calculaValorTotal();
            p.setVisible(true);
            this.dispose();
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void poltrona20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poltrona20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poltrona20ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPoltronas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPoltronas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPoltronas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPoltronas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPoltronas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JToggleButton jToggleButton15;
    private com.mycompany.projetoback.loginPanel loginPanel1;
    private javax.swing.JToggleButton poltrona1;
    private javax.swing.JToggleButton poltrona10;
    private javax.swing.JToggleButton poltrona11;
    private javax.swing.JToggleButton poltrona12;
    private javax.swing.JToggleButton poltrona13;
    private javax.swing.JToggleButton poltrona14;
    private javax.swing.JToggleButton poltrona15;
    private javax.swing.JToggleButton poltrona16;
    private javax.swing.JToggleButton poltrona18;
    private javax.swing.JToggleButton poltrona19;
    private javax.swing.JToggleButton poltrona2;
    private javax.swing.JToggleButton poltrona20;
    private javax.swing.JToggleButton poltrona21;
    private javax.swing.JToggleButton poltrona22;
    private javax.swing.JToggleButton poltrona23;
    private javax.swing.JToggleButton poltrona24;
    private javax.swing.JToggleButton poltrona25;
    private javax.swing.JToggleButton poltrona26;
    private javax.swing.JToggleButton poltrona27;
    private javax.swing.JToggleButton poltrona28;
    private javax.swing.JToggleButton poltrona29;
    private javax.swing.JToggleButton poltrona3;
    private javax.swing.JToggleButton poltrona4;
    private javax.swing.JToggleButton poltrona5;
    private javax.swing.JToggleButton poltrona6;
    private javax.swing.JToggleButton poltrona7;
    private javax.swing.JToggleButton poltrona8;
    private javax.swing.JToggleButton poltrona9;
    // End of variables declaration//GEN-END:variables
    public void exportarValor(TelaDePoltronaController s){
       this.setId(s.getId());
      System.out.println(this.getId());
    }
    
    public ArrayList<Boolean> pesquisaPoltrona(String sessao, String horario){
        ArrayList<Boolean> lista = new ArrayList();
        for(int i = 0;i<d.lerPoltronas().size();i++){
            if(d.lerPoltronas().get(i).getNome().equals(sessao) && d.lerPoltronas().get(i).getHorario().equals(horario)){
                lista = d.lerPoltronas().get(i).getPoltronas();
                return lista;
            }    
        }
       
        
        return null;
    }
    
        
    public void buscaSessão(int n){
        for(int i = 0 ; i < d.lerPoltronas().size();i++){
            if(d.lerPoltronas().get(i).getNome().equals(this.getSessão()) && d.ler().get(i).getHorario().equals(this.getHorario()));
                this.setId(d.ler().get(i).getId());
        }
        
        System.out.println(n);
    }
    
    public boolean total(int n){
        if(n>3){
            return true;
        }if(n<=0){
            return true;
        }
        return false;
    }
    
    public int totalDeIngressos(){
        int i=0;
            if(poltrona1.isSelected()&&poltrona1.isEnabled()){
                i++;
            }
            if(poltrona2.isSelected()&&poltrona2.isEnabled()){
               i++;
            }
            if(poltrona3.isSelected()&&poltrona3.isEnabled()){
                i++;
            }
            if(poltrona4.isSelected()&&poltrona4.isEnabled()){
               i++;
            } if(poltrona5.isSelected()&&poltrona5.isEnabled()){
                i++;
            } if(poltrona6.isSelected()&&poltrona6.isEnabled()){
                i++;
            } if(poltrona7.isSelected()&&poltrona7.isEnabled()){
                i++;
            } if(poltrona8.isSelected()&&poltrona8.isEnabled()){
                i++;
            } if(poltrona9.isSelected()&&poltrona9.isEnabled()){
                i++;
            } if(poltrona10.isSelected()&&poltrona10.isEnabled()){
                i++;
            } if(poltrona11.isSelected()&&poltrona11.isEnabled()){
                i++;
            } if(poltrona12.isSelected()&&poltrona12.isEnabled()){
                i++;
            } if(poltrona13.isSelected()&&poltrona13.isEnabled()){
                i++;
            } if(poltrona14.isSelected()&&poltrona14.isEnabled()){
                i++;
            } if(poltrona15.isSelected()&&poltrona15.isEnabled()){
                i++;
            } if(poltrona16.isSelected()&&poltrona16.isEnabled()){
                i++;
            } if(poltrona18.isSelected()&&poltrona18.isEnabled()){
                i++;
            } if(poltrona19.isSelected()&&poltrona19.isEnabled()){
                i++;
            } if(poltrona20.isSelected()&&poltrona20.isEnabled()){
                i++;
            } if(poltrona21.isSelected()&&poltrona21.isEnabled()){
                i++;
            } if(poltrona22.isSelected()&&poltrona22.isEnabled()){
                i++;
            } if(poltrona23.isSelected()&&poltrona23.isEnabled()){
                i++;
            } if(poltrona24.isSelected()&&poltrona24.isEnabled()){
                i++;
            } if(poltrona25.isSelected()&&poltrona25.isEnabled()){
                i++;
            } if(poltrona26.isSelected()&&poltrona26.isEnabled()){
                i++;
            } if(poltrona27.isSelected()&&poltrona27.isEnabled()){
                i++;
            } if(poltrona28.isSelected()&&poltrona28.isEnabled()){
                i++;
            } if(poltrona29.isSelected()&&poltrona29.isEnabled()){
                i++;
            }
            return i;
    }
    
    public void verificaPoltronas(ArrayList<Boolean> s){
            if(s.get(0)){
                poltrona1.setBackground(Color.blue);
                poltrona1.setEnabled(false);
            }
            if(s.get(1)){
                poltrona2.setBackground(Color.blue);
                poltrona2.setEnabled(false);
            }
            if(s.get(2)){
                poltrona3.setBackground(Color.blue);
                poltrona3.setEnabled(false);
            }
            if(s.get(3)){
                poltrona4.setBackground(Color.blue);
                poltrona4.setEnabled(false);
            } if(s.get(4)){
                poltrona5.setBackground(Color.blue);
                poltrona5.setEnabled(false);
            } if(s.get(5)){
                poltrona6.setBackground(Color.blue);
                poltrona6.setEnabled(false);
            } if(s.get(6)){
                poltrona7.setBackground(Color.blue);
                poltrona7.setEnabled(false);
            } if(s.get(7)){
                poltrona8.setBackground(Color.blue);
                poltrona8.setEnabled(false);
            } if(s.get(8)==true){
                poltrona9.setBackground(Color.blue);
                poltrona9.setEnabled(false);
            } if(s.get(9)){
                poltrona10.setBackground(Color.blue);
                poltrona10.setEnabled(false);
            } if(s.get(10)){
                poltrona11.setBackground(Color.blue);
                poltrona11.setEnabled(false);
            } if(s.get(11)){
                poltrona12.setBackground(Color.blue);
                poltrona12.setEnabled(false);
            } if(s.get(12)){
                poltrona13.setBackground(Color.blue);
                poltrona13.setEnabled(false);
            } if(s.get(13)){
                poltrona14.setBackground(Color.blue);
                poltrona14.setEnabled(false);
            } if(s.get(14)){
                poltrona15.setBackground(Color.blue);
                poltrona15.setEnabled(false);
            } if(s.get(15)){
                poltrona16.setBackground(Color.blue);
                poltrona16.setEnabled(false);
            } if(s.get(16)){
                poltrona18.setBackground(Color.blue);
                poltrona18.setEnabled(false);
            } if(s.get(17)){
                poltrona19.setBackground(Color.blue);
                poltrona19.setEnabled(false);
            } if(s.get(18)){
                poltrona20.setBackground(Color.blue);
                poltrona20.setEnabled(false);
            } if(s.get(19)){
                poltrona21.setBackground(Color.blue);
                poltrona21.setEnabled(false);
            } if(s.get(20)){
                poltrona22.setBackground(Color.blue);
                poltrona22.setEnabled(false);
            } if(s.get(21)){
                poltrona23.setBackground(Color.blue);
                poltrona23.setEnabled(false);
            } if(s.get(22)){
                poltrona24.setBackground(Color.blue);
                poltrona24.setEnabled(false);
            } if(s.get(23)){
                poltrona25.setBackground(Color.blue);
                poltrona25.setEnabled(false);
            } if(s.get(24)){
                poltrona26.setBackground(Color.blue);
                poltrona26.setEnabled(false);
            } if(s.get(25)){
                poltrona27.setBackground(Color.blue);
                poltrona27.setEnabled(false);
            } if(s.get(26)){
                poltrona28.setBackground(Color.blue);
                poltrona28.setEnabled(false);
            } if(s.get(27)){
                poltrona29.setBackground(Color.blue);
                poltrona29.setEnabled(false);
            }
            }
    public ArrayList<Boolean> poltronasSelecionadas(){
        ArrayList<Boolean> lista = new ArrayList();
        lista.add(poltrona1.isSelected());
        lista.add(poltrona2.isSelected());
        lista.add(poltrona3.isSelected());
        lista.add(poltrona4.isSelected());
        lista.add(poltrona5.isSelected());
        lista.add(poltrona6.isSelected());
        lista.add(poltrona7.isSelected());
        lista.add(poltrona8.isSelected());
        lista.add(poltrona9.isSelected());
        lista.add(poltrona10.isSelected());
        lista.add(poltrona11.isSelected());
        lista.add(poltrona12.isSelected());
        lista.add(poltrona13.isSelected());
        lista.add(poltrona14.isSelected());
        lista.add(poltrona15.isSelected());
        lista.add(poltrona16.isSelected());
        lista.add(poltrona18.isSelected());
        lista.add(poltrona19.isSelected());
        lista.add(poltrona20.isSelected());
        lista.add(poltrona21.isSelected());
        lista.add(poltrona22.isSelected());
        lista.add(poltrona23.isSelected());
        lista.add(poltrona24.isSelected());
        lista.add(poltrona25.isSelected());
        lista.add(poltrona26.isSelected());
        lista.add(poltrona27.isSelected());
        lista.add(poltrona28.isSelected());
        lista.add(poltrona28.isSelected());
        lista.add(poltrona29.isSelected());
        return lista;
    }
    
    
    
    public String retornaSessão(int j){
        for(int i = 0 ; i < d.lerPoltronas().size();i++){
            if(d.lerPoltronas().get(i).getId() == j){
                this.setSessão(d.lerPoltronas().get(i).getNome());
                return d.lerPoltronas().get(i).getNome();
            }
             
        }
        return null;
    }
    
    public String retornaHorario(int j){
        for(int i = 0 ; i < d.lerPoltronas().size();i++){
            if(d.lerPoltronas().get(i).getId() == j){
                this.setHorario(d.lerPoltronas().get(i).getHorario());
                return d.lerPoltronas().get(i).getHorario();
            }
            
        }
        return null;
    }

    public String getSessão() {
        return Sessão;
    }

    public void setSessão(String Sessão) {
        this.Sessão = Sessão;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Boolean> getListaDePoltronas() {
        return listaDePoltronas;
    }

    public void setListaDePoltronas(ArrayList<Boolean> listaDePoltronas) {
        this.listaDePoltronas = listaDePoltronas;
    }

    public int getPoltronas() {
        return poltronas;
    }

    public void setPoltronas(int poltronas) {
        this.poltronas = poltronas;
    }
    
    
}
