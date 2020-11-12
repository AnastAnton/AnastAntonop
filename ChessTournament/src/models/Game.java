package models;

import interfaces.IGame;

public class Game extends Naming implements IGame{
    private Player[] players;
    
    public Game(){
        System.out.println("Game 1");
    }
   
    public Game(String name, Player[] players){
        this.setName(name); 
        this.start(players);
    }
    public void start(Player[] players){
        System.out.println(this.getName());
        System.out.println("Player " + players[0] + " plays aginst Player " + players[1]);
        this.players = players;
        this.playersMove(players, new Clock());
    }
    public void playersMove(Player[] players, Clock c){
         //Player X plays move m against Player Y
         // 15'' * 4 = 1' * 10 = 10' == 600"
         // 600" = 40 cycles, 20 cycles
        int timer = 600;
        for(int i = 0; i < 40; i++){
            System.out.println("-Player " + c.playerTurn(timer, players) + 
                               " plays move " + c.playerTurn(timer, players).moves(this) 
                               + ". Remaining time: " + (timer-15) + "\n");
            timer -= 15;
        }
    }
}
