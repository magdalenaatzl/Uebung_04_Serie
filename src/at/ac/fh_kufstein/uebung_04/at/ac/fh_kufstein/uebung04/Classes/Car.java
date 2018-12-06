package at.ac.fh_kufstein.uebung_04.at.ac.fh_kufstein.uebung04.Classes;

public class Car {
    private String color;
    private int wheels;
    private double speed;

    public void currentSpeed(){
        System.out.println(speed);
    }

    public Car (String color, int wheels, int speed){
        this.color = color;
        this.wheels = wheels;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }
    public int getWheels() {
        return wheels;
    }
    public double getSpeed() {
        return speed;
    }
    public double accelarate (double geschwindigkeit){
        return this.speed+geschwindigkeit;
    }
    public double slowdown (double geschwindigkeit){
        return this.speed+geschwindigkeit;
    }


}
