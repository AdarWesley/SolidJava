package BreakingDependencyInversionPrinciple;

public class ExceptionLogger   
{
    public void log(Exception ex) throws Exception {
    }
}


//Log the important details of the exception somewhere useful.
// The Customer class nicely delegates responsibility for logging exceptions to the ExceptionLogger class
// (therefore adhering to SRP). Unfortunately this code breaks the Dependency Inversion Principle,
// because it magically creates a instance of the ExceptionLogger internally when and instance
// of Customer is created.
//
// What’s wrong with that I hear you say?
//
// The problem is that we have left the responsibility for the creation & configuration of the
// ExceptionLogger to the Customer class, instead of allowing the consumer of the class (or the client) to decide.
// This is very ridged and inflexible.
//
// It means that every single instance of a Customer that is ever created will always log exceptions with
// the same settings: let’s say to the F: drive.
// So later when someone new wants to use an instance of Customer in a system that does not
// have an F: drive, this will fail.
// We are also tightly coupled to the ExceptionLogger Class.
// What if I want to use a different class to handle exception logging?