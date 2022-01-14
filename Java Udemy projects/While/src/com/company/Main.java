package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(1));;

    }
    public static int sumDigits(int n){
        int sum=0;
       if(n<10){
           return -1;
       }
       else{
           while(n>=1){
               sum = sum + (n%10);
               n =n/10;
           }
           return sum;
       }

    }
}
