package org.test.dp.structural.adapter.model;

/**
 * 2 unrelated interfaces can work together
 */

public class MediaAdapter implements MediaPlayer
{
    private final VLCPlayer advancedPlayer = new VLCPlayer();
    
    @Override
    public void play(final String type, final String fileName)
    {
        switch(type.toLowerCase())
        {
            case "mp4" : advancedPlayer.playMP4(fileName); break;
            case "mkv" : advancedPlayer.playMKV(fileName); break;
            case "avi" : advancedPlayer.playAVI(fileName); break;
            default : throw new RuntimeException("Unsupported file format : " + type);
        }
    }
}
