package com.xp.goosegame;

public class CommandParser {
    public static final String ADD_PLAYER_COMMAND = "aggiungi giocatore (\\w+)";

    public Command parse(String input) {
        if(input.matches(ADD_PLAYER_COMMAND)) {
            return Command.addPlayer;
        }
        return Command.invalid;
    }
}
