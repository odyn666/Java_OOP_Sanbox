package File.MusicFile;

import File.AbstractFile;

public class MP3MusicFile extends AbstractMusicFile
    {
        int quality;



    public MP3MusicFile(String name, int size, String bandName, String title, int quality)
        {
        super(name, size, bandName, title);


        this.quality = quality;
        }

    @Override
    public void play()
        {
        System.out.println("playing MP3 music");

        }

    public int getQuality()
        {
        return this.quality;
        }
    }
