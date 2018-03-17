/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.awt.Window;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author wzamora
 */
public class PanelBurbuja extends javax.swing.JPanel {

    /**
     * Creates new form PanelBurbuja
     */
    //creo el modelo para ingresar datos a la lista
    //JList lista = new JList(new DefaultListModel());
    DefaultListModel listamodelo = new DefaultListModel();
    DefaultListModel lista = new DefaultListModel();
   // JList listamodeloOrdenado = new JList(new DefaultListModel());
    DefaultListModel listamodeloOrdenado = new DefaultListModel();
    private int tam;
    private int progreso;
    int avance=0;
    //private int burbuja;
    public PanelBurbuja() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLBurbuja = new javax.swing.JLabel();
        jRadioAscendente = new javax.swing.JRadioButton();
        jRadioDescendente = new javax.swing.JRadioButton();
        jLTam = new javax.swing.JLabel();
        jTextTam = new javax.swing.JTextField();
        jLabelElemento = new javax.swing.JLabel();
        jLElemVar = new javax.swing.JLabel();
        jTextElemento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListOriginal = new javax.swing.JList<>();
        jLOriginal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListOrdenado = new javax.swing.JList<>();
        jBLimpiar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBOrdenar = new javax.swing.JButton();
        jBInsertar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jProgressBar = new javax.swing.JProgressBar();

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLBurbuja.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jLBurbuja.setText("Metodo de la Burbuja");

        buttonGroup1.add(jRadioAscendente);
        jRadioAscendente.setText("Ascendente");
        jRadioAscendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioAscendenteActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioDescendente);
        jRadioDescendente.setText("Descendente");
        jRadioDescendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioDescendenteActionPerformed(evt);
            }
        });

        jLTam.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLTam.setText("INGRESE EL TAM DEL ARREGLO");

        jTextTam.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jTextTam.setText("0");
        jTextTam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTamActionPerformed(evt);
            }
        });
        jTextTam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextTamKeyPressed(evt);
            }
        });

        jLabelElemento.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabelElemento.setText("Elemento:");

        jLElemVar.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLElemVar.setText("X");

        jTextElemento.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jTextElemento.setText("0");
        jTextElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextElementoActionPerformed(evt);
            }
        });
        jTextElemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextElementoKeyPressed(evt);
            }
        });

        jListOriginal.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jListOriginal);

        jLOriginal.setText("Arreglo Original");

        jLabel1.setText("Arreglo Ordenado");

        jListOrdenado.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(jListOrdenado);

        jBLimpiar.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBOrdenar.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jBOrdenar.setText("Ordenar");
        jBOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOrdenarActionPerformed(evt);
            }
        });

        jBInsertar.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jBInsertar.setText("Insertar");
        jBInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsertarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jProgressBar.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jRadioAscendente)
                .addGap(94, 94, 94)
                .addComponent(jRadioDescendente))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabelElemento)
                .addGap(10, 10, 10)
                .addComponent(jLElemVar)
                .addGap(7, 7, 7)
                .addComponent(jTextElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBLimpiar)
                            .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBOrdenar)
                            .addComponent(jBInsertar)
                            .addComponent(jBEliminar)))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLTam)
                            .addGap(13, 13, 13)
                            .addComponent(jTextTam, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jLBurbuja)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLBurbuja)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jRadioAscendente))
                    .addComponent(jRadioDescendente))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTam)
                    .addComponent(jTextTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelElemento)
                    .addComponent(jLElemVar)
                    .addComponent(jTextElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLOriginal)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBOrdenar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLBurbuja.getAccessibleContext().setAccessibleName("LBurbuja");
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void jRadioAscendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioAscendenteActionPerformed
        // TODO add your handling code here:
        jTextTam.setFocusable(true);
    }//GEN-LAST:event_jRadioAscendenteActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
       jTextTam.setEnabled(false);
    }//GEN-LAST:event_formFocusGained

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        Window w = SwingUtilities.getWindowAncestor(this);
        w.setVisible(false);
        w.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        // TODO add your handling code here:
        jTextTam.setText("");
        jTextElemento.setText("");
        jRadioAscendente.setSelected(true);
        jTextTam.requestFocus();
        listamodelo.clear();
        listamodeloOrdenado.clear();
    }//GEN-LAST:event_jBLimpiarActionPerformed
 
    private void jTextElementoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextElementoKeyPressed
        // TODO add your handling code here:
        //verifica que se presione enter y que no este vacio el texto
        
        
        avance=Math.round(100/tam);
        if(evt.getKeyCode()== KeyEvent.VK_ENTER && jTextElemento.getText().length()!=0){
            
           //ingresamos los datos a la lista            
           if(listamodelo.size()<tam){
           listamodelo.addElement(jTextElemento.getText());                  
           jListOriginal.setModel(listamodelo);
           jProgressBar.setValue(progreso);
           jProgressBar.setStringPainted(true);
           progreso=progreso+avance;
           //limpiamos el texto
           jTextElemento.setText("");
           }else{
              JOptionPane.showMessageDialog(jLabelElemento,"Ya no puede ingresar mas elementos");
           }
        }       
    }//GEN-LAST:event_jTextElementoKeyPressed

    private void jTextTamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTamKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER && jTextTam.getText().length()!=0){
        tam=Integer.parseInt(jTextTam.getText());
        jTextElemento.requestFocus(); // le paso el puntero a elemento
        progreso = Math.round(100/tam);
        }
    }//GEN-LAST:event_jTextTamKeyPressed

    private void jBOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOrdenarActionPerformed
        //ascendente
        if(jRadioAscendente.isSelected()){
           listamodeloOrdenado = listamodelo;
            int elemento,elementoSig;
            for(int j=0;j<this.listamodeloOrdenado.getSize()-1;j++){
                for(int i=0;i<this.listamodeloOrdenado.getSize()-1;i++){
                    elemento=Integer.parseInt(this.listamodeloOrdenado.elementAt(i).toString());
                    elementoSig=Integer.parseInt(this.listamodeloOrdenado.elementAt(i+1).toString());
                    if(elemento>elementoSig){   
                        this.listamodeloOrdenado.setElementAt(elementoSig, i);
                        this.listamodeloOrdenado.setElementAt(elemento, i+1);             
                    }
                }
            } 
        }
        //descendente
        if(jRadioDescendente.isSelected()){
            listamodeloOrdenado = listamodelo;
            int elemento,elementoSig;
            for(int j=0;j<this.listamodeloOrdenado.getSize()-1;j++){
                for(int i=0;i<this.listamodeloOrdenado.getSize()-1;i++){
                    elemento=Integer.parseInt(this.listamodeloOrdenado.elementAt(i).toString());
                    elementoSig=Integer.parseInt(this.listamodeloOrdenado.elementAt(i+1).toString());
                    if(elemento<elementoSig){   
                        this.listamodeloOrdenado.setElementAt(elementoSig, i);
                        this.listamodeloOrdenado.setElementAt(elemento, i+1);             
                    }
                }
            }
        }
               
        jListOrdenado.setModel(listamodeloOrdenado);
       // jListOriginal.setModel(lista);
    }//GEN-LAST:event_jBOrdenarActionPerformed

    private void jBInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertarActionPerformed
      listamodelo.addElement(JOptionPane.showInputDialog("Ingrese el nuevo dato"));
      jListOriginal.setModel(listamodelo);
    }//GEN-LAST:event_jBInsertarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if(jListOrdenado.isSelectedIndex(jListOrdenado.getSelectedIndex())){
        listamodelo.removeElementAt(jListOrdenado.getSelectedIndex());
        jListOriginal.setModel(listamodelo);
        }else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar un elemento de la lista para ser eliminado");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jTextTamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTamActionPerformed

    private void jTextElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextElementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextElementoActionPerformed

    private void jRadioDescendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioDescendenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioDescendenteActionPerformed
public void ventanaAbierta(){
    jRadioAscendente.setSelected(true);
    //jRadioDescendente.setSelected(true);
    jTextTam.setText("");
    jTextElemento.setText("");
            
        } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBInsertar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBOrdenar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLBurbuja;
    private javax.swing.JLabel jLElemVar;
    private javax.swing.JLabel jLOriginal;
    private javax.swing.JLabel jLTam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelElemento;
    private javax.swing.JList<String> jListOrdenado;
    private javax.swing.JList<String> jListOriginal;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JRadioButton jRadioAscendente;
    private javax.swing.JRadioButton jRadioDescendente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextElemento;
    private javax.swing.JTextField jTextTam;
    // End of variables declaration//GEN-END:variables
}
