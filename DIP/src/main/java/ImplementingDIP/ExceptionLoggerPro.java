package ImplementingDIP;

import ImplementingDIP.IExceptionLogger;

/**
* Note that this is not actually being used!
*/
public class ExceptionLoggerPro   implements IExceptionLogger
{
    public void log(Exception ex) throws Exception {
    	//Log the exception somewhere useful
    	//Also email & Text the exception detail to configured users
    }
}


