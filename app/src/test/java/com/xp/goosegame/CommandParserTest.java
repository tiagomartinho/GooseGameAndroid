package com.xp.goosegame;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CommandParserTest {
    @Test
    public void adds_player_command() throws Exception {
        String userInput = "aggiungi giocatore Pippo";

        CommandParser parser = new CommandParser();
        Command command = parser.parse(userInput);

        assertEquals(Command.addPlayer, command);
    }

    @Test
    public void invalid_command() throws Exception {
        String userInput = "fgghfdsdgfgfd";

        CommandParser parser = new CommandParser();
        Command command = parser.parse(userInput);

        assertEquals(Command.invalid, command);
    }
}
