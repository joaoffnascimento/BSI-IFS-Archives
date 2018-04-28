package Expressions_Statements_CodeBlocks_Methods_and_Mora;

public class MethodOverloading {

    public static void main(String[] args) {
        calculateScore("John", 500);
        calculateScore(500);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
