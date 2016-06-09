package ImplementingOCP;

import ImplementingOCP.Product;

//do something
public class FeaturedProduct  extends Product 
{
    public FeaturedProduct(double price) {
		super(price);
	}

    @Override
	public void render() throws Exception {
        System.out.print("******* WOO HOOO *******");
        System.out.print("******* FEATURED PRODUCT HERE **********");
        System.out.printf("******* I COST %1$ **********", _price);
    }

}


