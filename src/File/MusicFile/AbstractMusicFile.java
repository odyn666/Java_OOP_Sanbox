package File.MusicFile;

import File.AbstractFile;
import File.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile
    {
    String bandName;
    String title;

    public AbstractMusicFile(String name,int size,String bandName, String title)
        {
        super(name,size);
        this.bandName = bandName;
        this.title = title;
        }

    @Override
    public FileType getType()
        {
        return FileType.MUSIC;
        }



    }
