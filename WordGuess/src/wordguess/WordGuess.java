/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */

package wordguess;
import java.util.Scanner;
 
 /**
  * Plays a word guessing game with one player.
  */
 public class WordGuess {

	public static void main(String[] args) {
		final String SECRET_WORD = "BRAIN";
		final String FLAG = "!";
		String wordSoFar = "", updatedWord = "";
		String letterGuess, wordGuess = "";
		int numGuesses = 0;
                int points = 100;
             
		Scanner input = new Scanner(System.in);
		
		/* begin game */
		System.out.println("WordGuess game.\n");
		for (int i = 0; i < SECRET_WORD.length(); i++) {
			wordSoFar += "-";								//word as dashes
		}
		System.out.println(wordSoFar + "\n");				//display dashes
	
		/* allow player to make guesses*/
		do {
                        System.out.println("Enter a letter (" + FLAG + " to guess entire word): ");
		
                        letterGuess = input.nextLine();
			letterGuess = letterGuess.toUpperCase();			
		
			/* increment number of guesses */
			numGuesses += 1;
			
			/* player correctly guessed a letter--extract string in wordSoFar up to the letter 
			 * guessed and then append guessed letter to that string. Next, extract rest of 
			 * wordSoFar and append after the guessed letter
			 */
			if (SECRET_WORD.indexOf(letterGuess) >= 0) {
				updatedWord = wordSoFar.substring(0, SECRET_WORD.indexOf(letterGuess)); 
				updatedWord += letterGuess;												
				updatedWord += wordSoFar.substring(SECRET_WORD.indexOf(letterGuess)+1, wordSoFar.length());
				wordSoFar = updatedWord;
			}
				
			/* display guessed letter instead of dash */
			System.out.println(wordSoFar + "\n");
		} while (!letterGuess.equals(FLAG) && !wordSoFar.equals(SECRET_WORD));
                
                if (letterGuess.equals(SECRET_WORD)) {
                   
                }
                if (!letterGuess.equals(letterGuess)) {
                    
                    
                   
                }
		/* finish game and display message and number of guesses */
		if (letterGuess.equals(FLAG)) {
			System.out.println("What is your guess? ");
			wordGuess = input.nextLine();
			wordGuess = wordGuess.toUpperCase();
		}
		if (wordGuess.equals(SECRET_WORD) || wordSoFar.equals(SECRET_WORD)) {
			System.out.println("You won!");		
		} else {
			System.out.println("Sorry. You lose.");
		}
                
		System.out.println("The secret word is " + SECRET_WORD);
                   int FinalS = points - 10 * (numGuesses - 1) + 40;
		System.out.println("You made " + numGuesses + " guesses.");
                System.out.println("You have " + FinalS + " Remaining");
                
	}
        }