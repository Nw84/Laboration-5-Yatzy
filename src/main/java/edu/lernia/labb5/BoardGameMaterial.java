package edu.lernia.labb5;


public class BoardGameMaterial {
    /* Will be used to store all boardgamematerials in one class */

    public Die[] rollDies(Die[] d) {
        for(int i=0;i<d.length;i++) {
            d[i].DieRoll();
            //ds[i].value = 5; //Test if yatzi work
            System.out.println(i+1 + ": " + d[i].getString());
        }
        return d;
    }

    public boolean checkResult(Die[] d) {
        for(int i=1;i<5;i++) {
        if(d[i].getString().equals(d[i -1].getString())) {
            return false;
        } 
    } return true; 
        
    }
}
