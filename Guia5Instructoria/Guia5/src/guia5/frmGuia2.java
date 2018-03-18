package guia5;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmGuia2 extends javax.swing.JFrame {

    private int contabilizadorElementos = 0, progreso, avance;
    private String[] caracteres = new String[10];
    private String burbuja;
    private char caracterAuxiliar1, caracterAuxiliar2;

    public frmGuia2() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        lblElementos.setText("Ingrese el elemento #" + (contabilizadorElementos + 1));
        txtaArreglo.setEditable(false);
        btnOrdenar.setEnabled(false);
        txtElementos.setToolTipText("Entre A-Z");
        avance = Math.round(100 / caracteres.length);
        progreso = Math.round(100 / caracteres.length);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdatos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMetodo = new javax.swing.JLabel();
        lblElementos = new javax.swing.JLabel();
        txtElementos = new javax.swing.JTextField();
        jBarradeProgreso = new javax.swing.JProgressBar();
        lblArreglo = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaArreglo = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();

        javax.swing.GroupLayout jdatosLayout = new javax.swing.GroupLayout(jdatos);
        jdatos.setLayout(jdatosLayout);
        jdatosLayout.setHorizontalGroup(
            jdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jdatosLayout.setVerticalGroup(
            jdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practica 5");
        setIconImage(new ImageIcon(getClass().getResource("/Images/IconoGuia2.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Guia 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        lblMetodo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMetodo.setForeground(new java.awt.Color(0, 0, 0));
        lblMetodo.setText("Metodo de la Burbuja:");

        lblElementos.setToolTipText("");

        txtElementos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtElementosKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtElementosKeyPressed(evt);
            }
        });

        lblArreglo.setText("Arreglo Ordenado");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        txtaArreglo.setColumns(20);
        txtaArreglo.setRows(5);
        jScrollPane1.setViewportView(txtaArreglo);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnregresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrdenar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblArreglo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lblMetodo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBarradeProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMetodo)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jBarradeProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblArreglo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOrdenar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnregresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnsalir)))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtaArreglo.setText("");
        btnOrdenar.setEnabled(false);
        contabilizadorElementos = 0;
        lblElementos.setText("Ingrese el elemento #" + (contabilizadorElementos + 1));
        txtElementos.setEnabled(true);
        btnAgregar.setEnabled(true);
        txtElementos.requestFocus();
        jBarradeProgreso.setValue(0);
        progreso = Math.round(100 / caracteres.length);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        for (int posicion1 = 0; posicion1 < contabilizadorElementos; posicion1++) {
            for (int posicion2 = posicion1; posicion2 < contabilizadorElementos; posicion2++) {
                caracterAuxiliar1 = caracteres[posicion1].charAt(0);
                caracterAuxiliar2 = caracteres[posicion2].charAt(0);
                if (caracterAuxiliar1 > caracterAuxiliar2) {
                    burbuja = caracteres[posicion2];
                    caracteres[posicion2] = caracteres[posicion1];
                    caracteres[posicion1] = burbuja;
                }
            }
        }
        String arreglo = "";
        for (int posicion = 0; posicion < contabilizadorElementos; posicion++) {
            arreglo += caracteres[posicion] + "\n";
        }
        txtaArreglo.setText(arreglo);
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        frmMenu VentanaMenu = new frmMenu();
        VentanaMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnregresarActionPerformed

    private void txtElementosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtElementosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAgregarActionPerformed(null);
        }
    }//GEN-LAST:event_txtElementosKeyPressed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (contabilizadorElementos <= 9) {
            if (!txtElementos.getText().isEmpty()) {
                caracteres[contabilizadorElementos] = txtElementos.getText();
                String arreglo = "";
                for (int posicion = 0; posicion <= contabilizadorElementos; posicion++) {
                    arreglo += caracteres[posicion] + "\n";
                }
                txtaArreglo.setText(arreglo);
                contabilizadorElementos++;
                jBarradeProgreso.setValue(progreso);
                jBarradeProgreso.setStringPainted(true);
                progreso += avance;
                btnOrdenar.setEnabled(true);
                if (contabilizadorElementos != 10) {
                    lblElementos.setText("Ingrese el elemento #" + (contabilizadorElementos + 1));
                    txtElementos.setText("");
                    txtElementos.requestFocus();
                } else {
                    txtElementos.setEnabled(false);
                    btnAgregar.setEnabled(false);
                    txtElementos.setText("");
                    btnLimpiar.requestFocus();
                }
                System.out.println(contabilizadorElementos);
            } else {
                JOptionPane.showMessageDialog(this, "Campo vacio");
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtElementosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtElementosKeyTyped
        char caracter = evt.getKeyChar();
        caracter = Character.toUpperCase(caracter);
        evt.setKeyChar(caracter);
        if (txtElementos.getText().length() == 0) {
            if (caracter < 'A' || caracter > 'Z') {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtElementosKeyTyped

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
            java.util.logging.Logger.getLogger(frmGuia2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGuia2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGuia2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGuia2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGuia2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JProgressBar jBarradeProgreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jdatos;
    private javax.swing.JLabel lblArreglo;
    private javax.swing.JLabel lblElementos;
    private javax.swing.JLabel lblMetodo;
    private javax.swing.JTextField txtElementos;
    private javax.swing.JTextArea txtaArreglo;
    // End of variables declaration//GEN-END:variables
}
