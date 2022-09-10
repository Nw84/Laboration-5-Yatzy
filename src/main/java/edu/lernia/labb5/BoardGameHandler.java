package edu.lernia.labb5;  

public class BoardGameHandler {
    /* Will be used to store all boardgamematerials and handle the rules */
    public static Die[] dice;
    
    public boolean rollDice() {
        dice = new Die[5];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die();
            dice[i].DieRoll();
            System.out.println(i+1 + ": " + dice[i].getString());
        }
        boolean result = checkForYatzy(dice);  
        return result; 
    }

    public boolean checkForYatzy(Die [] result) {
        boolean isYatzy = true;
                for(int i = 1; i < result.length; i++) {
                    if(result[i].value != result[0].value) {
                        isYatzy = false;
                    }
                } if(isYatzy) {
                    System.out.println("You got YATZI! in " + result[0].value + "'s");
                }
                return isYatzy;
    }
}
