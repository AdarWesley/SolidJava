package BreakingOpenClosedPrinciple;

import java.util.ArrayList;

import BreakingOpenClosedPrinciple.Product;
import BreakingOpenClosedPrinciple.ProductConsole;
import BreakingOpenClosedPrinciple.ProductType;

public class ProductConsole   
{
    public static void main(String[] args) throws Exception {
        ProductConsole.Main();
    }

    public static void Main() throws Exception {
        Product product1 = new Product(4.52d, ProductType.Standard);
        Product product2 = new Product(3.99d, ProductType.Featured);
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        for (Product product : products)
        {
            product.render();
        }
        System.out.print("FINISHED......press any key");
        System.in.read();
    }

}


