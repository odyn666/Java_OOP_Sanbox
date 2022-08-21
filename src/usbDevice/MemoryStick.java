package usbDevice;

public class MemoryStick implements USBDevice
    {

    private String name;
   private boolean ejected=false;

    public MemoryStick(String name)
        {
        this.name = name;
        }

    @Override
    public boolean isConnected()
        {
        System.out.println("MemoryStick is connected");
        return false;
        }

    @Override
    public boolean isDisconnected()
        {
        if (!ejected)
            {
            System.out.println("please eject Memory Stick");
            return false;
            }
        else
            {
            System.out.println("MemoryStick is Disconnected");
            return true;
            }
        }

    public void eject()
        {
        System.out.println("ejecting Memory Stick");
         ejected=true;
        }

    @Override
    public String getName()
        {
        return name;
        }
    }
