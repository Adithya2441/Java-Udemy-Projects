public class Main {
    public static void main(String[] args) {
        boolean isAlien = false;
        if(isAlien==false){
            System.out.println("It is not an alien");
            System.out.println("Don't worry");
        }

        int topScore = 80;
        if(topScore <= 100){
            System.out.println("Highest Score");
        }
        int secTopScore = 60;
        if((secTopScore<topScore) && (topScore<100)){
            System.out.println("Greater than secTopScore and less than 100");
        }
        if((topScore>90)||(secTopScore<=90)){
            System.out.println("Either or both conditions are true");
        }
    }
}
