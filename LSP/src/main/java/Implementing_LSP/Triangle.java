package Implementing_LSP;

import Implementing_LSP.IShape;

public class Triangle   implements IShape
{
    public Triangle(int height, int width) throws Exception {
        setHeight(height);
        setWidth(width);
    }

    private int __Height;
    public int getHeight() {
        return __Height;
    }

    public void setHeight(int value) {
        __Height = value;
    }

    private int __Width;
    public int getWidth() {
        return __Width;
    }

    public void setWidth(int value) {
        __Width = value;
    }

    public double area(){
        return (getHeight() * getWidth()) / 2;
    }

}


