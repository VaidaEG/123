/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rock.paper.scissors;

import java.util.Scanner;

/**
 *
 * @author 37067
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0;
        int pcWins = 0;
        int draw = 0;
        int match = 0;
        int userRock = 0;
        int userPaper = 0;
        int userScissors = 0;
        int pcRock = 0;
        int pcScissors = 0;
        int pcPaper = 0;
        System.out.println("Choose your number:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("0. The end of the game");
        int userChoice = sc.nextInt();
        if (userChoice == 1) {
            userRock++;
        }
        if (userChoice == 2) {
            userPaper++;
        }
        if (userChoice == 3) {
            userScissors++;
        }
        if (userChoice != 0) {
            do{
                if(userChoice < 0 || userChoice > 3){
                    System.out.println("Choose your number:");
                    System.out.println("1. Rock");
                    System.out.println("2. Paper");
                    System.out.println("3. Sissors");
                    System.out.println("0. The end of the game");
                    userChoice = sc.nextInt();
                    if (userChoice == 1) {
                        userRock++;
                    }
                    if (userChoice == 2) {
                        userPaper++;
                    }
                    if (userChoice == 3) {
                        userScissors++;
                    }
                }
                if (userChoice >= 1 || userChoice <= 3){
                    int pcChoice = (int) (Math.random() * 3) + 1;
                    if (pcChoice == 1) {
                        pcRock++;
                    }
                    if (pcChoice == 2) {
                        pcPaper++;
                    }
                    if (pcChoice == 3) {
                        pcScissors++;
                    }
                    if (userChoice == 1 && pcChoice == 3 || userChoice == 2 && pcChoice == 1 || userChoice == 3 && pcChoice == 2){
                        System.out.println();
                        System.out.println("User choice: " + userChoice);
                        System.out.println("Computer choice: " + pcChoice);
                        System.out.println("Congratulations! You won!");
                        match++;
                        System.out.println();
                        System.out.println("Choose your number:");
                        System.out.println("1. Rock");
                        System.out.println("2. Paper");
                        System.out.println("3. Sissors");
                        System.out.println("0. The end of the game");
                        userWins++;
                        userChoice = sc.nextInt();
                        if (userChoice == 1) {
                            userRock++;
                        }
                        if (userChoice == 2) {
                            userPaper++;
                        }
                        if (userChoice == 3) {
                            userScissors++;
                        }
                        
                    } else if (pcChoice == 1 && userChoice == 3 || pcChoice == 2 && userChoice == 1 || pcChoice == 3 && userChoice == 2) {
                        System.out.println();
                        System.out.println("User choice: " + userChoice);
                        System.out.println("Computer choice: " + pcChoice);
                        System.out.println("I'm sorry... Computer won!");
                        match++;
                        System.out.println();
                        System.out.println("Choose your number:");
                        System.out.println("1. Rock");
                        System.out.println("2. Paper");
                        System.out.println("3. Sissors");
                        System.out.println("0. The end of the game");
                        pcWins++;
                        userChoice = sc.nextInt();
                        if (userChoice == 1) {
                            userRock++;
                        }
                        if (userChoice == 2) {
                            userPaper++;
                        }
                        if (userChoice == 3) {
                            userScissors++;
                        }
                    } else if (userChoice == pcChoice) {
                        System.out.println("User choice: " + userChoice);
                        System.out.println("Computer choice: " + pcChoice);
                        System.out.println("Draw!");
                        match++;
                        System.out.println();
                        System.out.println("Choose your number:");
                        System.out.println("1. Rock");
                        System.out.println("2. Paper");
                        System.out.println("3. Sissors");
                        System.out.println("0. The end of the game");
                        draw++;
                        userChoice = sc.nextInt();
                        if (userChoice == 1) {
                            userRock++;
                        }
                        if (userChoice == 2) {
                            userPaper++;
                        }
                        if (userChoice == 3) {
                            userScissors++;
                        }  
                    }
                }
                if (userChoice == 0) {
                    float userRockPercent = userRock *100F / match;
                    float userPaperPercent = userPaper * 100F / match;
                    float userScissorsPercent = userScissors * 100F / match;
                    float pcRockPercent = pcRock *100F / match;
                    float pcPaperPercent = pcPaper * 100F / match;
                    float pcScissorsPercent = pcScissors * 100F / match;
                    System.out.println("Statistics:");
                    System.out.println("Number of maches: " + match);
                    System.out.println("User won " + userWins + " times");
                    System.out.println("Computer won " + pcWins + " times");
                    System.out.println("Draw " + pcWins + " times");
                    System.out.println();
                    System.out.println("User choices:");
                    System.out.println("Rock " + userRock + " times - " + userRockPercent + "%");
                    System.out.println("Paper " + userPaper + " times - " + userPaperPercent + "%");
                    System.out.println("Scissors " + userScissors + " times - " + userScissorsPercent + "%");
                    System.out.println();
                    System.out.println("Computer choices:");
                    System.out.println("Rock " + pcRock + " times - " + pcRockPercent + "%");
                    System.out.println("Paper " + pcPaper + " times - " + pcPaperPercent + "%");
                    System.out.println("Scissors " + pcScissors + " times - " + pcScissorsPercent + "%");
                    
                }
            } while (userChoice != 0);
        } else {
            System.out.println("The end of the game");
            System.out.println("Number of maches: " + match);
        }
    }
}
