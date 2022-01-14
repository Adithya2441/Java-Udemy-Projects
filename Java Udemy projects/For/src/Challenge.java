public class Challenge {
    public static void main(String[] args) {
        int Sum=0,i,count=0;
        for(i=1;i<=1000;i++){
            if(i%3 == 0 && i%5 == 0){
                if(count<5) {
                    count++;
                    Sum = Sum + i;
                    System.out.println("i = " + i);
                }
            }
        }
        System.out.println("Sum = "+ Sum);
    }
}
