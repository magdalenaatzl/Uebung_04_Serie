package at.ac.fh_kufstein.uebung_04.at.ac.fh_kufstein.uebung04.Classes;

public class Car {
    String color;
    int wheels;
    double speed;

    public void currentSpeed(){
        System.out.println(speed);
    }

    public Car (String color, int wheels, int speed){
        this.color = color;
        this.wheels = wheels;
        this.speed = speed;

    }

}
