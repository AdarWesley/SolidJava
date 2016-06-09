package ImplementingOCP;

import ImplementingOCP.Product;

//Default behaviour
public class StandardProduct  extends Product 
{
	public StandardProduct(double price) {
		super(price);
	}

	@Override
    public void render() throws Exception {
        System.out.printf("Hi, I am a standard product that costs: %1$", _price);
    }

}


