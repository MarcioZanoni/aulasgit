package com.dream.rpsgame;

import java.util.Random;
import java.util.Scanner;

/**
 * @author marcio.dev
 */
public class RPSGame {

    public static void main(String[] args) {
        //declaring variables
        String rock = "rock" ;
        String paper = "paper";
        String scissors = "scissors";
        String computerChoice;
        
        //printing welcome game
        System.out.println("Welcome to Rock, Paper and scissors game");
        System.out.println("Choose: Rock, Paper or Scissors");
        
        // Data entry
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
        
        //Generate computer choice
          int randomChoice = (int) (Math.random()*3);
          
        switch (randomChoice) {
            case 0:
                computerChoice = rock;
                break;
            case 1:
                computerChoice = paper;
                break;
            default:
                computerChoice = scissors;
                break;
        }
          System.out.println("Computer chose: " + computerChoice);
          }
        
}






