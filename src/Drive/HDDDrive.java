package Drive;

import java.io.File;
import java.util.*;

public class HDDDrive  implements Drive{
List<File> files = new ArrayList<>();
@Override
public void addFile(File file)
    {
        files.add(file);
    }

@Override
public void listFiles()
    {
        for(File file: files)
    {
        System.out.println(file.getName());
    }
    }

@Override
public File findFile(String name)
    {
       Optional<File>FoundedFile= files.stream().filter(file -> file.getName().equals(name)).findFirst();

       return FoundedFile.orElseThrow();
    }
}
