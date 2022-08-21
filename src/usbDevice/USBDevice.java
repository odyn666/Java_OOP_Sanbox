package usbDevice;

public interface USBDevice
    {
    boolean isConnected();
    boolean isDisconnected();
    String getName();
    }
