package BreakingLiskovSubtitutionPrinciple;

public class Rectangle   
{
    private double __Width;
    public double getWidth() {
        return __Width;
    }

    public void setWidth(double value) {
        __Width = value;
    }

    private double __Height;
    public double getHeight() {
        return __Height;
    }

    public void setHeight(double value) {
        __Height = value;
    }

    public double area() throws Exception {
        return getHeight() * getWidth();
    }

}
