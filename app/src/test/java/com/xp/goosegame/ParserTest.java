package com.xp.goosegame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static junit.framework.Assert.assertEquals;



@RunWith(MockitoJUnitRunner.class)
public class ParserTest {

    @Test
    public void
    add_player_command() throws Exception {
        String input = "aggiungi giocatore Pippo";
        Player expectedPlayer = new Player("Pippo");

        InputParser parser = new InputParser();
        Player player = parser.parse(input);

        assertEquals(expectedPlayer, player);
    }

    private class InputParser {

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
}