/*
Ingresar un número e intercalarlo en un vector ordenado el cual contiene 
20 elementos y su dimensión es de 21. Mantener el orden del vector.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author ivan_
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 0};

        // Impresión del vector previamente cargado.
        System.out.println("Dimensión de A: " + A.length);
        System.out.print("VECTOR A: [ ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("]");

        System.out.println("Ingrese un número para insertar en el vector: ");
        int n = entrada.nextInt();

        int pos = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (n <= A[i]) { // Insertar al principio o entre medio de dos elementos
                pos = i;
                break;
            } else { // Insertar al final
                pos = A.length - 1;
            }
        }

        // Acomodar el vector desplazanado hacia la derecha los elementos para 
        // "abrir" un espacio al nuevo elemento a insertar.
        for (int i = A.length - 1; i > pos; i--) {
            A[i] = A[i - 1];
        }

        A[pos] = n; // Insertar elemento en la posición previamente guardada.

        // Impresión del vector luego de insertar un elemento.
        System.out.print("VECTOR A: [ ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("]");
    }
}
