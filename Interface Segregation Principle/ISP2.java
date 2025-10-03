interface Switchable
{
    void turnOn();
    void turnOff();
}

interface TemperatureControllable
{
    void setTemperature(int temperature);
}

interface MusicPlayable
{
    void playMusic(String song);
}

interface Recordable
{
    void recordVideo();
}

// LightBulb only cares about turning on/off
class LightBulb implements Switchable
{
    @Override
    public void turnOn()
    {
        System.out.println("LightBulb is ON");
    }

    @Override
    public void turnOff()
    {
        System.out.println("LightBulb is OFF");
    }
}

// Thermostat cares about temperature + switching
class Thermostat implements Switchable, TemperatureControllable
{
    private int temperature;

    @Override
    public void turnOn()
    {
        System.out.println("Thermostat is ON");
    }

    @Override
    public void turnOff()
    {
        System.out.println("Thermostat is OFF");
    }

    @Override
    public void setTemperature(int temperature)
    {
        this.temperature = temperature;
        System.out.println("Thermostat set to " + temperature + "degree Celsius");
    }
}

//Smart speaker cares about music + switching
class SmartSpeaker implements Switchable, MusicPlayable
{
    @Override
    public void turnOn()
    {
        System.out.println("SmartSpeaker is ON");
    }

    @Override
    public void turnOff()
    {
        System.out.println("SmartSpeaker is OFF");
    }

    @Override
    public void playMusic(String song)
    {
        System.out.println("Playing song: " + song);
    }
}

// Security Camera cares about recording + switching
class SecurityCamera implements Switchable, Recordable
{
    @Override
    public void turnOn()
    {
        System.out.println("SecurityCamera is ON");
    }

    @Override
    public void turnOff()
    {
        System.out.println("SecurityCamera is OFF");
    }

    @Override
    public void recordVideo()
    {
        System.out.println("Recording video...");
    }
}

public class ISP2
{
    public static void main(String[] args) 
    {
        Switchable bulb = new LightBulb();
        Switchable thermostat = new Thermostat();
        Switchable speaker = new SmartSpeaker();
        Switchable camera = new SecurityCamera();
        
        bulb.turnOn();
        bulb.turnOff();

        ((Thermostat) thermostat).turnOn();
        ((Thermostat) thermostat).setTemperature(24);

        ((SmartSpeaker) speaker).turnOn();
        ((SmartSpeaker) speaker).playMusic("Shape of You");

        ((SecurityCamera) camera).turnOn();
        ((SecurityCamera) camera).recordVideo();
    }
}