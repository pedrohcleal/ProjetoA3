/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class AdminGUI extends javax.swing.JFrame {

    /**
     * Creates new form AdminGUI
     */
    public AdminGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        deleteUserBtt = new javax.swing.JButton();
        userRegisterBtt = new javax.swing.JButton();
        returnBtt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Opções admin");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 278, 62));

        deleteUserBtt.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        deleteUserBtt.setText("Excluir usuário");
        deleteUserBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBttActionPerformed(evt);
            }
        });
        getContentPane().add(deleteUserBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 254, 213, 57));

        userRegisterBtt.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        userRegisterBtt.setText("Cadastrar usuário");
        userRegisterBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRegisterBttActionPerformed(evt);
            }
        });
        getContentPane().add(userRegisterBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 143, 213, 67));

        returnBtt.setText("Voltar");
        returnBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBttActionPerformed(evt);
            }
        });
        getContentPane().add(returnBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 348, 118, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vector-JUL-2020-129.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userRegisterBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRegisterBttActionPerformed
        // TODO add your handling code here:
        UserRegistration openRegister = new UserRegistration();
        openRegister.setVisible(true);
        dispose();
    }//GEN-LAST:event_userRegisterBttActionPerformed

    private void returnBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBttActionPerformed
        // TODO add your handling code here:
        Login abrirLogin = new Login();
        abrirLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_returnBttActionPerformed

    private void deleteUserBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBttActionPerformed
        // TODO add your handling code here:
        DeleteUserAdmin deleteUser = new DeleteUserAdmin();
        deleteUser.setVisible(true);
        dispose();
    }//GEN-LAST:event_deleteUserBttActionPerformed

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
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteUserBtt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton returnBtt;
    private javax.swing.JButton userRegisterBtt;
    // End of variables declaration//GEN-END:variables

}
