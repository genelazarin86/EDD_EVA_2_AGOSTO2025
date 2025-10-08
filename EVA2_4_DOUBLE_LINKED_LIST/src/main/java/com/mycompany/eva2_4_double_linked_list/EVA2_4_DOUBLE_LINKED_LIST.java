/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_double_linked_list;

/**
 *
 * @author Admin
 */
public class EVA2_4_DOUBLE_LINKED_LIST {

    public static void main(String[] args) {
     ListaDoble lista = new ListaDoble();
        
        System.out.println("--- Agregando elementos a la lista ---");
        lista.agregarAlFinal(10); // Agrega 10 al final
        lista.agregarAlFinal(20); // Agrega 20 al final
        lista.agregarAlFinal(30); // Agrega 30 al final
        lista.agregarAlInicio(5);  // Agrega 5 al inicio
        
        // Imprimimos la lista para ver los resultados.
        // Esperado: 5 <-> 10 <-> 20 <-> 30 <-> null
        lista.imprimirDesdeInicio();
        
        // Imprimimos el tamaño de la lista.
        // Esperado: 4
        System.out.println("Tamaño actual de la lista: " + lista.size());
        
        System.out.println("\n--- Insertando un elemento en una posición específica ---");
        // Insertamos el 15 en la posición 2 (después del 10).
        // La lista debería ser: 5 <-> 10 <-> 15 <-> 20 <-> 30 <-> null
        lista.insertarEn(15, 2);
        lista.imprimirDesdeInicio();
        System.out.println("Nuevo tamaño de la lista: " + lista.size());
        
        System.out.println("\n--- Buscando elementos ---");
        // Buscamos un elemento que sí existe.
        System.out.println("¿Se encuentra el número 20 en la lista? " + lista.buscarEn(20)); // Esperado: true
        // Buscamos un elemento que no existe.
        System.out.println("¿Se encuentra el número 99 en la lista? " + lista.buscarEn(99)); // Esperado: false

        System.out.println("\n--- Eliminando un elemento por su valor ---");
        // Eliminamos el 10.
        // La lista debería ser: 5 <-> 15 <-> 20 <-> 30 <-> null
        lista.eliminar(10);
        lista.imprimirDesdeInicio();
        System.out.println("Tamaño después de eliminar: " + lista.size());
        
        System.out.println("\n--- Probando métodos tipo Cola/Pila (pop y peek) ---");
        try {
            // Vemos cuál es el primer elemento.
            System.out.println("Elemento en el frente (peek): " + lista.peek()); // Esperado: 5
            
            // Sacamos el primer elemento de la lista.
            int valorEliminado = lista.pop();
            System.out.println("Elemento sacado (pop): " + valorEliminado); // Esperado: 5
            
            // Imprimimos la lista para ver el resultado.
            // La lista debería ser: 15 <-> 20 <-> 30 <-> null
            lista.imprimirDesdeInicio();
            System.out.println("Tamaño actual: " + lista.size());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- Imprimiendo la lista desde el final ---");
        // Esperado: 30 <-> 20 <-> 15 <-> null
        lista.imprimirDesdeFinal();

        System.out.println("\n--- Vaciando la lista ---");
        lista.vaciarLista();
        
        // Comprobamos si la lista está realmente vacía.
        System.out.println("¿La lista está vacía? " + lista.isEmpty()); // Esperado: true
        lista.imprimirDesdeInicio(); // Esperado: La lista está vacía.
    }
}
