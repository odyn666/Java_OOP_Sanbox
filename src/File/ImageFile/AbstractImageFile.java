package File.ImageFile;

import File.AbstractFile;
import File.FileType;


public abstract class AbstractImageFile extends AbstractFile
    {

    public AbstractImageFile(String name, int size)
        {
        super(name, size);
        }

    @Override
    public FileType getType()
        {
        return FileType.IMAGE;
        }
    }
