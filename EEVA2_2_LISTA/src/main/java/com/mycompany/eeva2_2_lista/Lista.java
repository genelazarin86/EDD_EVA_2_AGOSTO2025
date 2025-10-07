package com.mycompany.eeva2_2_lista;

/**
 *
 * @author Admin
 */
public class Lista {
    private Nodo inicio;
    private Nodo fin;

    public Lista() {
        inicio = null;
        fin = null; // Inicializar fin también en el constructor
    }

    // Método para verificar si la lista está vacía
    public boolean listaVacia() {
        return inicio == null;
    }

    
    public void imprimir() {
        Nodo temp = inicio; // Empezamos en el inicio de la lista
        while (temp != null) { // Repetir mientras no lleguemos al final
            System.out.print(temp.getValor() + " - "); // Imprimir el valor del nodo actual
            temp = temp.getSiguiente(); // Movernos al siguiente nodo
        }
        System.out.println(); // Añadir un salto de línea al final para un formato limpio
    }
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        // Verificar si la lista esta vacia
        if (listaVacia()) { // Usar el nuevo método listaVacia()
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public int size() {
        int tama = 0;
        Nodo temp = inicio;
        while (temp != null) {
            tama += 1;
            temp = temp.getSiguiente();
        }
        return tama;
    }

    public void vaciarList() {
        inicio = null;
        fin = null;
    }

    public void insertarEn(int valor, int posi) {
        // Validar si la posición es negativa o si la lista está vacía y la posición no es 0
        if (posi < 0 || (listaVacia() && posi > 0)) {
            throw new RuntimeException("Posición incorrecta o lista vacía y posición no es 0.");
        }

        Nodo nuevo = new Nodo(valor);
        int tama = size();

        // Insertar al inicio (posición 0)
        if (posi == 0) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            if (fin == null) { // Si la lista estaba vacía, el nuevo nodo es también el fin
                fin = nuevo;
            }
        } 
        // Insertar en una posición válida intermedia o al final
        else if (posi >= 0 && posi <= tama) { // Ahora posi puede ser igual a tama para agregar al final
            Nodo temp = inicio;
            // Recorrer hasta el nodo anterior a la posición de inserción
            for (int cont = 0; cont < posi - 1; cont++) {
                temp = temp.getSiguiente();
            }
            nuevo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevo);

            // Si se inserta al final, actualizar el 'fin'
            if (nuevo.getSiguiente() == null) { 
                fin = nuevo;
            }
        } 
        // Posición fuera de los límites
        else {
            throw new RuntimeException("Posición fuera de los límites de la lista.");
        }
    }
    public void borrarEn(int posi) {
        int tama = size();
        
        // 1. Validar si la lista está vacía
        if (listaVacia()) {
            throw new RuntimeException("La lista está vacía, no se puede borrar.");
        }
        
        // 2. Validar que la posición sea correcta
        if (posi < 0 || posi >= tama) {
            throw new RuntimeException("Posición fuera de los límites de la lista.");
        }
        
        // 3. Analizar los casos de borrado
        if (tama == 1) { // Caso: solo hay un nodo en la lista
            vaciarList();
        } else {
            if (posi == 0) { // Caso: borrar el primer nodo
                inicio = inicio.getSiguiente();
            } else { // Caso: borrar un nodo intermedio o el final
                Nodo temp = inicio;
                // Recorrer hasta el nodo ANTERIOR al que queremos borrar
                for (int cont = 0; cont < posi - 1; cont++) {
                    temp = temp.getSiguiente();
                }
                
                // Conectar el nodo anterior con el nodo siguiente al que se borra
                Nodo nodoABorrar = temp.getSiguiente();
                temp.setSiguiente(nodoABorrar.getSiguiente());
                
                // Si el nodo a borrar era el último, actualizar 'fin'
                if (nodoABorrar == fin) {
                    fin = temp;
                }

            }
        }
    }
    public int buscar(int valor){
    int posi = -1 ;
    int cont = 0;
    Nodo temp = inicio;
    while (temp != null){
    if(valor == temp.getValor()){
    posi = cont ;
    break;
    }
    cont++;
    temp= temp.getSiguiente();
    }
    return posi;
    }
}
        
  