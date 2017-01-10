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

//    @Test
    public void
    moves_a_player() throws Exception {
        String addPlayerInput = "aggiungi giocatore Pippo";
        String movePlayerInput = "muovi Pippo 4,2";
        String expectedOutput = "Pippodskjfgskjh";
        Game game = new Game();
        Parser parser = new Parser();
        GameEngine engine = new GameEngine(game, parser);

        engine.action(addPlayerInput);
        engine.action(movePlayerInput);

        assertEquals(expectedOutput, engine.getState());
    }
}

