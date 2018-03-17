/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

/**
 *
 * @author william
 */
public class claseBurbuja extends clasevector{
    private int burbuja;
   
    
    
    public claseBurbuja(){           
           super.tam=0;
    }
    
    public void Ordenar(){
        super.pedirDatos();
        super.datosVector();
        super.mostrarVector();
         super.ordenaVector();                  
        }
    }
  

