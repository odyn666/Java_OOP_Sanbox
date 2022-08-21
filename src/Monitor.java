public class Monitor
    {
    public int width=3840;
    public int height=1920;

    public void setLowResolution()
        {
        width=800;
        height=600;
        }

    public void setHighResolution()
        {
        width=3840;
        height=1920;
        }
    public String getResolution()
        {
        return width+"x"+height;
        }


    }
