package com.company;

import java.util.Scanner;

public class Challenge {
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        int number;
        System.out.println("Enter number of elements : ");
        number = scanner.nextInt();
        int[] Integers = getIntegers(number);
        System.out.println("Elements before sorting is ");
        printArray(Integers);
        int[] SortedArray = sortIntegers(Integers);
        System.out.println("Array after sorting is ");
        printArray(SortedArray);
    }
    public static int[] getIntegers(int num){
        System.out.println("Enter "+ num + " elements");
        int[] array = new int[num];
        for(int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for(int i= 0 ;i< array.length;i++){
            System.out.println("Element number "+i+" is "+array[i]);
        }
    }
    public static int[] sortIntegers(int[] array){
        int temp=0;
        for(int i=0;i< array.length;i++){
            for (int j=0;j< array.length;j++){
                if(array[j]<array[i]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        return array;
    }
}
