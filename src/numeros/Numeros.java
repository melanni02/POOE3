/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numeros;

import java.util.Scanner;  

/**
 *
 * @author Flor Melanni Infante
 */
public class Numeros {

    private static void Int(String nextLine) {
        
    }

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner escaner = new Scanner(System.in);
//        int arreglo[];
//        int elementos = 0;
      
        System.out.print("Ingrese el tamaño del arreglo: ");
        int elementos=Integer.parseInt(escaner.nextLine());
        int[] arreglo = new int[elementos];

        for (int i = 0; i < elementos; i++) {
            System.out.print((i + 1) + "Ingrese el numero: ");
            arreglo[i] =escaner.nextInt();
        }
        for (int i = 0; i < elementos - 1; i++) {

            for (int j = 0; j < elementos - 1; j++) {

                if (arreglo[j] > arreglo[j + 1]) {
                    int aux;
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        System.out.println("\n Ordenar: " );
        for (int i = 0; i < elementos; i++) {
            System.out.print(arreglo[i] + " ");
        } 
    }
}
