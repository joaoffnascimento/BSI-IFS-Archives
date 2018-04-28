package Expressions_Statements_CodeBlocks_Methods_and_Mora;

import java.util.*;

public class Methods {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        boolean gameOver;
        int score;
        int levelCompleted;
        int bonus;
        String playerName;
        int position;
        int finalScore;

        int flag = 0;
        do {

            System.out.println("Enter your name: ");
            playerName = read.nextLine();
            read.nextLine();
            System.out.println("GameOver? ");
            gameOver = read.nextBoolean();
            System.out.println("Enter your score: ");
            score = read.nextInt();
            System.out.println("Enter your level completed: ");
            levelCompleted = read.nextInt();
            System.out.println("Enter yours bonus point: ");
            bonus = read.nextInt();
            finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
            position = calculateHighScorePosition(finalScore);
            displayHighScorePosition(playerName, position);
            System.out.println("\n");
            System.out.println("Continue? ");
            flag = read.nextInt();
        } while (flag != 9);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;

        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        int lastMaxPosition = 1;

        boolean highPosition = false;
        if (position <= lastMaxPosition) {
            highPosition = true;
        } else {
            highPosition = false;
        }
        if (highPosition) {
            System.out.println("Congratulations " + playerName +
                    " You are managed to get into position " + position +
                    " on the high score table");
        } else {
            System.out.println("Congratulations " + playerName +
                    " You are managed to get into position " + position);
        }

        if (position < lastMaxPosition) {
            lastMaxPosition = position;
        }
    }

    public static int calculateHighScorePosition(int score) {
        //Ao invés de utilizar uma variável, utilizar o return*
        int pos = 0;
        if (score > 1000) {
            pos = 1;
        } else if ((score > 500) && (score < 1000)) {
            pos = 2;
        } else if ((score > 100) && (score < 500)) {
            pos = 3;
        } else {
            pos = 4;
        }
        return pos;
    }
}
