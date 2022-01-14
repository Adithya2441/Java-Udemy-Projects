package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,min=0,max=0;
        boolean first = true;
	    while(true){
            System.out.println("Enter a number: ");
            boolean b = s.hasNextInt();
            if(b){
                n=s.nextInt();
                if(first){
                    first = false;
                    min = n;
                    max = n;
                }
                if(n<min){
                    min=n;
                }
                if(n>max){
                    max=n;
                }
            }
            else{
                break;
            }
            s.nextLine();
        }
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
	    s.close();
    }
}
