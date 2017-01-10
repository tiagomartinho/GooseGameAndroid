package com.xp.goosegame;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser {

    public static final String ADD_PLAYER_COMMAND = "aggiungi giocatore (\\w+)";

    public Player parse(String input) {
        Pattern p = Pattern.compile(ADD_PLAYER_COMMAND);
        Matcher m = p.matcher(input);
        if (m.find()) {
           return new Player(m.group(1));
        } else {
            return null;
        }
    }
}
