package com.baeldung;

public class App 
{   
    public static boolean isMaxHeap(int[] a) {
        int n = a.length;
        for (int i = 0; i <= (n - 2) / 2; i++) {
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            if (leftChild < n && a[i] < a[leftChild])
                return false;
            if (rightChild < n && a[i] < a[rightChild])
                return false;
        }
        return true;
    }

    public static void main( String[] args ) {
        int[] heap = {100, 19, 36, 17, 100, 25, 1};
        if (isMaxHeap(heap))
            System.out.println("É um heap");
        else
            System.out.println("Não é um heap");    
    }
}
