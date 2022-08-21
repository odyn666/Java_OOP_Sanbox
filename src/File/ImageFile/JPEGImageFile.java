package File.ImageFile;

public class JPEGImageFile extends AbstractImageFile
    {
    int compression;

    public JPEGImageFile(String name, int size, int compression)
        {
        super(name, size);
        this.compression = compression;
        }


    public void displayImage()
        {
        System.out.println("displaying JPEG");
        }

    }
