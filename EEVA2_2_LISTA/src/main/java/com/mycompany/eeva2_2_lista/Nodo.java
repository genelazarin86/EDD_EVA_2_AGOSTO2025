/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eeva2_2_lista;

/**
 *
 * @author Admin
 */
public class Nodo {
   
    private int valor;
    private Nodo siguiente;
    public Nodo(){
    siguiente = null; // final de lista
    }
    
    public Nodo (int valor){
    this.valor = valor;
    this.siguiente= null;
    }
    public int getValor() {
            return valor;
        }

        // Setter for 'valor'
        public void setValor(int valor) {
            this.valor = valor;
        }

        // Getter for 'siguiente'
        public Nodo getSiguiente() {
            return siguiente;
        }

        // Setter for 'siguiente'
        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }

