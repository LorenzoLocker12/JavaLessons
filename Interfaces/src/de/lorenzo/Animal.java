package de.lorenzo;

import java.util.concurrent.TransferQueue;

enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {

        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }
}


record DraonFly(String name, String type) implements FlightEnabled{

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}


class Satellite implements OrbitEarth{

    public void achieveOrbit(){
        System.out.println("OrbitAchieved");
    }

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();
}


interface FlightEnabled {

    double MILES_TO_KM = 1.60934;

    double KM_TO_MILES = 0.621371;

    void takeoff();
    void land();
    void fly();
}

interface Trackable {
    void track();
}

public abstract class Animal {

    public abstract void move();
}
