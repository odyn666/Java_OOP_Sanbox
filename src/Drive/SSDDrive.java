package Drive;

import java.io.*;
import java.util.*;

public class SSDDrive implements Drive
    {

    Map<String, File> files=new HashMap<String, File>();

    @Override
    public void addFile(File file)
        {
            files.put(file.toString(), file);
        }

    @Override
    public void listFiles()
        {
            Collection<File> fileCollection=files.values();

            for(File file:fileCollection)
                {
                System.out.println(file.getName());
                }
        }

    @Override
    public File findFile(String name)
        {
        return files.get(name);
        }
    }
