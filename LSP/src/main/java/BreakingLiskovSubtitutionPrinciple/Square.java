package BreakingLiskovSubtitutionPrinciple;

import BreakingLiskovSubtitutionPrinciple.Rectangle;

public class Square  extends Rectangle 
{
    public double getHeight(){
        return super.getHeight();
    }

    public void setHeight(double value) {
        super.setHeight(value);
        super.setWidth(value);
    }

    public double getWidth() {
        return super.getWidth();
    }

    public void setWidth(double value) {
        super.setHeight(value);
        super.setWidth(value);
    }

}


// Square is a sub class of Rectangle, but the Square object sets both the height
// & width to the same value when either property is changed.
// While this makes sense in the real world, it does mean that the Square does not behave in the
// same way as it’s parent class.
//
// Real World Example: Filling your car up. Petrol & Diesel are both Types of Fuel, derived from Oil.
// However, substituting one for the other has a dramatic side affect on the system in which it is used.