package com.bubblesort;

public class Algorithm {

    public int BS(int arr[], int swp){
        com.test.Swap swap = new com.test.Swap();
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1] > arr[i]){
                swap.two_var(arr, i-1, i);
                swp++;
            }
        }
        return swp;
    } // metoda sortująca algorytmem BubbleSort

    public void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    } // metoda wyświetlająca posortowaną tablicę
}
