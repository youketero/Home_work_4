package com.epam.task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Enter size of array -> ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = createArray(size);
        System.out.println(Arrays.toString(arr));
        sortArray(arr);
    }

    public static int[] createArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }
        return array;
    }

    public static void sortArray(int[] arg){
        int[] arr1 = new int[arg.length];
        int[] arr2 = new int[arg.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] > 0) {
                arr1[j] = arg[i];
                j++;
            } else {
                arr2[k] = arg[i];
                k++;
            }
        }
        System.out.println("Array of positive integers");
        System.out.println(Arrays.toString(Arrays.copyOf(arr1,j)));
        System.out.println("Array of negative integers");
        System.out.println(Arrays.toString(Arrays.copyOf(arr2,k)));
    }
}
