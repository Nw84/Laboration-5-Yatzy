package edu.lernia.labb5;

import java.util.Arrays;
import java.util.Scanner;

public class YatziMain {
    public static Die[] ds;
    public static boolean bGameIsOn = true;

    public static void main(String[] args) {
        int turn = 1;
        ds = new Die[5];
        Arrays.fill(ds, new Die());
     
        BoardGameMaterial game = new BoardGameMaterial();
        System.out.println("Welcome to Yatzi!");
        Scanner scanner = new Scanner(System.in);

        while(turn <= 3) {
            System.out.println("Starting turn " + (turn) + " of 3, rolling dice.");
            game.rollDies(ds);
            if(game.checkResult(ds)) {
                System.out.println("You got YATZI! in " + ds[0].value + "'s");
                return;  
            } else if (turn == 3){
                System.out.println("Game over! Want to play again?");  
                        if(scanner.next().equals("y")) {
                            turn = 1;
                        } else {
                            break;
                        }
            }
            else {
                System.out.println("Want to throw again? (y for yes, anything else for no)");
                if(scanner.next().equals("y")) {
                    turn++; 
                } else {
                    break; 
                }
            }
        } 
    }
}