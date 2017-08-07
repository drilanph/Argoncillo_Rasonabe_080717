/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guestbook.app;

import java.awt.Toolkit;

/**
 *
 * @author Student Account
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        maincreate = new javax.swing.JMenuItem();
        mainupdate = new javax.swing.JMenuItem();
        maindelete = new javax.swing.JMenuItem();
        mainread = new javax.swing.JMenuItem();
        mainquit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Guestbook");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 300, 80);

        jLabel3.setFont(new java.awt.Font("Vivaldi", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Argoncillo & Rasonabe ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 80, 202, 31);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\3rd Year Account\\Desktop\\Argoncillo_Rasonabe_Guestbook_080417\\src\\com\\guestbook\\app\\maxresdefault.jpg")); // NOI18N
        jLabel2.setText("sfasf");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 770, 480);

        jMenuBar1.setForeground(new java.awt.Color(0, 204, 204));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu2.setText("Menu");

        maincreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        maincreate.setText("Create");
        maincreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maincreateActionPerformed(evt);
            }
        });
        jMenu2.add(maincreate);

        mainupdate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        mainupdate.setText("Update");
        mainupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainupdateActionPerformed(evt);
            }
        });
        jMenu2.add(mainupdate);

        maindelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        maindelete.setText("Delete");
        maindelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maindeleteActionPerformed(evt);
            }
        });
        jMenu2.add(maindelete);

        mainread.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mainread.setText("Read");
        mainread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainreadActionPerformed(evt);
            }
        });
        jMenu2.add(mainread);

        mainquit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mainquit.setText("Quit");
        mainquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainquitActionPerformed(evt);
            }
        });
        jMenu2.add(mainquit);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(788, 523));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void maincreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maincreateActionPerformed
        // TODO add your handling code here:
         FrmCreate create = new FrmCreate();
        create.setVisible(true);
    }//GEN-LAST:event_maincreateActionPerformed

    private void mainupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainupdateActionPerformed
        // TODO add your handling code here:
         FrmUpdate create = new FrmUpdate();
        create.setVisible(true);
    }//GEN-LAST:event_mainupdateActionPerformed

    private void maindeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maindeleteActionPerformed
        // TODO add your handling code here:
         FrmDelete create = new FrmDelete();
        create.setVisible(true);
    }//GEN-LAST:event_maindeleteActionPerformed

    private void mainreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainreadActionPerformed
        // TODO add your handling code here:
         FrmRead create = new FrmRead();
        create.setVisible(true);
    }//GEN-LAST:event_mainreadActionPerformed

    private void mainquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainquitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_mainquitActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem maincreate;
    private javax.swing.JMenuItem maindelete;
    private javax.swing.JMenuItem mainquit;
    private javax.swing.JMenuItem mainread;
    private javax.swing.JMenuItem mainupdate;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("emperador-light_logo.gif")));
    }
}