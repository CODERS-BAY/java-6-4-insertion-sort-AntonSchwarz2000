package com.codersbay;

public class Main {

    public static void main(String[] args) {
        int[] unsorted = {12, 234, -2, 24, -234};
        int[] sorted = insertionSort(unsorted);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i] + ",  ");
        }
    }

    public static int[] insertionSort(int[] sort) {
        int temp;
        for (int i = 1; i < sort.length; i++) {
            temp = sort[i];
            int j = i;
            while (j > 0 && sort[j - 1] > temp) {
                sort[j] = sort[j - 1];
                j--;
            }
            sort[j] = temp;
        }
        return sort;
    }

}