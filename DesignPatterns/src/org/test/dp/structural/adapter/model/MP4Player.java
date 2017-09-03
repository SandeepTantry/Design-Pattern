package org.test.dp.structural.adapter.model;

public class MP4Player implements AdvancedMediaPlayer
{
    @Override
    public void playMP4(final String fileName)
    {
        System.out.println("Playing file \"" + fileName + ".mp4\" from " + this.getClass().getSimpleName());
    }

    @Override
    public void playMKV(final String fileName)
    {
        System.out.println(this.getClass().getSimpleName() + " doesn't support MKV format for file \"" + fileName + "\"");
    }

    @Override
    public void playAVI(final String fileName)
    {
        System.out.println("Playing AVI file \"" + fileName + ".avi\" from " + this.getClass().getSimpleName());
    }
}
