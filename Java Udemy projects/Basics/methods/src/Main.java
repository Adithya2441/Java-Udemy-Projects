public class Main {
    public static void main(String[] args) {
        int highScore = calculateScore(true,800,5,100);
        System.out.println(highScore);
        highScore = calculateScore(true,10000,8,200);
        System.out.println(highScore);

    }

    public static int calculateScore(boolean gameover,int score,int level,int bonus){
        if(gameover){
            int finalscore = score +(level*bonus);
            return finalscore;
        }
        return -1;
    }
}
