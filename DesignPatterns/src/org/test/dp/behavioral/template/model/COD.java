package org.test.dp.behavioral.template.model;

public class COD extends GameTemplate
{
    @Override
    void loadGame()
    {
        System.out.println("Loading COD...");
    }

    @Override
    void startPlay()
    {
        System.out.println("Playing COD...");
    }

    @Override
    void endGame()
    {
        System.out.println("Closing COD...");
    }
}
