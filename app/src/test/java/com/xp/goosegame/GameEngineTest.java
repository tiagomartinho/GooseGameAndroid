package com.xp.goosegame;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GameEngineTest {

    @Test
    public void
    add_a_player() throws Exception {
        String userInput = "aggiungi giocatore Pippo";
        String expectedOutput = "Giocatori: Pippo";
        Game game = new Game();
        Parser parser = new Parser();
        GameEngine engine = new GameEngine(game, parser);

        engine.action(userInput);

        assertEquals(expectedOutput, engine.getState());
    }

    private class GameEngine {

        private final Game game;
        private final Parser parser;

        public GameEngine(Game game, Parser parser) {
            this.game = game;
            this.parser = parser;
        }

        public void action(String input) {
            game.add(parser.parse(input));
        }

        public String getState() {
            String state = "Giocatori: ";
            for (Player player:game.players()) {
                state += player.getName();
            }
            return state;
        }
    }
}

