/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eeva2_2_lista;

/**
 *
 * @author Admin
 */
public class EEVA2_2_LISTA {

    public static void main(String[] args) {
        // 1. Creamos una nueva instancia de la Lista
        Lista miLista = new Lista();
        
        System.out.println("--- DEMOSTRACIÓN DE MÉTODOS DE LISTA ENLAZADA ---");
        System.out.println("La lista recién creada, ¿está vacía? " + miLista.listaVacia()); // Salida: true
        
        // 2. Usamos el método agregar() para añadir nodos al final
        System.out.println("\n-> Agregando 4 elementos (10, 20, 30, 40)...");
        miLista.agregar(10);
        miLista.agregar(20);
        miLista.agregar(30);
        miLista.agregar(40);
        
        // 3. Imprimimos la lista y su tamaño
        System.out.println("Contenido de la lista:");
        miLista.imprimir(); // Salida: 10 - 20 - 30 - 40 - 
        System.out.println("El tamaño de la lista es: " + miLista.size()); // Salida: 4
        System.out.println("La lista después de agregar, ¿está vacía? " + miLista.listaVacia()); // Salida: false

        // 4. Usamos el método insertarEn()
        System.out.println("\n-> Insertando elementos...");
        System.out.println("Insertando el 5 al inicio (posición 0):");
        miLista.insertarEn(5, 0);
        miLista.imprimir(); // Salida: 5 - 10 - 20 - 30 - 40 - 
        
        System.out.println("Insertando el 25 en medio (posición 3):");
        miLista.insertarEn(25, 3);
        miLista.imprimir(); // Salida: 5 - 10 - 20 - 25 - 30 - 40 - 
        
        System.out.println("Insertando el 50 al final (posición 6):");
        miLista.insertarEn(50, 6);
        miLista.imprimir(); // Salida: 5 - 10 - 20 - 25 - 30 - 40 - 50 - 

        // 5. Usamos el método borrarEn()
        System.out.println("\n-> Borrando elementos...");
        System.out.println("Borrando el primer elemento (posición 0):");
        miLista.borrarEn(0);
        miLista.imprimir(); // Salida: 10 - 20 - 25 - 30 - 40 - 50 - 
        
        System.out.println("Borrando un elemento intermedio (el 30 en la nueva posición 3):");
        miLista.borrarEn(3);
        miLista.imprimir(); // Salida: 10 - 20 - 25 - 40 - 50 - 
        
        System.out.println("Borrando el último elemento (posición " + (miLista.size() - 1) + "):");
        miLista.borrarEn(miLista.size() - 1);
        miLista.imprimir(); // Salida: 10 - 20 - 25 - 40 - 
        System.out.println("Tamaño final de la lista: " + miLista.size()); // Salida: 4

        // 6. Probamos un caso de error (borrar fuera de los límites)
        try {
            System.out.println("\n-> Intentando borrar en una posición inválida (99)...");
            miLista.borrarEn(99);
        } catch (RuntimeException e) {
            System.err.println("ERROR CAPTURADO: " + e.getMessage());
        }
        
        // 7. Usamos el método vaciarList()
        System.out.println("\n-> Vaciando la lista...");
        miLista.vaciarList();
        System.out.println("El tamaño de la lista ahora es: " + miLista.size()); // Salida: 0
        System.out.println("La lista después de vaciar, ¿está vacía? " + miLista.listaVacia()); // Salida: true
        System.out.println("Contenido de la lista vacía:");
        miLista.imprimir(); // Salida: (línea vacía)
    }
}