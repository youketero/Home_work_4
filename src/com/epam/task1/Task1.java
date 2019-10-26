package com.epam.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter size of array -> ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = createArray(size);
        System.out.println("Normal array");
        System.out.println(Arrays.toString(arr));
        System.out.println("Reversed array");
        int [] arr1 = reversedArray(arr);
        System.out.println(Arrays.toString(arr1));
    }


    public static int[] createArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static int[] reversedArray(int[] args){
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = args[args.length-1-i];
        }
        return arr;
    }

}
