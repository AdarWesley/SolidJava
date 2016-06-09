package ImplementingDIP;

import ImplementingISP.IAudioControl;
import ImplementingISP.IOperateSunRoof;
import ImplementingISP.IVehicle;

//    Now that Dependency Inversion Principle is adhered to our LuxuryCar class:
//
//    Responsibility for the various different behaviours is abstracted out to classes that deal
//    entirely with that behaviour, and nothing else (SRP). These could even be reused by different concrete
//    classes. For example LuxuryCar and BudgetCar could use the same implementation of IAudioControls.
//
//    LuxuryCar is loosely coupled to the Abstractions of IVehicle, IAudioControls and IOperateSunRoof
//    instead of being tied into specific classes such as BangAndOlusenSoundSystem, for example,
//    because we are injecting the dependencies rather than creating instances inside our class definition.
public class LuxuryCar implements IVehicle, IAudioControl, IOperateSunRoof
{
    private final IVehicle _vehicleControls;
    private IAudioControl _audioControls;
    private final IOperateSunRoof _sunRoofControls;
    public LuxuryCar(IVehicle vehicleControls, IAudioControl audioControls, IOperateSunRoof sunRoofControls) throws Exception {
        _vehicleControls = vehicleControls;
        _audioControls = audioControls;
        _sunRoofControls = sunRoofControls;
    }

    public void accelerate() throws Exception {
        _vehicleControls.accelerate();
    }

    public void breakCar() throws Exception {
        _vehicleControls.breakCar();
    }

    public void changeGear(int newGear) throws Exception {
        _vehicleControls.changeGear(newGear);
    }

    public void turnOnRadio() throws Exception {
        _audioControls.turnOffRadio();
    }

    public void turnOffRadio() throws Exception {
        _audioControls.turnOffRadio();
    }

    public void openSunRoof(int percentOpen) throws Exception {
        _sunRoofControls.openSunRoof(percentOpen);
    }

    public void closeSunRoof() throws Exception {
        _sunRoofControls.closeSunRoof();
    }
}


