package numberGuessGame;

import java.util.Random;
import java.util.Scanner;

public class numberGuess {

    static Random rand = new Random();
    static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {

        while (true) {
            System.out.println();
            System.out.println("In this game you will have three chances to find the correct number. This looks easy? so try it yourself.");
            System.out.println("Each time you lose, a new number will be generated.");
            System.out.println("The number you will try to find is between 0-10. PS: Im sure you will never win");
            int maxValue = 11;
            int numberToBeGuessed = rand.nextInt(maxValue);
            System.out.println();
            System.out.println("Your number is ready. So whats your first guess?");
            int firstGuess = input.nextInt();
            System.out.println("Your first guess is wrong, whats your second guess?");
            int secondGuess = input.nextInt();
            System.out.println("Your second guess is wrong. whats your third and final guess?");
            int thirdGuess = input.nextInt();
            System.out.println("Your Third and final guess is wrong. You have lost");
            // işin eğlenceli kısmı başlıyor ;)
            Boolean control = true;
            while (control) {
                if ((thirdGuess == numberToBeGuessed) || (firstGuess == numberToBeGuessed)|| (secondGuess == numberToBeGuessed)){
                    numberToBeGuessed = rand.nextInt(maxValue);
                }
                if ((thirdGuess != numberToBeGuessed) && (firstGuess != numberToBeGuessed) && (secondGuess != numberToBeGuessed)){
                    control = false;
                }
            }
            System.out.print("THE CORRECT NUMBER WAS: ");
            System.out.println(numberToBeGuessed);
            System.out.println("Dont be mad, try again.");
            System.out.println();

        }

    }
}
