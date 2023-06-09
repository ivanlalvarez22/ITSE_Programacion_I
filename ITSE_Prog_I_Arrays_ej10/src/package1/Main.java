/*
Ingresar un número e intercalarlo en un vector ordenado el cual contiene 
20 elementos y su dimensión es de 21. Mantener el orden del vector.
 */
package package1;

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
        System.out.println("Dimensión: " + A.length);
        System.out.print("VECTOR A: [ ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("]");

        // Carga de datos
        System.out.println("Ingrese un nro para insertar en el vector: ");
        int n = entrada.nextInt();

        // Inserción
        boolean b = false;
        int pos = 0;
        int j = 1;
        for (int i = 0; i < A.length - 1; i++) {
            // Insertar al principio
            if (i == 0 && n < A[i]) {
                b = true;
                pos = i;
            }
            //Insertar al medio
            if (n >= A[i] && n <= A[i + 1]) {
                b = true;
                i++;
                pos = i;
            }
            // Insertar al final
            if (n >= A[i] && i == A.length - 2) {
                b = true;
                i++;
                pos = i;
            }
            // Acomodar el vector desplazanndo hacia la derecha los elemntos para
            // abrir un espacio al nuevo elemento a insertar.
            if (b) {
                A[A.length - j] = A[A.length - (j + 1)];
                j++;
            }
        }

        A[pos] = n;

        // Impresión del vector luego de insertar un elemento.
        System.out.print("VECTOR A: [ ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("]");
    }
}
