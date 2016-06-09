package BreakingInterfaceSegregationPrinciple;

import BreakingInterfaceSegregationPrinciple.IVehicle;

public class LuxuryCar   implements IVehicle
{
    // do something to make car go faster
    public void accelerate() throws Exception {
    }

    //do something to make car slow down
    public void brakeCar() throws Exception {
    }

    // change to selected gear
    public void changeGear(int gear) throws Exception {
    }

    @SuppressWarnings("unused")
	private boolean _radioOn;
    public void turnOnRadio() throws Exception {
        _radioOn = true;
    }

    public void turnOffRadio() throws Exception {
        _radioOn = false;
    }

    //Open sunroof to requested amount
    public void openSunRoof(int percentOpen) throws Exception {
    }

    //Close sunroof to requested amount
    public void closeSunRoof() throws Exception {
    }

}


