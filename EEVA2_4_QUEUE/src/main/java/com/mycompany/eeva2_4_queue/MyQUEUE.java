/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eeva2_4_queue;

import java.util.NoSuchElementException;

/**
 *
 * @author Admin
 */
public class MyQUEUE {
       private static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo inicio; // Apunta al primer elemento de la cola (frente)
    private Nodo fin;    // Apunta al último elemento de la cola (final)

    /**
     * Constructor para inicializar una cola vacía.
     */
    public MyQUEUE() {
        this.inicio = null;
        this.fin = null;
    }

    /**
     * Verifica si la cola está vacía.
     * @return true si la cola no tiene elementos, false en caso contrario.
     */
    public boolean estaVacia() {
        return inicio == null;
    }

    /**
     * Agrega un elemento al final de la cola (Enqueue).
     * @param dato El valor entero a agregar.
     */
    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo; // El último nodo actual apunta al nuevo
            fin = nuevo;           // El nuevo nodo es ahora el último
        }
    }

    /**
     * Agrega un elemento al final de la cola. Este método es un alias
     * de agregar() para ofrecer una sintaxis familiar de tipo "push".
     * @param dato El valor entero a agregar.
     */
    public void push(int dato) {
        agregar(dato);
    }

    /**
     * Devuelve el elemento al frente de la cola sin eliminarlo (Peek).
     * @return El valor del primer elemento.
     * @throws NoSuchElementException Si la cola está vacía.
     */
    public int peek() {
        if (estaVacia()) {
            throw new NoSuchElementException("La cola está vacía.");
        }
        return inicio.dato;
    }

    /**
     * Elimina y devuelve el elemento al frente de la cola (Dequeue).
     * @return El valor del elemento eliminado.
     * @throws NoSuchElementException Si la cola está vacía.
     */
    public int pop() {
        if (estaVacia()) {
            throw new NoSuchElementException("La cola está vacía.");
        }
        int valor = inicio.dato;   // Guarda el valor a devolver
        inicio = inicio.siguiente; // Mueve el 'inicio' al siguiente nodo
        
        // Si la cola queda vacía después de eliminar, 'fin' también debe ser null.
        if (inicio == null) {
            fin = null;
        }
        return valor;
    }
}
