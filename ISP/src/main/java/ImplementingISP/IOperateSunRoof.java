package ImplementingISP;

public interface IOperateSunRoof   
{
    void openSunRoof(int percentOpen) throws Exception ;
    void closeSunRoof() throws Exception ;
}


// Breaking a large interface down into smaller, more specific interfaces, based on responsibility means that each
// interface is only concerned with one responsibility (SRP – only has one reason to change).
// This gives using greater flexibility, as we can apply multiple interfaces to as class, if required, rather
// than force as class to implement behaviour it does not need, in order to achieve Polymorphic behaviour.