iimport java.util.Scanner;
import java.util.Random;
public class RPS {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String rePlay = "y";
        int gamesPlayed = 1;
        int playerWon = 0;
        int computerWon = 0;


        System.out.println("\nWelcome to Rock-Paper-Scissors Game");

        while (rePlay.equals("y")){

            String[] rps = {"r", "p", "s"};
            String computer = rps[new Random().nextInt(rps.length)];
            String player;

            while (true) {
                System.out.println("\nr - Rock\np - Paper\ns - Scissors\n");
                System.out.print("Game: " + gamesPlayed + " Enter your move (r, p, s): ");
                player = scan.nextLine().toLowerCase();
                if (player.equals("r") || player.equals("p") || player.equals("s")){
                    break;
                }
                System.out.println(player + "is not a valid move");
                System.out.println("Just enter\n r - rock\n p - paper\n s - scissors\n");
            }

            if (player.equals(computer)){
                System.out.println("\nIt's a Tie\n");
            }
            else if (player.equals("r")){
                if (computer.equals("p")){
                    System.out.println("\nYou played: Rock\n" + "Computer played: Paper\n");
                    System.out.println("You Lost!!\n");
                    computerWon++;
                } else if (computer.equals("s")) {
                    System.out.println("\nYou played: Rock\n" + "Computer played: Scissors\n");
                    System.out.println("Congrats You Won!!\n");
                    playerWon++;
                }
            }

            else if (player.equals("p")){
                if (computer.equals("s")){
                    System.out.println("\nYou played: Paper\n" + "Computer played: Scissors\n");
                    System.out.println("You Lost!!\n");
                    computerWon++;
                } else if (computer.equals("r")) {
                    System.out.println("\nYou played: Paper\n" + "Computer played: Rock\n");
                    System.out.println("Congrats You Won!!\n");
                    playerWon++;
                }
            }

            else if (player.equals("s")){
                if (computer.equals("r")){
                    System.out.println("\nYou played: Scissors\n" + "Computer played: Rock\n");
                    System.out.println("You Lost!!\n");
                    computerWon++;
                } else if (computer.equals("p")) {
                    System.out.println("\nYou played: Scissors\n" + "Computer played: Paper\n");
                    System.out.println("Congrats You Won!!\n");
                    playerWon++;
                }
            }

            System.out.println("Games Played: " + gamesPlayed + " Times\n" + "You Won     : " + playerWon + " Times\n" + "Computer Won: " + computerWon + " Times\n");
            gamesPlayed++;

            System.out.print("Play again? (y/n): ");
            rePlay = scan.nextLine().toLowerCase();

            if (!rePlay.equals("y")){
                System.out.println("\nThanks for playing");
                break;
            }
        }
        scan.close();
    }
}
