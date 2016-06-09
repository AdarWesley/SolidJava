package BreakingOpenClosedPrinciple;

import BreakingOpenClosedPrinciple.ProductType;

public class Product   
{
    private final ProductType _type;
    private final double _price;
    public Product(double price, ProductType type) throws Exception {
        _price = price;
        _type = type;
    }

    /**
    * Render has one behavior for Standard Products Types, and a different behavior for Featured Products types.
    */
    public void render() throws Exception {
        if (_type == ProductType.Standard)
        {
            System.out.printf("Hi, I am a standard product that costs: %1$", _price);
        }
         
        if (_type == ProductType.Featured)
        {
            System.out.print("******* WOO HOOO *******");
            System.out.print("******* FEATURED PRODUCT HERE **********");
            System.out.printf("******* I COST %1$ **********", _price);
        }
         
    }

    public String[] getImageFileNames() throws Exception {
        return new String[]{};
    }

}


// if we add a new ProductType, then we need to modify how this existing code works in order
// to include the new ProductType.
// What if we add lots more ProductTypes? – We need more and more If statements.
// What if this is not the only thing that varies by ProductType? - We start to duplicate this If block all over our code base.
//
// NB: Don’t fool yourself into thinking that a switch statement is any better – it’s just as bad!