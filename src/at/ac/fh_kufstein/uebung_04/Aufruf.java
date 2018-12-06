package at.ac.fh_kufstein.uebung_04;

import at.ac.fh_kufstein.uebung_04.at.ac.fh_kufstein.uebung04.Classes.Car;

public class Aufruf {
    public static void main(String[] args) {
        Car a = new Car ("rot", 4, 200);
        System.out.print("Die Geschwindigkeit beträgt: ");a.currentSpeed();

    }

}
