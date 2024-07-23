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
          /*int randomChoice = (int) (Math.random()*3);
          
          if (randomChoice == 0){
              computerChoice = rock;}
          else if(randomChoice == 1) {
              computerChoice == paper;}
          else {
              computerChoice = scissors;}
          System.out.println("Computer chose: " + computerChoice);
          }
        */
}

}




