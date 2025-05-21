import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"rock", "paper", "scissors"};
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Enter your move (rock, paper, or scissors):");
            String userMove = scanner.nextLine().toLowerCase();

            // Validate input
            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                System.out.println("Invalid move. Please try again.");
                continue;
            }

            // Computer move
            int index = random.nextInt(3);
            String computerMove = options[index];
            System.out.println("Computer chose: " + computerMove);

            // Determine the winner
            if (userMove.equals(computerMove)) {
                System.out.println("It's a draw!");
            } else if (
                (userMove.equals("rock") && computerMove.equals("scissors")) ||
                (userMove.equals("paper") && computerMove.equals("rock")) ||
                (userMove.equals("scissors") && computerMove.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            // Ask if user wants to play again
            System.out.println("Do you want to play again? (yes/no):");
            String answer = scanner.nextLine().toLowerCase();
            if (!answer.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
