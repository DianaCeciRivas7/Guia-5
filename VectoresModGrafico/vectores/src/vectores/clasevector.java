
package vectores;

import java.util.Scanner;

public class clasevector {
    
   private int burbuja;
    int tam;
    int agregar;
    int indice;
    private int[] vec;
    Scanner teclado = new Scanner(System.in);
    
    public clasevector(){
        this.tam=0;
      //  this.burbuja=0;
        this.vec=null;        
    }
    
    public void pedirDatos(){
        do{
            System.out.println("Ingresar el tamano del vector: ");
            tam= teclado.nextInt();            
        }while(tam<1 || tam >1000);
    }
    public void datosVector(){
        vec=new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.println( " Ingrese el elemento " +i+" del vector por favor: ");
            vec[i]=teclado.nextInt();            
        }
    }
    public void mostrarVector(){
        System.out.println("Los elementos del vector son: ");
        for(int i=0; i<tam;i++){
            System.out.println("Vector["+i+"]="+vec[i]);
        }       
          
    }
    public void ordenaVector(){
        for (int i=0;(i<tam-1);i++){
            for (int j = 0; j < (tam-1); j++) {
                
         if(vec[j]<vec[j+1]){
            burbuja=vec[j];
            vec[j]=vec[j+1];
            vec[j+1]=burbuja;
                    
         }
 
 }
        }
        for (int i = 0; i < tam; i++) {
            System.out.println( vec[i]+" ");
            
        }
        

}
    
    public void agregandoDatos(){
        System.out.println(" Ingrese el numero a agregar");
        agregar=teclado.nextInt();
        for (int i = 0; i < tam; i++) {
            if (vec[i]>agregar) {
                indice=i;
            break;
            }else{
                indice=tam;
                
            }
            
        }
        tam=tam+1;
        for (int i = tam; i > indice; i--) {
            vec[i]=vec[i-1];
            
        }
        vec[indice]=agregar;
        for (int i = 0; i <tam; i++) {
            System.out.println(vec[i]+"");
        }
   
    }
}

