package Implementing_LSP;

import Implementing_LSP.IShape;
import Implementing_LSP.Rectangle;

public class Square   implements IShape
{
    private Rectangle _rectangle;
    public Square(int height) throws Exception {
        _rectangle = new Rectangle(height,height);
    }

    public double area(){
        return _rectangle.area();
    }

}


