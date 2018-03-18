package guia5;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmLogin extends javax.swing.JFrame {

    private final String usuario = "ADMIN", password = "123ABC";
    private final char signo;

    public frmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        txtUsuario.setToolTipText("Mayusculas");
        txtPassUsuario.setToolTipText("Mayusculas");
        signo = txtPassUsuario.getEchoChar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassUsuario = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JButton();
        checkboxVisible = new javax.swing.JCheckBox();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practica 5");
        setIconImage(new ImageIcon(getClass().getResource("/Images/IconoLogin.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Bienvenido usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(128, 128, 128))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        lblUsuario.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario:");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(204, 204, 204));
        txtUsuario.setBorder(null);
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 249, 20));

        lblPassword.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtPassUsuario.setBackground(new java.awt.Color(204, 204, 204));
        txtPassUsuario.setBorder(null);
        txtPassUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtPassUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 249, 20));

        btnAcceder.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/acceder_1.png"))); // NOI18N
        btnAcceder.setText("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 110, 30));

        checkboxVisible.setBorder(null);
        checkboxVisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxVisibleActionPerformed(evt);
            }
        });
        getContentPane().add(checkboxVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        String usuarioIngresado = txtUsuario.getText();
        String passwordIngresado = new String(txtPassUsuario.getPassword());
        if (usuarioIngresado.equals(usuario)) {
            if (passwordIngresado.equals(password)) {
                JOptionPane.showMessageDialog(this, "Te has logeado correctamente.");
                frmMenu VentanaMenu = new frmMenu();
                VentanaMenu.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Usuario y contrasena  no coinciden");
                txtPassUsuario.setText("");
                txtPassUsuario.requestFocus();
            }
        } else {
            if (!passwordIngresado.equals(password)) {
                JOptionPane.showMessageDialog(this, "Usuario y contrasena  no coinciden");
                txtUsuario.setText("");
                txtPassUsuario.setText("");
                txtUsuario.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario y contrasena  no coinciden");
                txtUsuario.setText("");
                txtUsuario.requestFocus();
            }
        }
    }//GEN-LAST:event_btnAccederActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPassUsuario.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtPassUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAccederActionPerformed(null);
        }
    }//GEN-LAST:event_txtPassUsuarioKeyPressed

    private void checkboxVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxVisibleActionPerformed
        if (checkboxVisible.isSelected()) {
            txtPassUsuario.setEchoChar((char) 0);
        } else {
            txtPassUsuario.setEchoChar(signo);
        }
    }//GEN-LAST:event_checkboxVisibleActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JCheckBox checkboxVisible;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtPassUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
