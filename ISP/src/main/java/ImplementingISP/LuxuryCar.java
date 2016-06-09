package ImplementingISP;

import ImplementingISP.IAudioControl;
import ImplementingISP.IOperateSunRoof;
import ImplementingISP.IVehicle;

// Because a single class can implement multiple interfaces, we are now able to pick and choose
// which functionality we wish to implement in each concrete implementation and we don’t
// need to implement functionality we don’t need in order to conform to a contract.
// However, we do have one last issue we need to resolve.
//
// Our Car class, if we actually write all the code that is required, is going to be quite large
// (Code Smell!) and has more than one reason to change (Breaking SRP) as it is dealing with
// movement, sun rood controls and audio controls.
//
// See Implementing the Dependency Inversion Principle.
public class LuxuryCar implements IAudioControl, IOperateSunRoof, IVehicle
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

    //Open sunroof to requested amount
    public void openSunRoof(int percentOpen) throws Exception {
    }

    //Close sunroof to requested amount
    public void closeSunRoof() throws Exception {
    }
}
