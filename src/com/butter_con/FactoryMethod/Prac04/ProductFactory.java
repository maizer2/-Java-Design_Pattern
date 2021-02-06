package com.butter_con.FactoryMethod.Prac04;

import com.butter_con.FactoryMethod.Prac04.Prod.*;

public class ProductFactory extends Factory {

    private static ProductFactory productFactory = null;

    private ProductFactory() {}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static ProductFactory getInstance() {
        if (productFactory == null) {
            productFactory = new ProductFactory();
        }
        return productFactory;
    }

    @Override
    public Product createProduct(String model) {
        if(model == "LG") {
            return new LgProduct();
        } else if(model == "SAMSUNG") {
            return new SamsungProduct();
        }

        return null;
    }
}
