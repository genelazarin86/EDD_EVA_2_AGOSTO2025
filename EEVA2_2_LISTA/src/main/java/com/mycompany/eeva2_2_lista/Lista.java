
package com.mycompany.eeva2_2_lista;



/**
 *
 * @author Admin
 */
public class Lista {
    private Nodo inicio;
    public Lista(){
    inicio = null;
    }
    public void agregar(int valor){
 Nodo nuevo = new Nodo (valor);       
//verificr si la lista esta vacia
       if (inicio == null){
       inicio = nuevo;
       
       }else{
       Nodo temp = inicio;
       while (temp.getSiguiente()!= null){
           temp = temp.getSiguiente();
       
       }
       }
    
    }
}
