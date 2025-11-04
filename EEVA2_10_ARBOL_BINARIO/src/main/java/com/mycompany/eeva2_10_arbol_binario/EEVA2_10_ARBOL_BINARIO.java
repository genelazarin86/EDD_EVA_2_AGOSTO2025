/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eeva2_10_arbol_binario;

/**
 *
 * @author Admin
 */
public class EEVA2_10_ARBOL_BINARIO {

    public static void main(String[] args) { 
        Arbol arbol = new Arbol();
        arbol.agregar(10);
        arbol.agregar(5);
        arbol.agregar(15);
        arbol.agregar(8);
        arbol.agregar(3);

        System.out.println("Recorrido en orden:");
        arbol.imprimirEnOrden();  // Salida: 3 5 8 10 15
     
    }
}
