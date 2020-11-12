package interfaces;

import models.Clock;
import models.Player;

public interface IGame {
    
    public void start(Player[] players);
    
    public void playersMove(Player[] players, Clock c);
    
    public static String dummy(){ //the only way to have body in interface is with static
//        System.out.println("");
            return("");
    }
}
