public class Challenge {
    public static void main(String[] args) {
        displayHighScorePosition("Andrew",calculateHighScorePosition(1500));
        displayHighScorePosition("Simon",calculateHighScorePosition(900));
        displayHighScorePosition("Mark",calculateHighScorePosition(400));
        displayHighScorePosition("Nathon",calculateHighScorePosition(50));
    }
    public static void displayHighScorePosition(String name,int position){
        System.out.println(name +" managed to get into position "+ position +" on the high score table");
    }
    public static int calculateHighScorePosition(int score){
        if(score>=1000) {
            return 1;
        }
        else if(score>=500){
            return 2;
        }
        else if(score>=100){
            return 3;
        }
        else{
            return 4;
        }
    }
}
