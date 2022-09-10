package edu.lernia.labb5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    public static Die[] d;
    @Test
    void isYatziWhenAllDiceMatches() {
        Die[] dice = new Die[5];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die();
            dice[i].value = 6; 
        }

        BoardGameHandler game = new BoardGameHandler();
        assertTrue(game.checkForYatzy(dice)); 
    }

    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Die[] dice = new Die[5];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die();
            dice[i].value = i; 
        }
        
        BoardGameHandler game = new BoardGameHandler();
        assertFalse(game.checkForYatzy(dice));
    }
}
