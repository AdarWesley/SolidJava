package BreakingSingleResponsibility;

import java.io.FileWriter;
import java.io.Writer;

public class Order   
{
    public void placeOrder() throws Exception {
        try
        {
            // Code to add order to database would be here...
        }
        catch (Exception ex)
        {
            try (Writer wr = new FileWriter("C:\\Error.txt")){
            	wr.write(ex.toString());
            }
        }
    }
}


