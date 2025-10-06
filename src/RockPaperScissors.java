import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        boolean conYN = false;
        String contYNUserInput;
        boolean playerAValid = false;
        boolean playerBValid = false;
        String playerAInput = "";
        String playerBInput = "";
        boolean validConYN = false;

        //Asks the users if they would like to play again and calculates who won.
        do {
            playerAValid = false;
            playerBValid = false;
            validConYN = false;

            // Asking user A for input and checking if valid.
            do {
                System.out.println("Player A please enter rock(R), paper(P), or scissors(S)");

                if (scan.hasNext()) {
                    playerAInput = scan.nextLine();

                    if (playerAInput.equalsIgnoreCase("R") || playerAInput.equalsIgnoreCase("P") || playerAInput.equalsIgnoreCase("S")) {
                        System.out.println("Player A has chosen: " + playerAInput);
                        playerAValid = true;

                    } else {
                        System.out.println("Invalid input, please try again.");
                    }

                } else {
                    System.out.println("Invalid input, please try again.");
                }
            } while(!playerAValid);

            // Asking user B for input and checking if valid.
            do {

                System.out.println("Player B please enter rock(R), paper(P), or scissors(S)");

                if (scan.hasNext()) {
                    playerBInput = scan.nextLine();

                    if (playerBInput.equalsIgnoreCase("R") || playerBInput.equalsIgnoreCase("P") || playerBInput.equalsIgnoreCase("S")) {
                        System.out.println("Player B has chosen: " + playerBInput);
                        playerBValid = true;

                    } else {
                        System.out.println("Invalid input, please try again.");
                    }

                } else {
                    System.out.println("Invalid input, please try again.");
                }

            } while (!playerBValid);

            // Calculates who won the game or if it was a tie.
            if (playerAInput.equalsIgnoreCase("r") && playerBInput.equalsIgnoreCase("r")) {
                System.out.println("Both player choose rock, its a tie!");
            } else if (playerAInput.equalsIgnoreCase("r") && playerBInput.equalsIgnoreCase("p")) {
                System.out.println("Paper covers rock, Player B wins!");
            } else if (playerAInput.equalsIgnoreCase("r") && playerBInput.equalsIgnoreCase("s")) {
                System.out.println("Rock breaks scissors, Player A wins!");
            } else if (playerAInput.equalsIgnoreCase("p") && playerBInput.equalsIgnoreCase("r")) {
                System.out.println("Paper covers rock, Player A wins!");
            } else if (playerAInput.equalsIgnoreCase("p") && playerBInput.equalsIgnoreCase("p")) {
                System.out.println("Both player choose paper, its a tie!");
            } else if (playerAInput.equalsIgnoreCase("p") && playerBInput.equalsIgnoreCase("s")) {
                System.out.println("Scissors cuts paper, Player B wins!");
            } else if (playerAInput.equalsIgnoreCase("s") && playerBInput.equalsIgnoreCase("r")) {
                System.out.println("Rock breaks scissors, Player B wins!");
            } else if (playerAInput.equalsIgnoreCase("s") && playerBInput.equalsIgnoreCase("p")) {
                System.out.println("Scissors cuts paper, Player A wins!");
            } else {
                System.out.println("Both player choose scissors, its a tie!");
            }

            //Asks the user id they want to continue or not, if not stops program.
            do {
                System.out.println("Would you like to continue playing(Y or N?)");
                if (scan.hasNext()) {
                    contYNUserInput = scan.nextLine();

                    if (contYNUserInput.equalsIgnoreCase("No") || contYNUserInput.equalsIgnoreCase("N")) {
                        validConYN = true;
                        conYN = true;
                    } else if (contYNUserInput.equalsIgnoreCase("Yes") || contYNUserInput.equalsIgnoreCase("y")) {
                        validConYN = true;
                    } else {
                        System.out.println("Invalid input, please try again.");
                    }

                } else {
                    System.out.println("Invalid input, please try again.");
                }
            } while (!validConYN);

        } while (!conYN);

    }
}
