import java.util.Scanner;
public class GuessingGame {
    public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            
            int numberToGuess = ((int)(Math.random()*100 + 1));
            int numberOfTries = 0;
            int userGuess = 0;
            boolean hasWon = false;

            System.out.println("+--------------------------------+");
            System.out.println("|  WELCOME TO THE GUESSING GAME  |");
            System.out.println("+--------------------------------+");
            System.out.println("GUESS THE NUMBER B/W 1 AND 100");
            
            while(!hasWon){
                System.out.println("ENTER YOUR GUESS!");
                userGuess = scanner.nextInt();
                numberOfTries++;
                if(userGuess < numberToGuess){
                    System.out.println("TOO LOW! TRY AGAIN!");
                }
                    else if (userGuess > numberToGuess){
                        System.out.println("TOO HIGH! TRY AGAIN!");
                    }
                    else {
                        hasWon = true;
                    }
                }
                System.out.println("CONGRATULATIONS FOR GUESSING THE CORRECT NUMBER! IN"  + numberOfTries +" TRIES");
                scanner.close();
            }


    }
    

