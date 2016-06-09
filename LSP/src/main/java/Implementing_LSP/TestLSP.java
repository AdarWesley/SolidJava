package Implementing_LSP;

import java.util.ArrayList;

import Implementing_LSP.Circle;
import Implementing_LSP.IShape;
import Implementing_LSP.Rectangle;
import Implementing_LSP.Square;
import Implementing_LSP.Triangle;

public class TestLSP   
{
    public void shouldCalculateTotalAreaOfAllShapes() throws Exception {
        ArrayList<IShape> shapes = new ArrayList<IShape>();
        shapes.add(new Rectangle(4,5));
        shapes.add(new Triangle(3,3));
        shapes.add(new Square(4));
        shapes.add(new Circle(6));
        //          Notice that is we add more and more types of shape the code to
        //          calculate total area doesn’t need to change (so it's also Open to Extension & Closed to Modification!)
        double totalArea = 0;
        for (IShape shape : shapes)
        {
            totalArea = totalArea + shape.area();
        }
        assert Math.floor(totalArea * 100) / 100 == 153.10d;
    }

}


