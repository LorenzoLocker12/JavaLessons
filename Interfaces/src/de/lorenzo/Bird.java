package de.lorenzo;

public class Bird extends Animal implements FlightEnabled, Trackable{

    @Override
    public void move() {
        System.out.println("flying");
    }

    @Override
    public void takeoff() {
        System.out.println(getClass().getSimpleName() + " taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }
}
