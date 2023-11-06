import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Administrator
 */
public class UserRegistration extends javax.swing.JFrame {

    /**
     * Creates new form AdminGUI
     */
    public UserRegistration() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        javax.swing.JButton registerBtt = new javax.swing.JButton();
        returnBtt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        idadeField = new javax.swing.JTextField();
        nomeField = new javax.swing.JTextField();
        sexoBox = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        passField = new javax.swing.JPasswordField();
        javax.swing.JButton clearBtt = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  Nome");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 133, 240, 70));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Idade");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, 80));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sexo");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 308, 240, 74));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Livro preferido 1");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 394, 240, 82));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Livro preferido 2");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 494, 240, 73));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Senha");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 586, 240, 73));

        registerBtt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        registerBtt.setText("Cadastrar");
        registerBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBttActionPerformed(evt);
            }
        });
        getContentPane().add(registerBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 147, 66));

        returnBtt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        returnBtt.setText("Voltar");
        returnBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBttActionPerformed(evt);
            }
        });
        getContentPane().add(returnBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 700, 134, 66));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cadastrar usuário");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 520, 90));

        idadeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeFieldActionPerformed(evt);
            }
        });
        getContentPane().add(idadeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 331, 74));

        nomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nomeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 331, 68));

        sexoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        sexoBox.setToolTipText("Selecionar sexo");
        getContentPane().add(sexoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 331, 74));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null", "romance", "ficcao", "tecnico" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 331, 74));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null", "romance", "ficcao", "tecnico" }));
        jComboBox1.setToolTipText("Inserir livro prefirido nº 1 do usuário");
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 331, 73));
        getContentPane().add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 331, 64));

        clearBtt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clearBtt.setText("Limpar");
        clearBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBttActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 700, 147, 66));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vector-JUL-2020-129.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBttActionPerformed
        // TODO add your handling code here:
        String nome = nomeField.getText();
        String idade = idadeField.getText();
        String sexo = (String) sexoBox.getSelectedItem();
        String lp1 = (String) jComboBox1.getSelectedItem();
        String lp2 = (String) jComboBox2.getSelectedItem();
        String pass1 = (String) passField.getText();
        
        //System.out.println(nome + idade + sexo + lp1 + lp2);
        boolean userAdded = DatabaseUtil.addUser(nome, pass1, idade, sexo, lp1, lp2);
        if (userAdded){
            int iduser = DatabaseUtil.returnIDuser(nome, pass1);
            JOptionPane.showMessageDialog(null,"Usuário adicionado com sucesso!");
            
            JOptionPane.showMessageDialog(null,"Seu ID é: " + iduser + "Sua senha é" + pass1);
        } else {
            JOptionPane.showMessageDialog(null,"Usuário adicionado com sucesso!");
        }
    }//GEN-LAST:event_registerBttActionPerformed

    private void nomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFieldActionPerformed

    private void idadeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeFieldActionPerformed

    private void returnBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBttActionPerformed
        // TODO add your handling code here:
        AdminGUI guiadm = new AdminGUI();
        guiadm.setVisible(true);
        dispose();
    }//GEN-LAST:event_returnBttActionPerformed

    private void clearBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBttActionPerformed

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
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idadeField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nomeField;
    private javax.swing.JPasswordField passField;
    private javax.swing.JButton returnBtt;
    private javax.swing.JComboBox<String> sexoBox;
    // End of variables declaration//GEN-END:variables
}
