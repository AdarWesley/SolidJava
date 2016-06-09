package BreakingDependencyInversionPrinciple;

import BreakingDependencyInversionPrinciple.ExceptionLogger;

public class Customer   
{
    ExceptionLogger _exceptionLogger = new ExceptionLogger();
    public void add() throws Exception {
        try
        {
            //Code to save the customer record to the database goes here.
        }
        catch (Exception ex)
        {
            _exceptionLogger.log(ex);
        }
    }
}


