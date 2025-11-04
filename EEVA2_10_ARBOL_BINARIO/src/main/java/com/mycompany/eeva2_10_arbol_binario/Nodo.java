/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eeva2_10_arbol_binario;

/**
 *
 * @author Admin
 */
public class Nodo {
    
    // --- Atributos ---
    // Son privados para protegerlos (encapsulamiento)
    private int valor;
    private Nodo izquierdo;
    private Nodo derecho;

    // --- Constructor ---
    // Este es el constructor que la clase Arbol SÍ puede usar.
    // Recibe un valor y lo asigna.
    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null; // Se asegura de que los hijos empiecen como nulos
        this.derecho = null;
    }

    // --- Getters y Setters ---
    // Métodos PÚBLICOS que permiten a otras clases
    // interactuar con los atributos PRIVADOS.

    // Permite a Arbol LEER el valor
    public int getValor() {
        return valor;
    }

    // Permite a Arbol LEER el hijo izquierdo
    public Nodo getIzquierdo() {
        return izquierdo;
    }

    // Permite a Arbol ESTABLECER el hijo izquierdo
    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    // Permite a Arbol LEER el hijo derecho
    public Nodo getDerecho() {
        return derecho;
    }

    // Permite a Arbol ESTABLECER el hijo derecho
    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
}