package org.test.dp.structural.adapter.model;

public class VLCPlayer implements AdvancedMediaPlayer
{
    @Override
    public void playMP4(final String fileName)
    {
        System.out.println("Playing file \"" + fileName + ".mp4\" from " + this.getClass().getSimpleName());
    }

    @Override
    public void playMKV(final String fileName)
    {
        System.out.println("Playing file \"" + fileName + ".mkv\" from " + this.getClass().getSimpleName());
    }

    @Override
    public void playAVI(final String fileName)
    {
        System.out.println("Playing file \"" + fileName + ".avi\" from " + this.getClass().getSimpleName());
    }
}
