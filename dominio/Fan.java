package academy.devdojo.maratonajava.javacore.CompassUol.dominio;

public class Fan {
    //state
    private String make;
    private double radius;
    private String color;

    private boolean isOn;
    private byte speed;//0 to 5

    //Creation
    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    public void isOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void switchOn() {
        this.isOn = true;
        setSpeed((byte)1);
    }

    public void switchOff() {
        this.isOn = false;
    }

    public void setSpeed(byte speed){
        if(speed > 5){
            return;
        }
        this.speed = speed;
    }

    //print the state
    public String toString() {
        return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d",
                make, radius, color, isOn, speed);
    }
}
