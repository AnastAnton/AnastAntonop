package models;

import interfaces.IPlayer;

public class Player extends Naming implements IPlayer {
    private int counter = 0;
    
    public Player(){}
    
    public Player(String name){
        this.setName(name);
        System.out.println(name);
    }

    /*
        In this method we need to figure out
        for the specific game which move the player does
    */
    public String moves(Game game){
        counter ++;
        String result = "";
        result = Integer.toString(counter);
//        result = counter + "";  
        return(result);
    }

}
