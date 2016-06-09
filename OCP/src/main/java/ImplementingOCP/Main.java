package ImplementingOCP;

import java.util.ArrayList;

import ImplementingOCP.Product;

//Do something a big more jazzy
public class Main   
{
    public void renderAllProducts(ArrayList<Product> listOfAllProducts) throws Exception {
        for (Product product : listOfAllProducts)
        {
            //          This code is where it all comes together: Polymorphism at work – here we see
            //          that the program is able to adapt it’s behaviour depending on the objects it is given,
            //          without the need to know or care what type of objects they are.
            //          The program simply treats them all the same, and lets the individuals deal with the orders it gives.
            //
            //          We are now able to Render all our products;
            //          - regardless of what type of product they are
            //          - without the need to change any code for future derivatives
            //          - This method doesn’t even need to change if we delete a derivative
            product.render();
        }
    }

}


// We have created an abstract class (Product) to encapsulate the behaviour that varies,
// and two separate derivatives of this type: StandardProduct & FeaturedProduct. Each derivative
// is responsible for extending the behaviour of the Render method, which means that there is no
// need to change any existing code in order to add new types of product in the future.
//
// NB: This can also be achieved using an interface instead of an abstract class
//
// It also removes duplication of If blocks (or switch statements), by removing the need to
// test for ProductType at all.
// Each derivative can be unit tested in isolation, with only a few tests (rather than one for each If!).