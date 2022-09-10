package edu.lernia.labb5;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    public static Die[] d;
    @Test
    void isYatziWhenAllDiceMatches() {
        Die[] dice = new Die[5];
        for(Die die: dice) {
            die.value = 6;
        }

        BoardGameMaterial game = new BoardGameMaterial();
        assertTrue(game.checkResult(dice)); 
    }

    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i; 
        }
        
        BoardGameMaterial game = new BoardGameMaterial();
        
    }
}
