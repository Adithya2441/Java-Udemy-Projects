package com.company;
import java.util.Scanner;

public class Program1 {

    public static int t[]=new int[128],cs[]= new int[128],g[] = {1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1},a,e,c;
    static final int n=g.length;

    static void xor(){
        for(c=1;c<n;c++){
            cs[c]=((cs[c]==g[c])?0:1);
        }
    }
    static void crc(){
        for(e=0;e<n;e++)
            cs[e]=t[e];
        do{
            if(cs[0]==1)
                xor();
            for(c=0;c<n-1;c++)
                cs[c]=cs[c+1];
            cs[c]=t[e++];
        }while(e<=a+n-1);
    }

    public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of dataword : ");
        a=in.nextInt();
        System.out.println("Enter dataword :");
        for(int i=0;i<a;i++){
            t[i]=in.nextInt();
        }
        for(e=a;e<a+n-1;e++){
            t[e]=0;
        }
        System.out.println("Modified dataword : ");
        for(int i=0;i<a+n-1;i++){
            System.out.print(t[i]+"\t");
        }
        System.out.println();
        crc();
        System.out.println("Check sum : ");
        for (int i=0;i<n-1;i++){
            System.out.print(cs[i]+"\t");
        }
        System.out.println();
        for (e=a;e<a+n-1;e++){
            t[e]=cs[e-a];
        }
        System.out.println("Final codeword: ");
        for (int i=0;i<a+n-1;i++){
            System.out.println(t[i]+"\t");
        }
        System.out.println();
        System.out.println("Error detection check 0(yes) 1(no) :");
        e=in.nextInt();
        if(e==0){
            System.out.format("Enter position between %d and %d to introduce error",0,a-1);
            e=in.nextInt();
            t[e]=((t[e]==0)?1:0);
            System.out.println("Dataword after error : ");
            for(int i=0;i<a;i++){
                System.out.print(t[i]+"\t");
            }
            System.out.println();
            crc();
            for(e=0;(e<n-1)&&(cs[e]!=1);e++);
            if(e<n-1){
                System.out.println("Error detected");
            }
            else {
                System.out.println("No error detected");
            }

        }
    }
}
