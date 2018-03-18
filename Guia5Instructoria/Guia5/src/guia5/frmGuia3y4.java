package guia5;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class frmGuia3y4 extends javax.swing.JFrame {

    public frmGuia3y4() {
        LlenarModelo();
        initComponents();

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        txtaPropiedades.setEditable(false);
        txtCamaraPrincipal.setEnabled(false);
        txtCamaraSecundaria.setEnabled(false);
    }

    public void ActivarTxt(JCheckBox ch, JTextField txt) {

        if (ch.isSelected()) {
            txt.setEnabled(true);
        } else {
            txt.setEnabled(false);
            txt.setText("");
        }
    }

    public void LlenarModelo() {
        String contenidoModelo[] = {"NEXUS", "PIXIE", "LENOVO", "HUAWEI", "SONY", "APPLE", "SAMSUNG", "ALCATEL", "LG", "OTRA"};
        for (int posicion = 0; posicion < contenidoModelo.length; posicion++) {
            cmbMarcasModel.addElement(contenidoModelo[posicion]);
        }
    }

    public void ControlPunto(char caracter, String texto, java.awt.event.KeyEvent evt) {
        CharSequence car = ".";
        int contabilizadorCar = 0;
        BuclePunto:
        for (int posicion = 0; posicion < texto.length(); posicion++) {
            boolean flagContiene = ("" + texto.charAt(posicion)).contains(car);
            if (flagContiene == true) {
                contabilizadorCar++;
                if (contabilizadorCar >= 1) {
                    if (caracter == '.') {
                        evt.consume();
                        break BuclePunto;
                    }
                }
            }
        }
    }

    public void ValidacionesTxtCamaras(java.awt.event.KeyEvent evt, char caracter, String texto) {
        if (texto.length() >= 4) {
            evt.consume();
        } else if (texto.length() == 0 || texto.length() == 3) {
            if (caracter == '.') {
                evt.consume();
            }
        }

        ControlPunto(caracter, texto, evt);

        char[] caracteres = texto.toCharArray();
        for (int posicion = 0; posicion < caracteres.length; posicion++) {
            if (caracteres[posicion] == '.') {
                flagPunto = true;
                break;
            } else {
                flagPunto = false;
            }
        }

        if (flagPunto == true) {
            if ((caracter < '0' || caracter > '9') && caracter != '.') {
                evt.consume();
            }
        } else {
            if (texto.length() == 2) {
                if (caracter != '.') {
                    evt.consume();
                }
            } else if ((caracter < '0' || caracter > '9') && caracter != '.') {
                evt.consume();
            }
        }
    }

    private int refDeMarca(String marca) {
        if (marca.equals("NEXUS") || marca.equals("LENOVO") || marca.equals("HUAWEI") || marca.equals("SONY") || marca.equals("APPLE")) {
            PuntajeMarca = 4;
        } else if (marca.equals("SAMSUNG") || marca.equals("ALCATEL") || marca.equals("LG")) {
            PuntajeMarca = 3;
        } else {
            PuntajeMarca = 2;
        }
        return PuntajeMarca;

    }

    private int rangoPrecio(Double precio) {
        if (precio < 100) {
            PuntajePrecio = 2;
        } else if (precio >= 100 && precio <= 350) {
            PuntajePrecio = 3;
        } else {
            PuntajePrecio = 4;
        }
        return PuntajePrecio;
    }

    private int garantia(int garantia) {
        if (garantia <= 3) {
            PuntajeGarantia = 1;
        } else if (garantia > 3 && garantia <= 6) {
            PuntajeGarantia = 2;
        } else {
            PuntajeGarantia = 4;
        }
        return PuntajeGarantia;
    }

    private int pixelaje(double PixelCamaraPrincipal, double PixelCamaraFrontal, boolean TieneFlash) {
        if (PixelCamaraPrincipal <= 5) {
            if (PixelCamaraFrontal <= 2) {
                PuntajePixelaje = 1;
            } else {
                PuntajePixelaje = 2;
            }
        } else if (PixelCamaraPrincipal > 5 && PixelCamaraPrincipal <= 8) {
            if (PixelCamaraFrontal <= 2) {
                PuntajePixelaje = 1;
            } else if (PixelCamaraFrontal > 2 && PixelCamaraFrontal < 3) {
                PuntajePixelaje = 2;
            } else {
                PuntajePixelaje = 3;
            }
        } else {
            if (PixelCamaraFrontal <= 2) {
                PuntajePixelaje = 1;
            } else if (PixelCamaraFrontal > 2 && PixelCamaraFrontal <= 5) {
                PuntajePixelaje = 2;
            } else {
                PuntajePixelaje = 3;
            }
        }
        if (TieneFlash != true) {
            PuntajePixelaje = PuntajePixelaje - 1;
        }
        return PuntajePixelaje;
    }

    private int Ram(Double Ram) {
        if (Ram <= 1) {
            PuntajeRam = 0;
        } else if (Ram > 1 && Ram <= 2) {
            PuntajeRam = 2;
        } else if (Ram > 2 && Ram <= 4) {
            PuntajeRam = 4;
        } else {
            PuntajeRam = 6;
        }
        return PuntajeRam;
    }

    private int BateriaPantalla(int BateriaMah, double pantalla) {
        if (pantalla <= 4) {
            if (BateriaMah <= 1200) {
                PuntajeBateriaPantalla = 3;
            } else if (BateriaMah > 1200 && BateriaMah <= 2400) {
                PuntajeBateriaPantalla = 4;
            } else if (BateriaMah > 24000 && BateriaMah <= 3100) {
                PuntajeBateriaPantalla = 5;
            } else {
                PuntajeBateriaPantalla = 6;
            }
        } else if (pantalla <= 5) {
            if (BateriaMah <= 1200) {
                PuntajeBateriaPantalla = 1;
            } else if (BateriaMah > 1200 && BateriaMah <= 2400) {
                PuntajeBateriaPantalla = 2;
            } else if (BateriaMah > 24000 && BateriaMah <= 3100) {
                PuntajeBateriaPantalla = 3;
            } else {
                PuntajeBateriaPantalla = 4;
            }
        } else if (pantalla <= 6.7) {
            if (BateriaMah <= 1200) {
                PuntajeBateriaPantalla = 0;
            } else if (BateriaMah > 1200 && BateriaMah <= 2400) {
                PuntajeBateriaPantalla = 1;
            } else if (BateriaMah > 24000 && BateriaMah <= 3100) {
                PuntajeBateriaPantalla = 2;
            } else {
                PuntajeBateriaPantalla = 3;
            }
        }
        return PuntajeBateriaPantalla;
    }

    private int PuntajeCpu(int Cpu) {
        if (Cpu == 2) {
            PuntajeCpu = 0;
        } else if (Cpu == 4) {
            PuntajeCpu = 1;
        } else if (Cpu == 6) {
            PuntajeCpu = 2;
        } else {
            PuntajeCpu = 3;
        }
        return PuntajeCpu;
    }

    private void CalcularPuntaje() {
        puntaje = PuntajeMarca + PuntajePrecio + PuntajeGarantia + PuntajePixelaje + PuntajeRam + PuntajeBateriaPantalla + PuntajeCpu;
    }

    private String Inversion() {
        String impresion;
        CalcularPuntaje();
        if (puntaje <= 7) {
            impresion = "No es buena inversion";
        } else if (puntaje > 7 && puntaje <= 14) {
            impresion = "Inversión de riesgo";
        } else if (puntaje >= 15 && puntaje <= 21) {
            impresion = "Inversion viable";
        } else {
            impresion = "Buena inversion";
        }
        return "Puntaje obtenido:" + puntaje + "\n" + impresion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCpu = new javax.swing.JLabel();
        txtCpu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPantalla = new javax.swing.JTextField();
        lblRam = new javax.swing.JLabel();
        txtRam = new javax.swing.JTextField();
        lblGarantia = new javax.swing.JLabel();
        txtGarantia = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        cmbMarcas = new javax.swing.JComboBox<>();
        lblCamara = new javax.swing.JLabel();
        chbPrincipal = new javax.swing.JCheckBox();
        chbSecundaria = new javax.swing.JCheckBox();
        chbFlash = new javax.swing.JCheckBox();
        txtCamaraPrincipal = new javax.swing.JTextField();
        txtCamaraSecundaria = new javax.swing.JTextField();
        btnEjecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaPropiedades = new javax.swing.JTextArea();
        lblBateria = new javax.swing.JLabel();
        txtBateria = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practica 5");
        setIconImage(new ImageIcon(getClass().getResource("/Images/IconoGuia3y4.png")).getImage());

        lblTitulo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblTitulo.setText("Puntaje de moviles");

        lblCpu.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCpu.setText("Cpu numero de nucleos:");

        txtCpu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpuFocusLost(evt);
            }
        });
        txtCpu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpuKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCpuKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Tamaño de pantalla:");

        txtPantalla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPantallaFocusLost(evt);
            }
        });
        txtPantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPantallaKeyTyped(evt);
            }
        });

        lblRam.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRam.setText("Cantidad de RAM:");

        txtRam.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRamFocusLost(evt);
            }
        });
        txtRam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRamKeyTyped(evt);
            }
        });

        lblGarantia.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblGarantia.setText("Tiempo de garantia:");

        txtGarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGarantiaKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGarantiaKeyReleased(evt);
            }
        });

        lblPrecio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblPrecio.setText("Precio:");

        txtPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecioFocusLost(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        lblMarca.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMarca.setText("Marca:");

        cmbMarcas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbMarcas.setModel(cmbMarcasModel);
        cmbMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcasActionPerformed(evt);
            }
        });

        lblCamara.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCamara.setText("Camaras:");

        chbPrincipal.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        chbPrincipal.setText("Principal");
        chbPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbPrincipalActionPerformed(evt);
            }
        });

        chbSecundaria.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        chbSecundaria.setText("Secundaria");
        chbSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbSecundariaActionPerformed(evt);
            }
        });

        chbFlash.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        chbFlash.setText("Flash");

        txtCamaraPrincipal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCamaraPrincipalFocusLost(evt);
            }
        });
        txtCamaraPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCamaraPrincipalKeyTyped(evt);
            }
        });

        txtCamaraSecundaria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCamaraSecundariaFocusLost(evt);
            }
        });
        txtCamaraSecundaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCamaraSecundariaKeyTyped(evt);
            }
        });

        btnEjecutar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        txtaPropiedades.setColumns(20);
        txtaPropiedades.setRows(5);
        jScrollPane1.setViewportView(txtaPropiedades);

        lblBateria.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblBateria.setText("Bateria:");

        txtBateria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBateriaFocusLost(evt);
            }
        });
        txtBateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBateriaKeyTyped(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCpu)
                                    .addComponent(jLabel1)
                                    .addComponent(lblRam)
                                    .addComponent(lblGarantia)
                                    .addComponent(lblPrecio)
                                    .addComponent(lblBateria))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCpu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(txtPantalla, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRam, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGarantia, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(txtBateria, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblMarca)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(202, 202, 202))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCamara)
                                    .addGap(48, 48, 48)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCamaraPrincipal)
                                        .addComponent(chbPrincipal))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCamaraSecundaria)
                                        .addComponent(chbSecundaria))
                                    .addGap(43, 43, 43)
                                    .addComponent(chbFlash))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(171, 171, 171)
                                    .addComponent(btnRegresar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEjecutar))))))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpu)
                    .addComponent(txtCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRam)
                    .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGarantia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBateria)
                    .addComponent(txtBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(cmbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCamara)
                    .addComponent(chbPrincipal)
                    .addComponent(chbSecundaria)
                    .addComponent(chbFlash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCamaraPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCamaraSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEjecutar)
                    .addComponent(btnRegresar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpuKeyTyped
        char caracter = evt.getKeyChar();
        textoCpu = txtCpu.getText();
        if (textoCpu.length() >= 1) {
            evt.consume();
        } else if (caracter < '0' || caracter > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCpuKeyTyped

    private void txtCpuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpuKeyReleased
        textoCpu = txtCpu.getText();
        if (!txtCpu.getText().isEmpty()) {
            if (Integer.parseInt(textoCpu) < 2 || Integer.parseInt(textoCpu) > 8) {
                txtCpu.setText("");
            }
        }
    }//GEN-LAST:event_txtCpuKeyReleased

    private void txtPantallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPantallaKeyTyped
        textoPantalla = txtPantalla.getText();
        char caracter = evt.getKeyChar();
        if (textoPantalla.length() >= 3) {
            evt.consume();
        } else if (textoPantalla.length() == 1) {
            if (caracter != '.') {
                evt.consume();
            }
        } else if (caracter < '0' || caracter > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtPantallaKeyTyped

    private void txtPantallaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPantallaFocusLost
        if (!txtPantalla.getText().isEmpty()) {
            if (txtPantalla.getText().length() <= 2) {
                double num = Math.round(Double.parseDouble(txtPantalla.getText()) * 10) / 10.0;
                txtPantalla.setText("" + num);
            }
            textoPantalla = txtPantalla.getText();
            if (textoPantalla.length() == 3) {
                if (Double.parseDouble(textoPantalla) < 3.0 || Double.parseDouble(textoPantalla) > 6.7) {
                    txtPantalla.setText("");
                    JOptionPane.showMessageDialog(null, "Campo incorrecto");
                }
            }
        }

    }//GEN-LAST:event_txtPantallaFocusLost

    private void txtRamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRamKeyTyped
        textoRam = txtRam.getText();
        char caracter = evt.getKeyChar();
        if (textoRam.length() >= 3) {
            evt.consume();
        } else if (textoRam.length() == 1) {
            if (caracter != '.') {
                evt.consume();
            }
        } else if (caracter < '0' || caracter > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtRamKeyTyped

    private void txtRamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRamFocusLost
        if (!txtRam.getText().isEmpty()) {
            if (txtRam.getText().length() <= 2) {
                double num = Math.round(Double.parseDouble(txtRam.getText()) * 10) / 10.0;
                txtRam.setText("" + num);
            }
            textoRam = txtRam.getText();
            if (textoRam.length() == 3) {
                if (Double.parseDouble(textoRam) < 0.5 || Double.parseDouble(textoRam) > 6.0) {
                    txtRam.setText("");
                    JOptionPane.showMessageDialog(null, "Campo incorrecto");
                }
            }
        }
    }//GEN-LAST:event_txtRamFocusLost

    private void txtGarantiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGarantiaKeyTyped
        char caracter = evt.getKeyChar();
        textoGarantia = txtGarantia.getText();
        if (textoGarantia.length() >= 2) {
            evt.consume();
        } else if (caracter < '0' || caracter > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtGarantiaKeyTyped

    private void txtGarantiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGarantiaKeyReleased
        textoGarantia = txtGarantia.getText();
        if (!txtGarantia.getText().isEmpty()) {
            if (Integer.parseInt(textoGarantia) < 1 || Integer.parseInt(textoGarantia) > 24) {
                txtGarantia.setText("");
            }
        }
    }//GEN-LAST:event_txtGarantiaKeyReleased

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char caracter = evt.getKeyChar();
        textoPrecio = txtPrecio.getText();
        if (textoPrecio.length() >= 6) {
            evt.consume();
        } else if (textoPrecio.length() == 0 || textoPrecio.length() == 5) {
            if (caracter == '.') {
                evt.consume();
            }
        }
        ControlPunto(caracter, textoPrecio, evt);
        char[] caracteres = textoPrecio.toCharArray();
        for (int posicion = 0; posicion < caracteres.length; posicion++) {
            if (caracteres[posicion] == '.') {
                flagPunto = true;
                break;
            } else {
                flagPunto = false;
            }
        }

        if (flagPunto == true) {
            if ((caracter < '0' || caracter > '9') && caracter != '.') {
                evt.consume();
            }
        } else {
            if (textoPrecio.length() == 4) {
                if (caracter != '.') {
                    evt.consume();
                }
            } else if ((caracter < '0' || caracter > '9') && caracter != '.') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioFocusLost
        if (!txtPrecio.getText().isEmpty()) {
            if (txtPrecio.getText().length() == 6) {
                if (txtPrecio.getText().charAt(2) == '.' || txtPrecio.getText().charAt(1) == '.') {
                    double num = Math.round(Double.parseDouble(txtPrecio.getText()) * 100) / 100.0;
                    txtPrecio.setText("" + num);
                }
            } else {
                double num = Math.round(Double.parseDouble(txtPrecio.getText()) * 100) / 100.0;
                txtPrecio.setText("" + num);
            }
            textoPrecio = txtPrecio.getText();
            if (!textoPrecio.isEmpty()) {
                if (Double.parseDouble(textoPrecio) < 0.01 || Double.parseDouble(textoPrecio) > 999.99) {
                    txtPrecio.setText("");
                    JOptionPane.showMessageDialog(null, "Campo incorrecto");
                }
            }
        }
    }//GEN-LAST:event_txtPrecioFocusLost

    private void chbPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbPrincipalActionPerformed
        ActivarTxt(chbPrincipal, txtCamaraPrincipal);
    }//GEN-LAST:event_chbPrincipalActionPerformed

    private void chbSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbSecundariaActionPerformed
        ActivarTxt(chbSecundaria, txtCamaraSecundaria);
    }//GEN-LAST:event_chbSecundariaActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        if (flagComboBox != true || txtCamaraPrincipal.getText().isEmpty() || txtCamaraSecundaria.getText().isEmpty() || txtBateria.getText().isEmpty() || txtCpu.getText().isEmpty() || txtPantalla.getText().isEmpty() || txtRam.getText().isEmpty() || txtGarantia.getText().isEmpty() || txtPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete los campos.");
        } else {
            salida = "El numero de cpu es:  ";
            salida += txtCpu.getText() + "\t\tEl tamanio de pantalla es:  " + txtPantalla.getText() + "\nLa ram es de:  " + txtRam.getText()
                    + "\t\tLa garantia es de:  " + txtGarantia.getText() + "\nSu precio es de:  $" + txtPrecio.getText() + "\t\t y la marca es:  ";
            int eleccionMarca = cmbMarcas.getSelectedIndex();
            switch (eleccionMarca) {
                case 0:
                    salida += "NEXUS\nPosee camara:  ";
                    refDeMarca("NEXUS");
                    break;
                case 1:
                    salida += "PIXIE\nPosee camara:  ";
                    refDeMarca("PIXIE");
                    break;
                case 2:
                    salida += "LENOVO\nPosee camara:  ";
                    refDeMarca("LENOVO");
                    break;
                case 3:
                    salida += "HUAWEI\nPosee camara:  ";
                    refDeMarca("HUAWEI");
                    break;
                case 4:
                    salida += "SONY\nPosee camara:  ";
                    refDeMarca("SONY");
                    break;
                case 5:
                    salida += "APPLE\nPosee camara:  ";
                    refDeMarca("APPLE");
                    break;
                case 6:
                    salida += "SAMSUNG\nPosee camara:  ";
                    refDeMarca("SAMSUNG");
                    break;
                case 7:
                    salida += "ALCATEL\nPosee camara:  ";
                    refDeMarca("ALCATEL");
                    break;
                case 8:
                    salida += "LG\nPosee camara:  ";
                    refDeMarca("LG");
                    break;
                default:
                    salida += "OTRA\nPosee camara:  ";
                    refDeMarca("OTRA");
                    break;
            }
            if (chbPrincipal.isSelected()) {
                salida += "Principal de " + txtCamaraPrincipal.getText() + " mpx. ";
            }
            if (chbSecundaria.isSelected()) {
                salida += " Secundaria de " + txtCamaraSecundaria.getText() + " mpx. ";
            }
            if (chbFlash.isSelected()) {
                salida += "Posee flash.";
            }

            txtaPropiedades.setText(salida);

            BateriaPantalla(Integer.parseInt(txtBateria.getText()), Double.parseDouble(txtPantalla.getText()));
            rangoPrecio(Double.parseDouble(txtPrecio.getText()));
            pixelaje(Double.parseDouble(txtCamaraPrincipal.getText()), Double.parseDouble(txtCamaraSecundaria.getText()), chbFlash.isSelected());
            garantia(Integer.parseInt(txtGarantia.getText()));
            PuntajeCpu(Integer.parseInt(txtCpu.getText()));
            Ram(Double.parseDouble(txtRam.getText()));
            CalcularPuntaje();
            JOptionPane.showMessageDialog(this, Inversion(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void txtCamaraPrincipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCamaraPrincipalKeyTyped
        char caracter = evt.getKeyChar();
        textoCamaraPrincipal = txtCamaraPrincipal.getText();
        ValidacionesTxtCamaras(evt, caracter, textoCamaraPrincipal);
    }//GEN-LAST:event_txtCamaraPrincipalKeyTyped

    private void txtCamaraSecundariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCamaraSecundariaKeyTyped
        char caracter = evt.getKeyChar();
        textoCamaraSecundaria = txtCamaraSecundaria.getText();
        ValidacionesTxtCamaras(evt, caracter, textoCamaraSecundaria);
    }//GEN-LAST:event_txtCamaraSecundariaKeyTyped

    private void cmbMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcasActionPerformed
        flagComboBox = true;
    }//GEN-LAST:event_cmbMarcasActionPerformed

    private void txtCamaraPrincipalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCamaraPrincipalFocusLost
        if (!txtCamaraPrincipal.getText().isEmpty()) {
            double num = Math.round(Double.parseDouble(txtCamaraPrincipal.getText()) * 1000) / 1000.0;
            txtCamaraPrincipal.setText("" + num);
        }
    }//GEN-LAST:event_txtCamaraPrincipalFocusLost

    private void txtCamaraSecundariaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCamaraSecundariaFocusLost
        if (!txtCamaraSecundaria.getText().isEmpty()) {
            double num = Math.round(Double.parseDouble(txtCamaraSecundaria.getText()) * 1000) / 1000.0;
            txtCamaraSecundaria.setText("" + num);
        }
    }//GEN-LAST:event_txtCamaraSecundariaFocusLost

    private void txtCpuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpuFocusLost
        if (!txtCpu.getText().isEmpty()) {
            if (Integer.parseInt(txtCpu.getText()) % 2 == 1) {
                txtCpu.setText("");
                JOptionPane.showMessageDialog(null, "Campo incorrecto");
            }
        }
    }//GEN-LAST:event_txtCpuFocusLost

    private void txtBateriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBateriaKeyTyped
        char caracter = evt.getKeyChar();
        if (caracter < '0' || caracter > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtBateriaKeyTyped

    private void txtBateriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBateriaFocusLost
        if (!txtBateria.getText().isEmpty()) {
            if (Integer.parseInt(txtBateria.getText()) < 1000 || Integer.parseInt(txtBateria.getText()) > 1625) {
                txtBateria.setText("");
                JOptionPane.showMessageDialog(null, "Campo incorrecto");
            }
        }
    }//GEN-LAST:event_txtBateriaFocusLost

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        frmMenu VentanaMenu = new frmMenu();
        VentanaMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmGuia3y4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGuia3y4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGuia3y4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGuia3y4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGuia3y4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JCheckBox chbFlash;
    private javax.swing.JCheckBox chbPrincipal;
    private javax.swing.JCheckBox chbSecundaria;
    private javax.swing.JComboBox<String> cmbMarcas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBateria;
    private javax.swing.JLabel lblCamara;
    private javax.swing.JLabel lblCpu;
    private javax.swing.JLabel lblGarantia;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblRam;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtBateria;
    private javax.swing.JTextField txtCamaraPrincipal;
    private javax.swing.JTextField txtCamaraSecundaria;
    private javax.swing.JTextField txtCpu;
    private javax.swing.JTextField txtGarantia;
    private javax.swing.JTextField txtPantalla;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextArea txtaPropiedades;
    // End of variables declaration//GEN-END:variables

    private String textoCpu, textoPantalla, textoRam, textoGarantia, textoPrecio, textoCamaraPrincipal, textoCamaraSecundaria, salida;
    private boolean flagPunto, flagComboBox = false;
    private DefaultComboBoxModel cmbMarcasModel = new DefaultComboBoxModel();
    private int PuntajeMarca, PuntajePrecio, PuntajeGarantia, PuntajePixelaje, PuntajeRam, PuntajeBateriaPantalla, PuntajeCpu;
    private double puntaje;
}
