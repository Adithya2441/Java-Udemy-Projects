package Adi;

public class Main {
    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = "+myMinIntValue);
        System.out.println("Integer Maximum value = "+myMaxIntValue);
        System.out.println("Busted MAX value = "+(myMaxIntValue+1));
        System.out.println("Busted Min value = "+(myMinIntValue-1));
        
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = "+myMinByteValue);
        System.out.println("Byte Maximum value = "+myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = "+myMinShortValue);
        System.out.println("Short Maximum value = "+myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = "+myMinLongValue);
        System.out.println("Long Maximum value = "+myMaxLongValue);

        int myTotal = (myMinIntValue/2);
        byte mybyte = (byte) (myMinByteValue/2);
        short myshort = (short) (myMinShortValue/2);
    }
}
