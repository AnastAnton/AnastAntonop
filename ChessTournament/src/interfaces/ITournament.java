package interfaces;

import java.util.List;
import models.Player;

public interface ITournament {
    void introducePlayers(List<Player> players);
    void startTournament();
    
}
