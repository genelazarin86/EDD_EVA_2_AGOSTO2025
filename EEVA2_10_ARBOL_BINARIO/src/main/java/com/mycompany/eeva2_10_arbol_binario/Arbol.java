/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eeva2_10_arbol_binario;

/**
 *
 * @author Admin
 */
public class Arbol {
    private Nodo raiz;
    
    public Arbol() {
        raiz = null;
    }
    
    public void agregar(int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
        } else {
            agregarRecursivo(valor, raiz);
        }
    }
    
    private void agregarRecursivo(int valor, Nodo actual) {
        Nodo nuevo = new Nodo(valor);
        
        // Si el valor es menor, va al lado izquierdo
        if (valor < actual.getValor()) {
            if (actual.getIzquierdo() == null) {
                actual.setIzquierdo(nuevo);
            } else {
                agregarRecursivo(valor, actual.getIzquierdo());
            }
        } 
        // Si el valor es mayor, va al lado derecho
        else if (valor > actual.getValor()) {
            if (actual.getDerecho() == null) {
                actual.setDerecho(nuevo);
            } else {
                agregarRecursivo(valor, actual.getDerecho());
            }
        } 
        // Si el valor es igual, no se inserta (opcional)
        else {
            System.out.println("Valor repetido: " + valor);
        }
    }
    
    // Método para recorrer el árbol en orden
    public void imprimirEnOrden() {
        imprimirEnOrdenRec(raiz);
        System.out.println();
    }
    
    private void imprimirEnOrdenRec(Nodo actual) {
        if (actual != null) {
            imprimirEnOrdenRec(actual.getIzquierdo());
            System.out.print(actual.getValor() + " ");
            imprimirEnOrdenRec(actual.getDerecho());
        }
    }
}