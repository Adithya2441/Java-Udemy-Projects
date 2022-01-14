package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        calculateScore(75);
        calculateScore();
        System.out.println("New score is "+ newScore);
	// write your code here
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + "scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Player scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore(){
        System.out.println("Player No score");
        return 0;
    }



}
