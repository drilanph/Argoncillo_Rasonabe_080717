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
public class FrmUpdate extends javax.swing.JFrame {

    /**
     * Creates new form FrmUpdate
     */
    public FrmUpdate() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        updateid = new javax.swing.JTextField();
        updatename = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        updateemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        updatecontactno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        updategender = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 36));
        jLabel1.setText("UPDATE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 235, 45);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 60, 20, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 110, 40, 15);
        getContentPane().add(updateid);
        updateid.setBounds(150, 50, 237, 37);

        updatename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatenameActionPerformed(evt);
            }
        });
        getContentPane().add(updatename);
        updatename.setBounds(150, 100, 237, 34);

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 36));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate);
        btnupdate.setBounds(0, 280, 400, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("EMAIL");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 200, 35, 14);
        getContentPane().add(updateemail);
        updateemail.setBounds(150, 200, 240, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("CONTACT NO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 250, 70, 14);
        getContentPane().add(updatecontactno);
        updatecontactno.setBounds(150, 240, 240, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel7.setText("GENDER");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(94, 170, 50, 14);
        getContentPane().add(updategender);
        updategender.setBounds(150, 160, 30, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\3rd Year Account\\Desktop\\Argoncillo_Rasonabe_Guestbook_080417\\src\\com\\guestbook\\app\\emperador-light_logo.gif")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -20, 780, 320);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-416)/2, (screenSize.height-381)/2, 416, 381);
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
      
         if(SQLite.openDB()){
            int id = Integer.parseInt(this.updateid.getText());
            String name = this.updatename.getText();
            String gender = this.updategender.getText();
            String email = this.updateemail.getText();
            String contact = this.updatecontactno.getText();
            String set = "NAME=" + "'" + name + "'" + "," + "GENDER=" + "'" + gender + "'" + "," + "EMAIL=" + "'" + email + "'" + "," + "CONTACT=" + "'" + contact + "'";
            if(SQLite.update("tblGuestbook", set, id)){
                javax.swing.JOptionPane.showMessageDialog(null, "Guest has been updated!");
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(null, "Error!");
            }
            SQLite.closeDB();
        }
          this.dispose();
    }//GEN-LAST:event_btnupdateActionPerformed

private void updatenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatenameActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_updatenameActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUpdate().setVisible(true);
            }
        });
    }
    private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("emperador-light_logo.gif")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField updatecontactno;
    private javax.swing.JTextField updateemail;
    private javax.swing.JTextField updategender;
    private javax.swing.JTextField updateid;
    private javax.swing.JTextField updatename;
    // End of variables declaration//GEN-END:variables
}
