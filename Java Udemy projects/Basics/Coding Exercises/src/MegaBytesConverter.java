import java.util.*;
public class MegaBytesConverter {
    public static int kilobytes;
    public static int kilobytes1;
    public static int megabytes;

    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        } else {
            megabytes = kilobytes / 1024;
            kilobytes1 = kilobytes % 1024;
            System.out.println(kilobytes + " KB =" + megabytes + " MB + " + kilobytes1 + " KB");
        }
    }


    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("Enter KB : ");
        kilobytes=i.nextInt();
        printMegaBytesAndKiloBytes(kilobytes);
    }
}
