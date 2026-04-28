package javabasicspractice;

import java.util.Random; 
import java.util.Scanner; 

public class NumbersGuessGame {

    public static void main (String[] args){

        Random random = new Random(); 
        Scanner scanner = new Scanner(System.in); 

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max + 1);

        System.out.println("Number Guessing Game! ");
        System.out.printf("Guess a number between %d - %d:%n" , min, max);

        do {

            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("Too low try again :(");
            }

            else if(guess > randomNumber)
                {System.out.println("Too high try again");}

            else{
         System.out.println("You have won the game!!! The winning number was " + randomNumber + "!");
        System.out.println("It took you " + attempts + " attempts to win the game. Good Job.");
            }


        } while(guess != randomNumber) ;

        scanner.close();

    }

}