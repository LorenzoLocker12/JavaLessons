package de.lorenzo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        FlightEnabled flier = new Bird();
        Trackable tracked = new Bird();
        Animal animal = new Bird();

//        animal.move();
//        flier.move();
//        flier.takeoff();
//        flier.fly();
//        tracked.track();
//        flier.land();

        inFlight(flier);

        inFlight(new Jet());

        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.println(milesTraveled);

        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new ArrayList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);



    }

    private static void inFlight(FlightEnabled flier){
        flier.takeoff();
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
        System.out.println("---".repeat(20));
    }

    private static void triggerFliers(List<FlightEnabled> fliers){

        for(var flier: fliers){
            flier.takeoff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers){

        for(var flier: fliers){
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers){

        for(var flier: fliers){
            flier.land();
        }
    }

}