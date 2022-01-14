import java.util.Scanner;
public class Challenge {
    public static void main(String[] args) {
        int i=0,Sum=0;
        Scanner s=new Scanner(System.in);
        while(true) {
            int n=i+1;
            System.out.println("Enter number #"+ n + ": ");
            boolean b = s.hasNextInt();
            if(b){
                int number =s.nextInt();
                Sum+=number;
                i++;
                if(i==10){
                    break;
                }
            }
            else{
                System.out.println("Invalid Number");
            }
            s.nextLine();
            }
        System.out.println("Sum = "+ Sum);
        s.close();
    }
}
