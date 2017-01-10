package com.xp.goosegame;


public class Main {
    public static void main(String [] args) {
        String input = "aggiungi giocatore Pippo";
        Parser parser = new Parser();
        Player player = parser.parse(input);
        Game game = new Game();
        game.add(player);
    }
}
