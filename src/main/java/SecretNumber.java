import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
//        hardcode the secret number
        int secretNumber = 12;

//        prompt user to input their guess
        System.out.println("What is your guess for the secret number? ");

//        Collect user input
        Scanner reader = new Scanner(System.in);
        int secretNumberGuess = reader.nextInt();

//        if user guess is correct, print correct guess
//        if user guess is high, print too high
//        if user guess if low, print too low

        if (secretNumberGuess == secretNumber) {
            System.out.println("Your guess is correct!");
        } else if (secretNumberGuess > secretNumber) {
            System.out.println("Your guess is too high.");
        } else {
            System.out.println("Your guess is too low.");
        }

    }
}
