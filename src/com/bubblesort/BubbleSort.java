package com.bubblesort;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Random random = new Random();  //generator liczb pseudolosowych
        Scanner scanner = new Scanner(System.in); //scanner do pobierania wartości od usera
        Algorithm algorithm = new Algorithm(); //algorytm sortujący BubbleSort
        int i = 0; //zmienna i do iterowania w pętli while przydzielającej wartości do zmiennych w tablicy


        System.out.println("Podaj ilość liczb w tablicy");
        int hm = scanner.nextInt();
        int[] arr = new int[hm]; //tworzę tablicę zawierającą określoną przez użytkownika liczbę elementów

        System.out.println("Podaj górną granicę zakresu generowania liczb do tablicy");
        int range = scanner.nextInt(); //ustawiam górną granicę zakresu z którego będą generowane liczby (0-range)


        while (i < arr.length) {
            arr[i] = random.nextInt(range);
            //System.out.println(arr[i]);
            i++;
        } //pętla przydzielająca wartości do zmiennych w tablicy

        long t = System.currentTimeMillis();
        int swp = 1; // zmienna mówiąca o tym, czy wystąpiła zamiana elementów w tablicy
        do {
            if(algorithm.BS(arr, 0) > 0) swp = 1;
            else swp = 0;
        }while (swp != 0);

        System.out.println("Czas wykonania algorytmu: " + (System.currentTimeMillis() - t) + " ms");
//        System.out.println("sorted");
//        algorithm.print(arr); // wyświetlenie posortowanej tablicy
    }
}
