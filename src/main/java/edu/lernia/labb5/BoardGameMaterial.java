package edu.lernia.labb5;

public class BoardGameMaterial {
    /* Will be used to store all boardgamematerials in one class */
    public static Die[] ds;
    
    public boolean rollDies() {
        ds = new Die[5];
        for (int i = 0; i < ds.length; i++) {
            ds[i] = new Die();
            ds[i].DieRoll();
            System.out.println(i+1 + ": " + ds[i].getString());
        }
        boolean result = checkResult(ds);  
        return result; 
    }

    public boolean checkResult(Die [] result) {
        boolean isYatzy = true;
                for(int i = 1; i < result.length; i++) {
                    if(result[i].value != result[0].value) {
                        isYatzy = false;
                    }
                } if(isYatzy) {
                    System.out.println("You got YATZI! in " + result[0].getString() + "'s");
                }
                return isYatzy;
    }
}
