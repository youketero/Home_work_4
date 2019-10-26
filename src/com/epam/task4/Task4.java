package com.epam.task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter size of array -> ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = createArray(size);
        System.out.println("Your array -> " + Arrays.toString(arr));
        System.out.println("Average in array-> "+ averageArray(arr));
        System.out.println("Count of number that bigger then average number -> " + numberLength(arr,averageArray(arr)));
    }

    public static int[] createArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }
        return array;
    }

    public static int averageArray(int[] args){
        int sum = 0;
        int count = 0;
        for (int i:args) {
            sum += i;
            count++;
        }
        return sum/count;
    }

    public static int numberLength(int[] arg1, int arg2){
        int count = 0;
        for (int i: arg1) {
            if(i > arg2){
                count++;
            }
        }
        return count;
    }
}
