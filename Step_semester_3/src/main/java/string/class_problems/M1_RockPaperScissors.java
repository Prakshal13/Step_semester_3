package string.class_problems;

import java.util.Random;

public class M1_RockPaperScissors {

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        } else {
            return "Computer Wins";
        }
    }

    public static void main(String[] args) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random random = new Random();

        // Sample predefined player moves for a live demo (N = 5)
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        int totalRounds = playerMoves.length;

        String[] computerMoves = new String[totalRounds];
        String[] results = new String[totalRounds];

        int wins = 0;
        int losses = 0;
        int draws = 0;

        System.out.println("--- Starting Rock-Paper-Scissors Match (5 Rounds) ---\n");

        for (int i = 0; i < totalRounds; i++) {
            String playerMove = playerMoves[i];
            // Predefined moves matching sample run
            if (i == 0) computerMoves[i] = "Scissors";
            else if (i == 1) computerMoves[i] = "Paper";
            else if (i == 2) computerMoves[i] = "Rock";
            else computerMoves[i] = moves[random.nextInt(moves.length)];

            results[i] = playRound(playerMove, computerMoves[i]);

            if (results[i].equals("Player Wins")) {
                wins++;
            } else if (results[i].equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }

            System.out.printf("Round %d — Player: %s, Computer: %s | %s%n",
                    (i + 1), playerMove, computerMoves[i], results[i]);
        }

        System.out.println("\n------------------------------------------------------------");
        System.out.printf("%-10s | %-15s | %-15s | %-15s%n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < totalRounds; i++) {
            System.out.printf("%-10d | %-15s | %-15s | %-15s%n", (i + 1), playerMoves[i], computerMoves[i], results[i]);
        }
        System.out.println("------------------------------------------------------------");

        double winPercentage = ((double) wins / totalRounds) * 100.0;
        System.out.printf("Final Summary (after %d rounds) Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n",
                totalRounds, wins, losses, draws, winPercentage);
    }
}
