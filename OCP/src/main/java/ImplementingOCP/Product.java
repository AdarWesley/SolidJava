package ImplementingOCP;

public abstract class Product   
{
    protected final double _price;
    
    public Product(double price)
    {
    	_price = price;
    }
	
    public abstract void render() throws Exception;
}


