package com.xp.goosegame;


public class Main {
    public static void main(String [] args) {

        Game game = new Game();
        Parser parser = new Parser();
        GameEngine engine = new GameEngine(game, parser);

        //LOOP
        String input = "aggiungi giocatore Pippo";
        engine.action(input);
        engine.getState();
    }
}
