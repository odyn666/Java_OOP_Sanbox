import Drive.HDDDrive;
import Drive.SSDDrive;
import usbDevice.MemoryStick;
import usbDevice.Mouse;

import java.io.File;


public class Main
    {


    public static void main(String[] args)
        {
            Monitor monitor = new Monitor();
          //  HDDDrive drive = new HDDDrive();
            SSDDrive drive = new SSDDrive();
            Computer computer = new Computer(monitor,drive);

        //   drive.addFile(new File("test.jpg"));
         //   drive.listFiles();

       MemoryStick MemoryStick = new MemoryStick("pendrive");
       Mouse mouse = new Mouse("mouse");

       computer.addUsbDevice(MemoryStick);
       computer.addUsbDevice(mouse);

      // MemoryStick.eject();  //uncomment for force remove
       computer.removeUsbDevice(MemoryStick);
       computer.removeUsbDevice(mouse);
        }


    }

