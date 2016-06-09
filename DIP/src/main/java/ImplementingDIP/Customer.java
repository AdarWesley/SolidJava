package ImplementingDIP;

import ImplementingDIP.IExceptionLogger;

public class Customer   
{
    private IExceptionLogger _exceptionLogger;
    public Customer(IExceptionLogger exceptionLogger) throws Exception {
        _exceptionLogger = exceptionLogger;
    }

    public void add() throws Exception {
        try
        {
            // Business logic code goes here
        }
        catch (Exception ex)
        {
            _exceptionLogger.log(ex);
        }
    }
}

//Here we have changed the Customer class to depend on an interface 'IExceptionLogger' instead of
//the concrete class ExceptionLogger.
//The rest of the Customer class is unchanged, but this subtle difference means that we now delegate
//which implementation of IExceptionLogger the Customer will use at run time to the client
//(in addition to the creation and configuration of that implementation).
//
//As the consumer of the Customer class, we can now use whichever implementation of IExceptionLogger we choose.
//
//The Customer class is no longer tightly coupled to the implementation of ExceptionLogger, but loosely
//coupled to IExceptionLogger.
