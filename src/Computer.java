import Drive.Drive;
import usbDevice.USBDevice;

import java.util.ArrayList;
import java.util.List;

public class Computer
    {
    private Monitor monitor;
    private Drive drive;
    private Headphones headphones;

    private List<USBDevice> usbDevices = new ArrayList<USBDevice>();

    public Computer(Monitor monitor, Drive drive)
        {

        this.monitor = monitor;
        this.drive = drive;
        }

    public Monitor getMonitor()
        {
        return monitor;
        }

    public void setMonitor(Monitor monitor)
        {
        this.monitor = monitor;
        }

    public Drive getDrive()
        {
        return drive;
        }

    public void setDrive(Drive drive)
        {
        this.drive = drive;
        }

    public Headphones getHeadphones()
        {
        return headphones;
        }

    public void setHeadphones(Headphones headphones)
        {
        this.headphones = headphones;
        }

    public List<USBDevice> getUsbDevices()
        {
        return usbDevices;
        }

    public void addUsbDevice(USBDevice usbDevice)
        {
        boolean isConnected = usbDevice.isConnected();
        if (isConnected)
            {
            usbDevices.add(usbDevice);
            }
        }

    public void removeUsbDevice(USBDevice usbDevice)
        {
        boolean isDisconnected = usbDevice.isDisconnected();
        if (!isDisconnected)
            {
            System.out.println("forcibly removed UsbDevice");
            }
        usbDevices.remove(usbDevice);
        }
    }
