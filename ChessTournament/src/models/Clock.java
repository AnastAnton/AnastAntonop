package models;

import interfaces.IClock;

public class Clock implements IClock {

    Clock(){
    }

    public Player playerTurn (int timer, Player[] players){ 
        if(timer % 30 == 0){
            return players[0];
        }else{
            return players[1];
        }        
    }
}
