package TestBreakingLSP;

import BreakingLiskovSubtitutionPrinciple.Rectangle;
import BreakingLiskovSubtitutionPrinciple.Square;

public class TestShapes   
{
    public void shouldCalculateAreaOfRectangle() throws Exception {
        Rectangle rectangle = new Rectangle();
        assert rectangle.area() == 20d;
    }

    public void shouldCalculateAreaOfSquare() throws Exception {
        Rectangle rectangle = new Square();
        assert rectangle.area() == 20d;
    }

}


