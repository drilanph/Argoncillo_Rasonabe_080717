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
public class FrmCreate extends javax.swing.JFrame {

    /**
     * Creates new form FrmCreate
     */
    public FrmCreate() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        createname = new javax.swing.JTextField();
        createid = new javax.swing.JTextField();
        creategender = new javax.swing.JTextField();
        createemail = new javax.swing.JTextField();
        createcontact = new javax.swing.JTextField();
        btncreate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(getBackground());
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 36));
        jLabel1.setText("Create");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 90, 45);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 30, 20, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(112, 80, 40, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setText("GENDER");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 180, 48, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setText("EMAIL");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(104, 130, 50, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setText("CONTACTNO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(72, 230, 80, 15);
        getContentPane().add(createname);
        createname.setBounds(160, 70, 223, 32);

        createid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createidActionPerformed(evt);
            }
        });
        getContentPane().add(createid);
        createid.setBounds(160, 20, 223, 32);
        getContentPane().add(creategender);
        creategender.setBounds(160, 170, 30, 33);
        getContentPane().add(createemail);
        createemail.setBounds(160, 120, 223, 32);
        getContentPane().add(createcontact);
        createcontact.setBounds(160, 220, 223, 31);

        btncreate.setFont(new java.awt.Font("Tahoma", 1, 36));
        btncreate.setText("Create");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });
        getContentPane().add(btncreate);
        btncreate.setBounds(2, 263, 400, 60);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(319, 0, 0, 0);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\3rd Year Account\\Desktop\\Argoncillo_Rasonabe_Guestbook_080417\\src\\com\\guestbook\\app\\emperador-light_logo.gif")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 400, 260);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-416)/2, (screenSize.height-359)/2, 416, 359);
    }// </editor-fold>//GEN-END:initComponents

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
             if(SQLite.openDB()){
            String id = this.createid.getText();
            String name = this.createname.getText();
            String gender = this.creategender.getText();
            String email = this.createemail.getText();
            String contact = this.createcontact.getText();
            String values = id + "," + "'" + name + "'" +"," +"'"+gender+"'"+ ","+"'"+email+"'" +","+contact ;
            if(SQLite.create("tblGuestbook", values)){
                javax.swing.JOptionPane.showMessageDialog(null, "New Guest has been created!");
            }
            else{
                javax.swing.JOptionPane.showMessageDialog(null, "Error!");
            }
            SQLite.closeDB();
        }
    }//GEN-LAST:event_btncreateActionPerformed

    private void createidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createidActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCreate().setVisible(true);
            }
        });
    }
 private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("emperador-light_logo.gif")));
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreate;
    private javax.swing.JTextField createcontact;
    private javax.swing.JTextField createemail;
    private javax.swing.JTextField creategender;
    private javax.swing.JTextField createid;
    private javax.swing.JTextField createname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
