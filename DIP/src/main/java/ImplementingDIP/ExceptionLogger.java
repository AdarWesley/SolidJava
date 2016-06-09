package ImplementingDIP;

import ImplementingDIP.IExceptionLogger;

public class ExceptionLogger   implements IExceptionLogger
{
    public void log(Exception ex) throws Exception {
    	//Log the exception somewhere useful
    }

}


