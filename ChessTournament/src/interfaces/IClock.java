package interfaces;

import models.Player;

public interface IClock {
    Player playerTurn(int timer, Player[] players);
    
}
