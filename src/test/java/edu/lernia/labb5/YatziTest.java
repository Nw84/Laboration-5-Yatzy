package edu.lernia.labb5;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    public static Die[] d;
    @Test
    void isYatziWhenAllDiceMatches() {
        d = new Die[5];
        Arrays.fill(d, new Die());
        for (int i = 0; i < d.length; i++) {
            d[i].value = 6;
        }

        BoardGameMaterial game = new BoardGameMaterial();
        assertTrue(game.checkResult(d)); 
    }

    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Die[] dice = new Die[5];
        Arrays.fill(dice, new Die());
        for(Die die: dice) {
            die.value = (int)(Math.random()*4+1);
        }
        dice[0].value = 1;
        
        BoardGameMaterial game = new BoardGameMaterial();
        assertFalse(game.checkResult(dice)); 
    }
}
