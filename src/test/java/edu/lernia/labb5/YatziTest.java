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

        BoardGameMaterial game = new BoardGameMaterial();
        assertTrue(game.checkResult(dice)); 
    }

    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Die[] dice = new Die[5];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die();
            dice[i].value = i; 
        }
        
        BoardGameMaterial game = new BoardGameMaterial();
        assertFalse(game.checkResult(dice));
    }
}
