package com.mycompany.test1.controller;

import com.mycompany.test1.models.Brand;

import java.util.ArrayList;
import java.util.List;

public class BrandController {

    List<String> brands= new ArrayList<>();
    boolean search(String name, List<String> brands) {

        for (String brand : brands) {
            if (brand.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    boolean addBrand(String name,BrandController br) {

        if (search(name, br.brands)) {
            return false;
        } else {
            br.brands.add(name);

            return true;
        }
    }
}
