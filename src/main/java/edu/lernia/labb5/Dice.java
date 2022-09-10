package edu.lernia.labb5;

public class Dice extends BoardGameHandler {
    private int diceValue;

    public int getDiceValue() {
        return this.diceValue; 
    }

    public void SetDiceValue(int value) {
        this.diceValue = value; 
    }

    public int DiceRoll() {
        diceValue = (int)(Math.random()*6+1);
        return diceValue;
    }

    public String getString() {
        return "Dice shows " + diceValue;
    }
}
