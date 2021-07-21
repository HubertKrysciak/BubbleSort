package com.bubblesort;

public class Swap {
    public void two_var(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
