package BreakingInterfaceSegregationPrinciple;

import BreakingInterfaceSegregationPrinciple.IVehicle;

//Make sunroof 100% shut (0% open)
public class MotorCycle   implements IVehicle
{
    public void accelerate() throws Exception {
    }

    // do something to make Bike go faster
    public void brakeCar() throws Exception {
    }

    // do something to make Bike slow down
    public void changeGear(int gear) throws Exception {
    }

    //change to selected gear...remember that bikes have a sequential gear box!
    public void turnOnRadio() throws Exception {
        throw new java.lang.UnsupportedOperationException("I don't have a radio - I'm a motorcycle!");
    }

    public void turnOffRadio() throws Exception {
        throw new java.lang.UnsupportedOperationException("I don't have a radio - I'm a motorcycle!");
    }

    public void openSunRoof(int percentOpen) throws Exception {
        throw new java.lang.UnsupportedOperationException("I don't have a Sunroof - I'm a motorcycle!");
    }

    public void closeSunRoof() throws Exception {
        throw new java.lang.UnsupportedOperationException("I don't have a Sunroof - I'm a motorcycle!");
    }
}


