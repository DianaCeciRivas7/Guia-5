package guia5;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.*;

/**
 *
 * @author Diana Rivas Y Bryan Arevalo
 */
public class frmGuia1 extends javax.swing.JFrame {
    
    private double[] elementos = new double[10];
    private int elementosIngresados = 0;
    
    public frmGuia1() {
        initComponents();
        this.setTitle("Guia 1");
        this.setLocationRelativeTo(frmGuia1.this);
        this.setResizable(false);
        EstadoPaneles(pnlCuadrado, false);
        EstadoPaneles(pnlCubo, false);
        EstadoPaneles(pnlCircunferencia, false);
        EstadoPaneles(pnlPromedio, false);
    }
    
    private void EstadoPaneles(JPanel pnl, boolean estado) {
        Component[] componentes = pnl.getComponents();
        for (int posicion = 0; posicion < componentes.length; posicion++) {
            if (componentes[posicion] instanceof JTextField) {
                ((JTextField) componentes[posicion]).setEnabled(estado);
            } else if (componentes[posicion] instanceof JRadioButton) {
                ((JRadioButton) componentes[posicion]).setEnabled(estado);
            }
        }
    }
    
    private void EstadoRadioButtons() {
        if (rbtnCuadrado.isSelected()) {
            EstadoPaneles(pnlCubo, false);
            EstadoPaneles(pnlCircunferencia, false);
            EstadoPaneles(pnlPromedio, false);
            EstadoPaneles(pnlCuadrado, true);
        } else if (rbtnCircunferencia.isSelected()) {
            EstadoPaneles(pnlCubo, false);
            EstadoPaneles(pnlCircunferencia, true);
            EstadoPaneles(pnlPromedio, false);
            EstadoPaneles(pnlCuadrado, false);
        } else if (rbtnCubo.isSelected()) {
            EstadoPaneles(pnlCubo, true);
            EstadoPaneles(pnlCircunferencia, false);
            EstadoPaneles(pnlPromedio, false);
            EstadoPaneles(pnlCuadrado, false);
        } else if (rbtnPromedio.isSelected()) {
            EstadoPaneles(pnlCubo, false);
            EstadoPaneles(pnlCircunferencia, false);
            EstadoPaneles(pnlPromedio, true);
            EstadoPaneles(pnlCuadrado, false);
        }
    }
    
    private void ValidacionDecimales(JTextField txt, java.awt.event.KeyEvent evt) {
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter != '.' || txt.getText().contains(".")) && caracter != KeyEvent.VK_ENTER) {
            evt.consume();
        } else if (txt.getText().length() == 0) {
            if (caracter == '.') {
                evt.consume();
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pnlTitulo = new javax.swing.JPanel();
        lblCalculos = new javax.swing.JLabel();
        lblOpcionDesea = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        pnlCuadrado = new javax.swing.JPanel();
        lblIngreseLadoA = new javax.swing.JLabel();
        lblIngreseLadoB = new javax.swing.JLabel();
        txtLadoA = new javax.swing.JTextField();
        txtLadoB = new javax.swing.JTextField();
        pnlCircunferencia = new javax.swing.JPanel();
        txtRadioDiametro = new javax.swing.JTextField();
        rbtnRadio = new javax.swing.JRadioButton();
        lblRadioDiametro = new javax.swing.JLabel();
        rbtnDiametro = new javax.swing.JRadioButton();
        pnlCubo = new javax.swing.JPanel();
        txtDiagonal = new javax.swing.JTextField();
        lblIngreseDiagonal = new javax.swing.JLabel();
        pnlPromedio = new javax.swing.JPanel();
        lblDatos = new javax.swing.JLabel();
        txtDatosPromedio = new javax.swing.JTextField();
        rbtnCuadrado = new javax.swing.JRadioButton();
        rbtnCircunferencia = new javax.swing.JRadioButton();
        rbtnCubo = new javax.swing.JRadioButton();
        rbtnPromedio = new javax.swing.JRadioButton();
        lblSerieNumeros = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guia 1");

        pnlTitulo.setBackground(new java.awt.Color(0, 204, 255));

        lblCalculos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCalculos.setText("Calculos");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(lblCalculos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCalculos)
                .addContainerGap())
        );

        lblOpcionDesea.setText("Que operacion desea realizar:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblIngreseLadoA.setText("Ingrese Lado A");

        lblIngreseLadoB.setText("Ingrese Lado B");

        txtLadoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLadoAKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLadoAKeyPressed(evt);
            }
        });

        txtLadoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLadoBKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLadoBKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlCuadradoLayout = new javax.swing.GroupLayout(pnlCuadrado);
        pnlCuadrado.setLayout(pnlCuadradoLayout);
        pnlCuadradoLayout.setHorizontalGroup(
            pnlCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCuadradoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIngreseLadoA)
                    .addComponent(txtLadoA, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIngreseLadoB)
                    .addComponent(txtLadoB, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pnlCuadradoLayout.setVerticalGroup(
            pnlCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCuadradoLayout.createSequentialGroup()
                .addComponent(lblIngreseLadoA)
                .addGap(18, 18, 18)
                .addComponent(txtLadoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIngreseLadoB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLadoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        txtRadioDiametro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRadioDiametroKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRadioDiametroKeyPressed(evt);
            }
        });

        buttonGroup2.add(rbtnRadio);
        rbtnRadio.setText("Radio");
        rbtnRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRadioActionPerformed(evt);
            }
        });

        lblRadioDiametro.setText("¿Que desea ingresar?");

        buttonGroup2.add(rbtnDiametro);
        rbtnDiametro.setText("Diametro");
        rbtnDiametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDiametroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCircunferenciaLayout = new javax.swing.GroupLayout(pnlCircunferencia);
        pnlCircunferencia.setLayout(pnlCircunferenciaLayout);
        pnlCircunferenciaLayout.setHorizontalGroup(
            pnlCircunferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRadioDiametro, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlCircunferenciaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlCircunferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbtnRadio)
                    .addComponent(rbtnDiametro)
                    .addComponent(txtRadioDiametro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlCircunferenciaLayout.setVerticalGroup(
            pnlCircunferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCircunferenciaLayout.createSequentialGroup()
                .addComponent(lblRadioDiametro)
                .addGap(18, 18, 18)
                .addComponent(rbtnRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnDiametro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRadioDiametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        txtDiagonal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiagonalKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDiagonalKeyPressed(evt);
            }
        });

        lblIngreseDiagonal.setText("Ingrese Diagonal");

        javax.swing.GroupLayout pnlCuboLayout = new javax.swing.GroupLayout(pnlCubo);
        pnlCubo.setLayout(pnlCuboLayout);
        pnlCuboLayout.setHorizontalGroup(
            pnlCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCuboLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDiagonal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIngreseDiagonal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCuboLayout.setVerticalGroup(
            pnlCuboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCuboLayout.createSequentialGroup()
                .addComponent(lblIngreseDiagonal)
                .addGap(20, 20, 20)
                .addComponent(txtDiagonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblDatos.setText("Ingrese sus Datos");

        txtDatosPromedio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDatosPromedioKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDatosPromedioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlPromedioLayout = new javax.swing.GroupLayout(pnlPromedio);
        pnlPromedio.setLayout(pnlPromedioLayout);
        pnlPromedioLayout.setHorizontalGroup(
            pnlPromedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPromedioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPromedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDatosPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatos))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlPromedioLayout.setVerticalGroup(
            pnlPromedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPromedioLayout.createSequentialGroup()
                .addComponent(lblDatos)
                .addGap(20, 20, 20)
                .addComponent(txtDatosPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        buttonGroup1.add(rbtnCuadrado);
        rbtnCuadrado.setText("AyD, Cuadrado");
        rbtnCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCuadradoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnCircunferencia);
        rbtnCircunferencia.setText("Circunferencia");
        rbtnCircunferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCircunferenciaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnCubo);
        rbtnCubo.setText("Cubo");
        rbtnCubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCuboActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnPromedio);
        rbtnPromedio.setText("Promedio");
        rbtnPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPromedioActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCuadrado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlCircunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(rbtnCircunferencia))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegresar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCalcular)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLimpiar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSalir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pnlCubo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pnlPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblSerieNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbtnCubo)
                            .addComponent(lblOpcionDesea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnPromedio)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOpcionDesea)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnPromedio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnCuadrado)
                        .addComponent(rbtnCircunferencia)
                        .addComponent(rbtnCubo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCubo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSerieNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnCalcular)
                            .addComponent(btnSalir)
                            .addComponent(btnRegresar))
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlCircunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRadioActionPerformed
        txtRadioDiametro.requestFocus();
    }//GEN-LAST:event_rbtnRadioActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (rbtnCuadrado.isSelected()) {
            if (txtLadoA.getText().charAt(txtLadoA.getText().length() - 1) != '.' && txtLadoB.getText().charAt(txtLadoB.getText().length() - 1) != '.') {
                double diagonal, area, r, ladoA, ladoB, y, z;
                
                ladoA = Double.parseDouble(txtLadoA.getText());
                ladoB = Double.parseDouble(txtLadoB.getText());
                area = ladoB * ladoA;
                
                y = (int) Math.pow(ladoA, 2);
                z = (int) Math.pow(ladoB, 2);
                r = Math.sqrt((y + z));
                diagonal = Math.round(r * 100) / 100.0;
                lblResultado.setText("Area: " + (Math.round(area * 1000) / 1000.0) + ", Diagonal: " + diagonal);
            } else {
                if (txtLadoA.getText().charAt(txtLadoA.getText().length() - 1) == '.') {
                    JOptionPane.showMessageDialog(this, "Invalido");
                    txtLadoA.setText("");
                    txtLadoA.requestFocus();
                } else if (txtLadoB.getText().charAt(txtLadoB.getText().length() - 1) == '.') {
                    JOptionPane.showMessageDialog(this, "Invalido");
                    txtLadoB.setText("");
                    txtLadoB.requestFocus();
                }
            }
        } else if (rbtnCircunferencia.isSelected()) {
            if (txtRadioDiametro.getText().charAt(txtRadioDiametro.getText().length() - 1) != '.') {
                if (rbtnRadio.isSelected()) {
                    double radio, calculos;
                    radio = Double.parseDouble(txtRadioDiametro.getText());
                    calculos = (3.1416 * radio) * 2;
                    lblResultado.setText("Perimetro: " + Math.round(calculos * 100) / 100.0);
                } else {
                    double diametro, calculos;
                    diametro = Double.parseDouble(txtRadioDiametro.getText());
                    calculos = (3.1416 * diametro);
                    lblResultado.setText("Perimetro: " + Math.round(calculos * 100) / 100.0);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalido");
                txtRadioDiametro.setText("");
                txtRadioDiametro.requestFocus();
            }
        } else if (rbtnCubo.isSelected()) {
            if (txtDiagonal.getText().charAt(txtDiagonal.getText().length() - 1) != '.') {
                double diagonal, s, arista, volcubo;
                diagonal = Double.parseDouble(txtDiagonal.getText());
                s = (double) Math.sqrt(3);
                arista = diagonal / s;
                volcubo = (double) (Math.pow(arista, 3));
                lblResultado.setText("VolCubo: " + Math.round(volcubo * 100) / 100.0);
            } else {
                JOptionPane.showMessageDialog(this, "Invalido");
                txtDiagonal.setText("");
                txtDiagonal.requestFocus();
            }
        } else if (rbtnPromedio.isSelected()) {
            double sumatoria = 0, promedio;
            for (int posicion = 0; posicion < 10; posicion++) {
                sumatoria += elementos[posicion];
            }
            promedio = sumatoria / 10;
            lblResultado.setText("Promedio: " + Math.round(promedio * 100) / 100.0);
        } else {
            JOptionPane.showMessageDialog(this, "Elija una opcion");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtLadoAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadoAKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && txtLadoA.getText().length() != 0) {
            txtLadoB.requestFocus();
        }
    }//GEN-LAST:event_txtLadoAKeyPressed

    private void txtLadoBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadoBKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCalcularActionPerformed(null);
        }
    }//GEN-LAST:event_txtLadoBKeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtLadoA.setText("");
        txtLadoB.setText("");
        txtRadioDiametro.setText("");
        txtDatosPromedio.setText("");
        txtDiagonal.setText("");
        lblResultado.setText("");
        lblSerieNumeros.setText("");
        elementosIngresados = 0;
        txtDatosPromedio.setEditable(true);
        if (rbtnPromedio.isSelected()) {
            btnCalcular.setEnabled(false);
        } else {
            btnCalcular.setEnabled(true);
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtRadioDiametroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRadioDiametroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCalcularActionPerformed(null);
        }
    }//GEN-LAST:event_txtRadioDiametroKeyPressed

    private void rbtnDiametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDiametroActionPerformed
        txtRadioDiametro.requestFocus();
    }//GEN-LAST:event_rbtnDiametroActionPerformed

    private void rbtnCuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCuboActionPerformed
        EstadoRadioButtons();
        txtDiagonal.requestFocus();
        btnLimpiarActionPerformed(evt);
    }//GEN-LAST:event_rbtnCuboActionPerformed

    private void rbtnPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPromedioActionPerformed
        EstadoRadioButtons();
        txtDatosPromedio.requestFocus();
        JOptionPane.showMessageDialog(this, "Ingrese 10 elementos.\nPresione ENTER para aniadir cada elemento");
        btnCalcular.setEnabled(false);
        btnLimpiarActionPerformed(evt);
    }//GEN-LAST:event_rbtnPromedioActionPerformed

    private void txtDiagonalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiagonalKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCalcularActionPerformed(null);
        }
    }//GEN-LAST:event_txtDiagonalKeyPressed

    private void txtDatosPromedioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatosPromedioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtDatosPromedio.getText().isEmpty()) {
                if (txtDatosPromedio.getText().charAt(txtDatosPromedio.getText().length() - 1) != '.') {
                    double elemento;
                    elemento = Double.parseDouble(txtDatosPromedio.getText());
                    elementos[elementosIngresados] = elemento;
                    txtDatosPromedio.setText("");
                    lblSerieNumeros.setText(lblSerieNumeros.getText() + elemento + " ");
                    elementosIngresados++;
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Invalido");
                    txtDatosPromedio.setText("");
                }
                if (elementosIngresados == 10) {
                    txtDatosPromedio.setEditable(false);
                    btnCalcular.setEnabled(true);
                    btnCalcular.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_txtDatosPromedioKeyPressed

    private void rbtnCircunferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCircunferenciaActionPerformed
        EstadoRadioButtons();
        btnLimpiarActionPerformed(evt);
    }//GEN-LAST:event_rbtnCircunferenciaActionPerformed

    private void txtLadoAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadoAKeyTyped
        ValidacionDecimales(txtLadoA, evt);
    }//GEN-LAST:event_txtLadoAKeyTyped

    private void txtLadoBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadoBKeyTyped
        ValidacionDecimales(txtLadoB, evt);
    }//GEN-LAST:event_txtLadoBKeyTyped

    private void txtRadioDiametroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRadioDiametroKeyTyped
        ValidacionDecimales(txtRadioDiametro, evt);
    }//GEN-LAST:event_txtRadioDiametroKeyTyped

    private void txtDiagonalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiagonalKeyTyped
        ValidacionDecimales(txtDiagonal, evt);
    }//GEN-LAST:event_txtDiagonalKeyTyped

    private void txtDatosPromedioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatosPromedioKeyTyped
        ValidacionDecimales(txtDatosPromedio, evt);
    }//GEN-LAST:event_txtDatosPromedioKeyTyped

    private void rbtnCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCuadradoActionPerformed
        EstadoRadioButtons();
        btnLimpiarActionPerformed(evt);
        txtLadoA.requestFocus();
    }//GEN-LAST:event_rbtnCuadradoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        frmMenu VentanaMenu = new frmMenu();
        VentanaMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGuia1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel lblCalculos;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblIngreseDiagonal;
    private javax.swing.JLabel lblIngreseLadoA;
    private javax.swing.JLabel lblIngreseLadoB;
    private javax.swing.JLabel lblOpcionDesea;
    private javax.swing.JLabel lblRadioDiametro;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSerieNumeros;
    private javax.swing.JPanel pnlCircunferencia;
    private javax.swing.JPanel pnlCuadrado;
    private javax.swing.JPanel pnlCubo;
    private javax.swing.JPanel pnlPromedio;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JRadioButton rbtnCircunferencia;
    private javax.swing.JRadioButton rbtnCuadrado;
    private javax.swing.JRadioButton rbtnCubo;
    private javax.swing.JRadioButton rbtnDiametro;
    private javax.swing.JRadioButton rbtnPromedio;
    private javax.swing.JRadioButton rbtnRadio;
    private javax.swing.JTextField txtDatosPromedio;
    private javax.swing.JTextField txtDiagonal;
    private javax.swing.JTextField txtLadoA;
    private javax.swing.JTextField txtLadoB;
    private javax.swing.JTextField txtRadioDiametro;
    // End of variables declaration//GEN-END:variables
}
