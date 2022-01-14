package com.company;
import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of elements : ");
        int n=scanner.nextInt();
        int[] myArray = new int[n];
        for (int i=0;i< myArray.length;i++){
            System.out.println("Enter the "+(i+1)+" element : ");
            myArray[i]=scanner.nextInt();
        }
        System.out.println("The array before reversing is : ");
        for (int i=0;i< myArray.length;i++){
            System.out.println(myArray[i]);
        }
        reverse(myArray);
    }
    public static void reverse(int[] array){
        int start = 0;
        int end = array.length-1;
        int temp;
        while(start<end){
            temp = array[end];
            array[end]=array[start];
            array[start]=temp;
            start++;
            end--;
        }
        System.out.println("The array after reversing :");
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

}
