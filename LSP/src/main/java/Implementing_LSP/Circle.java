package Implementing_LSP;

import Implementing_LSP.IShape;

public class Circle   implements IShape
{
    private int __Radius;
    public int getRadius() {
        return __Radius;
    }

    public void setRadius(int value) {
        __Radius = value;
    }

    public Circle(int radius){
        setRadius(radius);
    }

    public double area(){
        return (double)Math.PI * getRadius() * getRadius();
    }

}


//    Rather than putting IF statements or switches all over your codebase, a better solution is to define a
//    contract for interacting with our shapes (IShape) which defines a blue-print for all shapes to adhere to.
//
//    Now we can interact with all shapes in the same way (Polymorphically), by working with the
//    Interface instead of the specific implementations of a shape.