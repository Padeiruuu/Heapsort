package com.baeldung;

/**
 * Hello world!
 *
 */
public class App 
{   
    public static boolean isMaxHeap(int[] a) {
        int n = a.length;
        // Verifica se cada nó pai é maior ou igual que seus filhos
        for (int i = 0; i <= (n - 2) / 2; i++) {
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            // Verifica se o filho esquerdo existe e se o valor do pai é menor que o filho esquerdo
            if (leftChild < n && a[i] < a[leftChild])
                return false;
            // Verifica se o filho direito existe e se o valor do pai é menor que o filho direito
            if (rightChild < n && a[i] < a[rightChild])
                return false;
        }
        return true;
    }

    public static void main( String[] args ) {
        int[] maxHeap = {100, 19, 36, 17, 100, 25, 1};
        if (isMaxHeap(maxHeap))
            System.out.println("É um heap");
        else
            System.out.println("Não é um heap");    
    }
}
