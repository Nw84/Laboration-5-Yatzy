package edu.lernia.labb5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    public static Dice[] d;
    @Test
    void isYatziWhenAllDiceMatches() {
        Dice[] dice = new Dice[5];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Dice();
            dice[i].SetDiceValue(6);
        }

        BoardGameHandler game = new BoardGameHandler();
        assertTrue(game.checkForYatzy(dice)); 
    }

    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Dice[] dice = new Dice[5];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Dice();
            dice[i].SetDiceValue(i);
        }
        
        BoardGameHandler game = new BoardGameHandler();
        assertFalse(game.checkForYatzy(dice));
    }
}
