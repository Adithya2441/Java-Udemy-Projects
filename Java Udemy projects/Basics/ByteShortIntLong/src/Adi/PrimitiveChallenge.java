package Adi;

public class PrimitiveChallenge {
    public static void main(String[] args) {
        byte b= 100;
        short s= 30000;
        int i=230023001;
        long l=(50000L+(10L*(b+s+i)));
        System.out.println(l);

        short shortt =(short) (1000 + 10 * (b+s+i));
        System.out.println(shortt);
    }
}
