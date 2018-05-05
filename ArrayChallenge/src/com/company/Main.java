package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        myIntegers = bubbleSort(myIntegers);
        printArray(myIntegers);

    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integers values \r");
        for (int i = 0; i < capacity; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] bubbleSort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);

//        int[] sortedArray = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                int curr = sortedArray[i];
                int next = sortedArray[i + 1];
                if(curr < next) {
                    int temp = sortedArray[i];
                    sortedArray[i] = next;
                    sortedArray[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        return sortedArray;
    }
}
