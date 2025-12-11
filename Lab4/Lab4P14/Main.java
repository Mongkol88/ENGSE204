package Lab4.Lab4P14;

import java.util.Scanner;

class Scoreboard {
    private String gameName;
    private int[] scores;

    public Scoreboard(String ganename, int[] score) {
        this.gameName = ganename;
        this.scores = score;
    }
    public Scoreboard(Scoreboard other) {
        this.gameName = other.gameName;
        this.scores = new int[other.scores.length] ;
        for (int i = 0; i < scores.length; i++) {
            this.scores[i] = other.scores[i];
        }
    }

    public void displayScore() {
        System.out.println(this.gameName + ": " + this.scores[0] + ", " + this.scores[1] + ", " + this.scores[2]);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gamename = sc.nextLine();
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();
        int score3 = sc.nextInt();

        int[] originalScores = {score1, score2, score3};

        Scoreboard sb1 = new Scoreboard(gamename, originalScores);
        Scoreboard sb2 = new Scoreboard(sb1);
        int newscore = sc.nextInt();
        originalScores[0] = newscore;
        sb1.displayScore();
        sb2.displayScore();

        sc.close();
    }
}
