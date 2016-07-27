
package guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    
    int theNumber;
    int max;
    Scanner scanner = new Scanner(System.in);
    
    public GuessTheNumber(){
        Random rand = new Random();
        max = 100;
        theNumber = Math.abs(rand.nextInt()) % (max + 1);
    }
    
    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNumber) {
                System.out.println("Your number is too big!!");
            } else if (move < theNumber) {
                System.out.println("Your number is too small!!");
            } else {
                System.out.println("You got it!!");
            }
        }
    }
    
    public static void howBigIsMyNumber(int x){
        if (x >= 0 && x <= 10){
            System.out.println("Our number is small");
        } else if (x >= 11 && x <= 100){
            System.out.println("Our number is big");
        } else {
            System.out.println("Our number is out of range");                   
        }
    } 
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("Welcome to the guess game! Try and guess the number." 
                + " The number is betweeen 0 and " + guessGame.max + " inclusive."
                + " Just put a number to get started");
        guessGame.play();
    }
    
}
