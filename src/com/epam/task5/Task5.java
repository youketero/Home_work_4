package com.epam.task5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        int num = getSizeArray();
        int num1 = getSizeArray();
        int[] arr = createArray(num);
        int[] arr1 = createArray(num1);
        int[] arr2 = concatArray(arr,arr1);
        System.out.println("First array -> " + Arrays.toString(arr));
        System.out.println("__________________________________");
        System.out.println("Second array -> " + Arrays.toString(arr1));
        System.out.println("__________________________________");
        System.out.println("Concat of arrays" + Arrays.toString(arr2));

    }

    public static int[] createArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }
        return array;
    }

    public static int getSizeArray() {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Enter size array -> ");
            num = sc.nextInt();
            if (num > 0) {
                return num;
            }
            System.out.print("Incorrect value. Enter value greater then 0 -> ");
        }
    }

    public  static int[] concatArray(int[] arg1, int[] arg2) {
        int[] arr = new int[arg1.length + arg2.length];
        int i = 0;
        for (int x : arg1) {
            arr[i] = x;
            i++;
        }
        for (int x : arg2) {
            arr[i] = x;
            i++;
        }
        return arr;
    }
}
