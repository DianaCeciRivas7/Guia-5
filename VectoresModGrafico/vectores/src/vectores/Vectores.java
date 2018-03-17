/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.awt.LayoutManager;



/**
 *
 * @author william
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // private javax.swing.JFrame frame;
        javax.swing.JFrame marco = new javax.swing.JFrame();        
        PanelBurbuja Pburbuja = new PanelBurbuja();
        marco.add(Pburbuja);
        marco.setVisible(true);
        Pburbuja.ventanaAbierta();
        
        //marco.setLocationRelativeTo(null);
        marco.setLocation(300, 150);
        marco.setSize(500, 500);
        

       
        //claseBurbuja bur = new claseBurbuja();
        //bur.Ordenar();
        //bur.agregandoDatos();
    }
    
}
