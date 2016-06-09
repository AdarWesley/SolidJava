package BreakingInterfaceSegregationPrinciple;

import BreakingInterfaceSegregationPrinciple.IVehicle;

public class BudgetCar   implements IVehicle
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

    public void openSunRoof(int percentOpen) throws Exception {
        throw new java.lang.UnsupportedOperationException("I don't have a Sunroof - It was an optional extra and you didn't shell out for it!");
    }

    public void closeSunRoof() throws Exception {
        throw new java.lang.UnsupportedOperationException("I don't have a Sunroof - It was an optional extra and you didn't shell out for it!");
    }

}


