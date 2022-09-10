package edu.lernia.labb5;

public class Die extends BoardGameHandler {
    private int value;

    public int getValue() {
        return this.value; 
    }

    public void setValue(int value) {
        this.value = value; 
    }

    public int DieRoll() {
        value = (int)(Math.random()*6+1);
        return value;
    }

    public String getString() {
        return "Dice shows " + value;
    }
}
