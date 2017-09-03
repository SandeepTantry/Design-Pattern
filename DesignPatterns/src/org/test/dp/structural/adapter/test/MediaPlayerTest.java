package org.test.dp.structural.adapter.test;

import java.io.InputStreamReader;
import java.util.Scanner;

import org.test.dp.structural.adapter.model.AudioPlayer;
import org.test.dp.structural.adapter.model.MediaAdapter;

public class MediaPlayerTest
{
    public static void main(String[] args)
    {
        try (final Scanner scanner = new Scanner(new InputStreamReader(System.in)))
        {
            String flag = "Y";
            String type = null;
            String fileName = null;

            AudioPlayer audioPlayer = new AudioPlayer();
            MediaAdapter adapter = new MediaAdapter();
            
            do
            {
                System.out.println("Enter file type\n[MP3, MP4, MKV, AVI]");
                type = scanner.nextLine().trim();
                
                System.out.println("Enter file name");
                fileName = scanner.nextLine().trim();
                
                switch (type.toLowerCase())
                {
                    case "mp3" : audioPlayer.play(type, fileName); break;
                    case "mp4" :
                    case "mkv" :
                    case "avi" : adapter.play(type, fileName); break;
                    default : throw new RuntimeException("Unsupported file format " + type.toLowerCase());
                }
                
                System.out.println("\nDo you wish to continue? [Y/N]");
                flag = scanner.nextLine().trim();
            } while ("Y".equalsIgnoreCase(flag));
        }
        finally
        {
            System.out.println("\nProgram ended...");
        }
    }
}
