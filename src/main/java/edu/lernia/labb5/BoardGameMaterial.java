package edu.lernia.labb5;


public class BoardGameMaterial {
    /* Will be used to store all boardgamematerials in one class */

    public boolean rollDies(Die[] d) {
        int [] result = new int[5];
        for(int i=0;i<d.length;i++) {
            d[i].DieRoll();
            //ds[i].value = 5; //Test if yatzi work
            System.out.println(i+1 + ": " + d[i].getString());
            result[i] = d[i].value;
        }
        boolean yatzy = checkResult(result);
        return yatzy; 
    }

    public boolean checkResult(int [] result) {
        boolean isYatzy = true;
                for(int i = 1; i < result.length; i++) {
                    if(result[i] != result[0]) {
                        isYatzy = false;
                    }
                } if(isYatzy) {
                    System.out.println("You got YATZI! in " + result[0] + "'s");
                }
                return isYatzy;
    }
}
