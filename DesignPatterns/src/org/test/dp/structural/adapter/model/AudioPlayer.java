package org.test.dp.structural.adapter.model;

public class AudioPlayer implements MediaPlayer
{
    @Override
    public void play(final String type, final String fileName)
    {
        System.out.println("Playing " + fileName + " of type " + " from " + this.getClass().getName());
    }
}
