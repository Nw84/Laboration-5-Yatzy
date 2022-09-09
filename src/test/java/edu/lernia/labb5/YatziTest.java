package edu.lernia.labb5;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    public static Die[] d;
    @Test
    void isYatziWhenAllDiceMatches() {
        int [] array = new int[5];
        Arrays.fill(array, 5);

        BoardGameMaterial game = new BoardGameMaterial();
        assertTrue(game.checkResult(array)); 
    }

    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i; 
        }
        
        BoardGameMaterial game = new BoardGameMaterial();
        assertFalse(game.checkResult(array));
    }
}
