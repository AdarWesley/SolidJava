package ImplementingDIP;

import ImplementingDIP.Customer;
import ImplementingDIP.ExceptionLogger;
import ImplementingDIP.ExceptionLoggerPro;

public class TestCustomer   
{
    public void shouldBeAbleToCreateCustomerWithIExceptionLogger() throws Exception {
        Customer customer = new Customer(new ExceptionLogger());
        assert customer != null;
    }

    public void shouldBeAbleToCreateCustomerWithIExceptionLoggerPro() throws Exception {
        Customer customer = new Customer(new ExceptionLoggerPro());
        assert customer != null;
    }
}


