package mackpkg.games.guess;

/*
 * Programmer: Alex Mack
 * Program: Guessing Game
 * Date/Time: 11/6/2014 @ 6:07 PM
 * Modified: 1/20/2015 @ 9:54 PM
 */


import java.util.Random;
import java.util.Scanner;

public class GuessApp {
	
private static final Random randNums = new Random();
	
	public static void StartGuessing(){
		
        Scanner input = new Scanner(System.in);
		int guess;
		int number;
		int tries = 6;
				
		guess = 1 + randNums.nextInt(10);

                System.out.printf("Tries: %d\n", tries);		

		System.out.print("Guess a number between 1 and 10: ");
                number = input.nextInt();
		
		while(guess != number && tries != 0)
		{	
                                              									
			 if(number > guess)
			    System.out.println("Too high!");
			 else if(number < guess)
				 System.out.println("Too low!");

                          tries--;
                            
                          System.out.printf("Tries: %d\n", tries);
			 			 
                          System.out.print("Guess a number between 1 and 10: ");
                          number = input.nextInt();
                           
                          
                          			 		  	
		}
		
		if(guess == number)
		{
		
		    if(tries == 6)
			System.out.println("Excellent! You guessed it on your first try");
		    else if(tries >= 3 &&  tries <= 5)
			    System.out.println("You guessed it");
                    else if(tries >= 0 &&  tries <= 2)
			    System.out.println("Try harder next time!");
		    		    				
		}
		else
		   System.out.println("You're terrible at this game!");

                System.out.printf("%c 2015 Alex Mack\n\n", 169);
			
	}


	public static void main(String[] args) {
		
		StartGuessing();

	}

}