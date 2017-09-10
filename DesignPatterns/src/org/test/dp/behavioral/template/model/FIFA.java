package org.test.dp.behavioral.template.model;

public class FIFA extends GameTemplate
{
    @Override
    void loadGame()
    {
        System.out.println("Loading FIFA...");
    }

    @Override
    void startPlay()
    {
        System.out.println("Playing FIFA...");
    }

    @Override
    void endGame()
    {
        System.out.println("Closing FIFA...");
    }
}
