package ImplementingSRP;

import java.io.FileWriter;
import java.io.Writer;

public class ExceptionLogger   
{
    public void log(Exception ex) throws Exception {
        try (Writer wr = new FileWriter("C:\\Error.txt")){
        	wr.write(ex.toString());
        }
    }

}


