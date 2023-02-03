package device;

public class Phone extends Device {
    public String toString(){
        return Year + " " + model + " " + producer + "\n";
    }

    public void turnOn(){
        System.out.println("Wlaczono telefon\n");
    }
}
