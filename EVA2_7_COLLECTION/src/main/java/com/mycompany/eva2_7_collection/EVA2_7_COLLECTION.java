package com.mycompany.eva2_7_collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class EVA2_7_COLLECTION {

    public static void main(String[] args) {
        // ---------- LINKEDLIST ----------
        LinkedList<String> miLista = new LinkedList<String>();
        miLista.add("hola");
        miLista.add("");
        miLista.add("mundo");
        miLista.add("");
        miLista.add("cruel");

        System.out.println("Contenido de la LinkedList:");
        System.out.println(miLista);
        System.out.println("Tamaño de la LinkedList: " + miLista.size());
        System.out.println("Elemento en la posición 2: " + miLista.get(2));

        // Eliminamos los elementos vacíos
        miLista.removeIf(elemento -> elemento.isEmpty());
        System.out.println("\nLinkedList sin elementos vacíos:");
        System.out.println(miLista);

        // ---------- ARRAYLIST ----------
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(100);
        miArrayList.add(200);
        miArrayList.add(300);
        miArrayList.add(400);

        System.out.println("\nContenido del ArrayList:");
        System.out.println(miArrayList);
        System.out.println("Tamaño del ArrayList: " + miArrayList.size());
        System.out.println("Primer elemento: " + miArrayList.get(0));
        System.out.println("Último elemento: " + miArrayList.get(miArrayList.size() - 1));

        // Sumar todos los elementos del ArrayList
        int suma = 0;
        for (int num : miArrayList) {
            suma += num;
        }
        System.out.println("Suma total de los elementos: " + suma);

        // Eliminar un elemento
        miArrayList.remove(2); // elimina el valor 300
        System.out.println("\nArrayList después de eliminar el índice 2:");
        System.out.println(miArrayList);
    }
}
