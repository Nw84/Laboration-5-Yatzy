package edu.lernia.labb5;

public class Die extends BoardGameHandler {
    public int value;

    public Die() {
        value = (int) Math.random();
    }

    public int DieRoll() {
        value = (int)(Math.random()*6+1);
        return value;
    }

    public String getString() {
        return "Dice shows " + value;
    }
}
