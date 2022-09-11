package edu.lernia.labb5;  

public class BoardGameHandler {
    /* Will be used to store all boardgamematerials and handle the rules */
    public static Dice[] dice;
    
    public boolean rollAllDice() {
        dice = new Dice[5];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Dice();
            dice[i].DiceRoll();
            System.out.println(i+1 + ": " + dice[i].getString());
        }
        return checkForYatzy(dice);
    }

    public boolean checkForYatzy(Dice [] result) {
        boolean isYatzy = true;
                for(int i = 1; i < result.length; i++) {
                    if(result[i].getDiceValue() != result[0].getDiceValue()) {
                        isYatzy = false;
                    }
                } if(isYatzy) {
                    System.out.println("You got YATZI! in " + result[0].getDiceValue() + "'s");
                }
                return isYatzy;
    }
}
