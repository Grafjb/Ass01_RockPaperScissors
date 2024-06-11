import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Welcome to Rock Paper Scissors!");
            System.out.println("Player A, enter your move (R/P/S): ");
            String playerA = scanner.nextLine().toUpperCase();
            while (!playerA.equals("R") && !playerA.equals("P") && !playerA.equals("S")) {
                System.out.println("Invalid move! Please enter R, P, or S: ");
                playerA = scanner.nextLine().toUpperCase();
            }

            System.out.println("Player B, enter your move (R/P/S): ");
            String playerB = scanner.nextLine().toUpperCase();
            while (!playerB.equals("R") && !playerB.equals("P") && !playerB.equals("S")) {
                System.out.println("Invalid move! Please enter R, P, or S: ");
                playerB = scanner.nextLine().toUpperCase();
            }

            String result;
            if (playerA.equals(playerB)) {
                result = "It's a tie!";
            } else if ((playerA.equals("R") && playerB.equals("S")) ||
                    (playerA.equals("S") && playerB.equals("P")) ||
                    (playerA.equals("P") && playerB.equals("R"))) {
                result = "Player A wins!";
            } else {
                result = "Player B wins!";
            }
            System.out.println(result);

            System.out.println("Do you want to play again? (Y/N): ");
            String playAgainInput = scanner.nextLine().toUpperCase();
            playAgain = playAgainInput.equals("Y");
        }

        System.out.println("Thanks for playing Rock Paper Scissors!");
        scanner.close();
    }
}
