package com.xp.goosegame;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser {

    public Player parse(String input) {
        Pattern p = Pattern.compile("aggiungi giocatore (\\w+)");
        Matcher m = p.matcher(input);
        if (m.find()) {
           return new Player(m.group(1));
        } else {
            return null;
        }
    }
}
