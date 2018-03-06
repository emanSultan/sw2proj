package com.mycompany.test1.controller;
import com.mycompany.test1.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductController {

    List<Product> mProducts= new ArrayList();
    
boolean addProduct(Product product, BrandController brandCtr,ProductController pc) {

        boolean output = true;

        boolean temp = search(product,pc.mProducts);
        boolean brand =brandCtr.search(product.getBrand(),brandCtr.brands);

        if(temp == true||brand == false)
        {
            output = false;
        }
        else{
            pc.mProducts.add(product);
            output = true;
        }

        return output;
    }

   /* public List<Product> search(String name,ProductController pc) {

        List<Product>  products = new ArrayList<>();
        for (Product product : pc.mProducts) {
            if (product.getName().equalsIgnoreCase(name)) {
                products.add(product);
                product.incrementViews();
            }
        }
        return products;
    }*/


    public boolean search(Product product, List<Product> products) {

        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(product.getName())&&p.getBrand().equalsIgnoreCase(product.getBrand())) {
                return true;
            }
        }
        return false;
    }

    
}
