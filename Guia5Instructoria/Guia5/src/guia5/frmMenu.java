package guia5;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class frmMenu extends javax.swing.JFrame {

    public frmMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupOpciones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        rbtnGuia1 = new javax.swing.JRadioButton();
        rbtnGuia2 = new javax.swing.JRadioButton();
        rbtnGuia3y4 = new javax.swing.JRadioButton();
        btnOk = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practica 5");
        setIconImage(new ImageIcon(getClass().getResource("/Images/menu.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(140, 140, 140))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addContainerGap())
        );

        btnGroupOpciones.add(rbtnGuia1);
        rbtnGuia1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbtnGuia1.setText("App guia 1");
        rbtnGuia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbtnGuia1KeyPressed(evt);
            }
        });

        btnGroupOpciones.add(rbtnGuia2);
        rbtnGuia2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbtnGuia2.setText("App guia 2");
        rbtnGuia2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbtnGuia2KeyPressed(evt);
            }
        });

        btnGroupOpciones.add(rbtnGuia3y4);
        rbtnGuia3y4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        rbtnGuia3y4.setText("App guia 3 y 4");
        rbtnGuia3y4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbtnGuia3y4KeyPressed(evt);
            }
        });

        btnOk.setText("Siguiente");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnGuia1)
                    .addComponent(rbtnGuia3y4)
                    .addComponent(rbtnGuia2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOk)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(rbtnGuia1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnGuia2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnGuia3y4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (rbtnGuia1.isSelected()) {
            frmGuia1 VentanaGuia1 = new frmGuia1();
            VentanaGuia1.setVisible(true);
            this.setVisible(false);
        } else if (rbtnGuia2.isSelected()) {
            frmGuia2 VentanaGuia2 = new frmGuia2();
            VentanaGuia2.setVisible(true);
            this.setVisible(false);
        } else if (rbtnGuia3y4.isSelected()) {
            frmGuia3y4 VentanaGuia3y4 = new frmGuia3y4();
            VentanaGuia3y4.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Elija una opcion.");
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void rbtnGuia1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbtnGuia1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnOkActionPerformed(null);
        }
    }//GEN-LAST:event_rbtnGuia1KeyPressed

    private void rbtnGuia2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbtnGuia2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnOkActionPerformed(null);
        }
    }//GEN-LAST:event_rbtnGuia2KeyPressed

    private void rbtnGuia3y4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbtnGuia3y4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnOkActionPerformed(null);
        }
    }//GEN-LAST:event_rbtnGuia3y4KeyPressed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupOpciones;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtnGuia1;
    private javax.swing.JRadioButton rbtnGuia2;
    private javax.swing.JRadioButton rbtnGuia3y4;
    // End of variables declaration//GEN-END:variables
}
