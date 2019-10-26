package com.epam.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter size of array -> ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr1 = createArray(size);
        int[] arr2 = createArray(size);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(sumArray(arr1,arr2)));
    }

    public static int[] createArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static  int[] sumArray(int[] arg1, int[] arg2){
        int[] arr3 = new int[arg1.length];
        for (int i = 0; i < arg1.length; i++) {
            arr3[i] = arg1[i]+arg2[i];
        }
        return arr3;
    }
}
