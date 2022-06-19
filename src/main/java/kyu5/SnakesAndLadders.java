package kyu5;

import java.util.HashMap;
import java.util.Map;

public class SnakesAndLadders {
    boolean gameOver = false;
    int player1 = 0;
    int player2 = 0;
    boolean whoseMovement = false;

    public String play(int die1, int die2) {
        if(gameOver) return "Game over!";

        String numberOfPlayer = null;
        int position;

        if(this.whoseMovement) {
            position = movement(this.player2, die1 + die2);
            this.player2 = position;
            numberOfPlayer = "2";
        }
        else {
            position = movement(this.player1, die1 + die2);
            this.player1 = position;
            numberOfPlayer = "1";
        }

        if(position == 100) {
            gameOver = true;
            return "Player " + numberOfPlayer + " Wins!";
        }

        if(die1 != die2) this.whoseMovement = !this.whoseMovement;

        return "Player " + numberOfPlayer + " is on square " + position;
    }
    public int movement(int player, int length){
        player += length;

        player = snake(player);
        player = ladder(player);

        if (player > 100){
            player = 100 - (player - 100);
        }

        player = snake(player);

        return player;
    }
    public int ladder(int position){
        //ladders
        Map<Integer, Integer> mapOfLadders = new HashMap<Integer, Integer>();
        mapOfLadders.put(2,38);
        mapOfLadders.put(7,14);
        mapOfLadders.put(8,31);
        mapOfLadders.put(15,26);
        mapOfLadders.put(21,42);
        mapOfLadders.put(28,84);
        mapOfLadders.put(36,44);
        mapOfLadders.put(51,67);
        mapOfLadders.put(71,91);
        mapOfLadders.put(78,98);
        mapOfLadders.put(87,94);

        if(mapOfLadders.containsKey(position)){
            return mapOfLadders.get(position);
        }

        return position;
    }
    public int snake(int position){
        //snakes
        Map<Integer, Integer> mapOfSnakes = new HashMap<Integer, Integer>();
        mapOfSnakes.put(99,80);
        mapOfSnakes.put(95,75);
        mapOfSnakes.put(92,88);
        mapOfSnakes.put(89,68);
        mapOfSnakes.put(74,53);
        mapOfSnakes.put(64,60);
        mapOfSnakes.put(62,19);
        mapOfSnakes.put(49,11);
        mapOfSnakes.put(46,25);
        mapOfSnakes.put(16,6);

        if(mapOfSnakes.containsKey(position)){
            return mapOfSnakes.get(position);
        }

        return position;
    }
}
