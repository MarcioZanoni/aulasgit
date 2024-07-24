/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.game.rps;

import java.util.Scanner;

/**
 *
 * @author marcio.dev
 */
public class RPS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
        //declaring variables
        String rock = "rock" ;
        String paper = "paper";
        String scissors = "scissors";
        String computerChoice = null;
        
        //printing welcome game
        System.out.println("Welcome to Rock, Paper and scissors game");
        System.out.println("Choose: Rock, Paper or Scissors");
        
        // Data entry
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
        
        //*Generate computer choice
          int randomChoice = (int) (Math.random()*3);
          
        switch (randomChoice) {
            case 0 -> computerChoice = rock;
            case 1 -> computerChoice = paper;
            case 2 -> computerChoice = scissors;
        }
          System.out.println("Computer chose: " + computerChoice);
          }
            }


