/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eeva2_10_tipos_genericos;

/**
 *
 * @author Admin
 */
public class EEVA2_10_TIPOS_GENERICOS {

    public static void main(String[] args) {
        Nodo<String> nodo = new Nodo<>(); // tipo String
        nodo.setValor("Juan Pérez");

        System.out.println("El valor del nodo es: " + nodo.getValor());
    }
}

// Clase genérica
class Nodo<T> {
    private T valor;         // ← Tipo genérico
    private Nodo<T> siguiente;
    private Nodo<T> previo;

    // Constructor vacío
    public Nodo() {
        this.valor = null;
        this.siguiente = null;
        this.previo = null;
    }

    // Constructor con valor
    public Nodo(T valor) {
        this.valor = valor;
        this.siguiente = null;
        this.previo = null;
    }

    // Getter y Setter para valor
    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    // Getter y Setter para siguiente
    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    // Getter y Setter para previo
    public Nodo<T> getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo<T> previo) {
        this.previo = previo;
    }
}
