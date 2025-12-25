import java.util.Scanner;

public class Main {

  public static void guessingNumber() {

    Scanner sr = new Scanner(System.in);

    //Random number
    int number = 1 + (int) (Math.random() * 100);

    int K = 5;
    boolean guessedCorrectly = false;

    int attempts = 0;


    System.out.println("A number is chosen between 1 and 100.");
    System.out.println("You have " + K + " attempts to guess the correct number.");

    //Guessing the number
    while (!guessedCorrectly) {
      for (
              int i = 0;
              i < K; i++) {
        System.out.print("Enter your guess: ");
        int guess = sr.nextInt();

        if (guess == number) {
          System.out.println("Congratulations! You guessed the number.");
          break;
        } else if (guess < number) {
          System.out.println("Too low. Try again.");
        } else {
          System.out.println("Too high. Try again.");
        }
      }
      if (!guessedCorrectly) {
        System.out.println("You have used all your " + K + " attempts.");
        System.out.println("Do you want to continue guessing? (yes/no): ");
        String response = sr.next();

        if (!response.equalsIgnoreCase("yes")) {
          System.out.println("Game Over! The correct number was " + number + ".");
          break;
        }
      }
    }

    sr.close();
  }

  public static void main(String[] args) {
    guessingNumber();
  }
}