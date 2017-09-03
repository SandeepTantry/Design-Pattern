package org.test.dp.structural.composite.test;

import org.test.dp.structural.composite.model.Application;
import org.test.dp.structural.composite.model.Eclipse;
import org.test.dp.structural.composite.model.Game;
import org.test.dp.structural.composite.model.OS;
import org.test.dp.structural.composite.model.VideoPlayer;

public class OSTester
{
    public static void main(String[] args)
    {
        final Application game = new Game();
        game.close();
        
        final Application eclipse = new Eclipse();
        eclipse.close();
        
        final Application player = new VideoPlayer();
        player.close();
        
        final OS os = new OS();
        os.add(game);
        os.add(player);
        os.add(eclipse);
        os.close();
    }
}
