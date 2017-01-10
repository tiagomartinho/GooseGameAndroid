package com.xp.goosegame;

class GameEngine {

    private final Game game;
    private final Parser parser;

    public GameEngine(Game game, Parser parser) {
        this.game = game;
        this.parser = parser;
    }

    public void action(String input) {
        Command command = new CommandParser().parse(input);
        if(command == Command.addPlayer) {
            game.add(parser.parse(input));
        }
    }

    public String getState() {
        String state = "Giocatori: ";
        for (Player player:game.players()) {
            state += player.getName();
        }
        return state;
    }
}
