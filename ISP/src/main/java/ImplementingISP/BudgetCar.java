package ImplementingISP;

import ImplementingISP.IVehicle;

public class BudgetCar   implements IVehicle, IAudioControl
{
    // do something to make car go faster
    public void accelerate() throws Exception {
    }

    //do something to make car slow down
    public void breakCar() throws Exception {
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
}


