/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_double_linked_list;

/**
 *
 * @author Admin
 */
import java.util.NoSuchElementException;

public class ListaDoble {

    private Nodo inicio;
    private Nodo fin;
    // 1. CORRECCIÓN: Se añade la variable para controlar el tamaño de la lista.
    private int tamano;

    private static class Nodo {
        int dato;
        Nodo anterior, siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.anterior = null;
            this.siguiente = null;
        }
    }

    // Constructor para inicializar la lista vacía.
    public ListaDoble() {
        this.inicio = null;
        this.fin = null;
        this.tamano = 0;
    }
    
    // 2. CORRECCIÓN: El método ahora devuelve la variable 'tamano' correcta.
    public int size() {
        return tamano;
    }
    
    public boolean isEmpty() {
        return tamano == 0;
    }

    public void agregarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (isEmpty()) {
            inicio = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            fin = nuevo;
        }
        // Se incrementa el tamaño.
        tamano++;
    }

    public void agregarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (isEmpty()) {
            inicio = fin = nuevo;
        } else {
            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
            inicio = nuevo;
        }
        // Se incrementa el tamaño.
        tamano++;
    }

    public void eliminar(int dato) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.dato == dato) {
                // Si el nodo a eliminar es el primero.
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    inicio = actual.siguiente;
                }
                // Si el nodo a eliminar es el último.
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    fin = actual.anterior;
                }
                // 3. CORRECCIÓN: Se decrementa el tamaño.
                tamano--;
                System.out.println("Nodo con el dato " + dato + " eliminado.");
                return; // Termina el método una vez eliminado.
            }
            actual = actual.siguiente;
        }
        System.out.println("Nodo con el dato " + dato + " no encontrado.");
    }

    public void imprimirDesdeInicio() {
        if (isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo actual = inicio;
        System.out.print("Lista (inicio a fin): ");
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public void imprimirDesdeFinal() {
        if (isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo actual = fin;
        System.out.print("Lista (fin a inicio): ");
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.anterior;
        }
        System.out.println("null");
    }

    public int findKth(int k) throws IndexOutOfBoundsException {
        if (k < 0 || k >= tamano) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + k);
        }
        Nodo actual = inicio;
        for (int i = 0; i < k; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    public void insertarEn(int dato, int posicion) throws IndexOutOfBoundsException {
        if (posicion < 0 || posicion > tamano) {
            throw new IndexOutOfBoundsException("Posición fuera de rango. La posición debe estar entre 0 y " + tamano);
        }
        if (posicion == 0) {
            agregarAlInicio(dato);
        } else if (posicion == tamano) {
            agregarAlFinal(dato);
        } else {
            Nodo nuevo = new Nodo(dato);
            Nodo temp = inicio;
            for (int i = 0; i < posicion - 1; i++) {
                temp = temp.siguiente;
            }
            Nodo siguiente = temp.siguiente;
            temp.siguiente = nuevo;
            nuevo.anterior = temp;
            nuevo.siguiente = siguiente;
            siguiente.anterior = nuevo;
            // Se incrementa el tamaño.
            tamano++;
        }
    }

    // --- MÉTODOS TIPO PILA/COLA ---

    // Agrega al final (comportamiento de cola o pila)
    public void push(int valor) {
        agregarAlFinal(valor);
    }

    // 4. CORRECIÓN: Elimina el primer elemento (comportamiento de cola)
    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("No se puede hacer pop en una lista vacía.");
        }
        int valor = inicio.dato;
        inicio = inicio.siguiente;
        // Si la lista no queda vacía, se elimina la referencia anterior del nuevo inicio.
        if (inicio != null) {
            inicio.anterior = null;
        } else {
            // Si la lista queda vacía, el fin también debe ser nulo.
            fin = null;
        }
        tamano--;
        return valor;
    }

    // Devuelve el primer elemento sin eliminarlo.
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("No se puede hacer peek en una lista vacía.");
        }
        return inicio.dato;
    }
    
    // --- NUEVOS MÉTODOS SOLICITADOS ---

    /**
     * Busca un dato en la lista.
     * @param dato El valor a buscar.
     * @return true si el dato se encuentra en la lista, false en caso contrario.
     */
    public boolean buscarEn(int dato) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.dato == dato) {
                return true; // Se encontró el dato.
            }
            actual = actual.siguiente;
        }
        return false; // No se encontró el dato tras recorrer toda la lista.
    }
    
    /**
     * Elimina todos los nodos de la lista, dejándola vacía.
     */
    public void vaciarLista() {
        inicio = null;
        fin = null;
        tamano = 0;
        System.out.println("La lista ha sido vaciada.");
    }
}