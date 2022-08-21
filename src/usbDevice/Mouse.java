package usbDevice;

public class Mouse implements USBDevice
    {
    private String name;

    public Mouse(String name)
        {
        this.name = name;
        }

    @Override
    public boolean isConnected()
        {
        System.out.println("mouse is connected");
        return true;
        }

    @Override
    public boolean isDisconnected()
        {
        System.out.println("mouse is disconnected");
        return true;
        }

    @Override
    public String getName()
        {
        return name;
        }
    }
