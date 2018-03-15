package com.mycompany.test1.controller;

import com.mycompany.test1.models.Brand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import java.util.ArrayList;
import java.util.List;
@Controller
public class BrandController {
    List<Brand> brandsOfSystem= new ArrayList<>();
    List<String> brandsOfStore= new ArrayList<>();

    boolean search(Brand brand, List<Brand> brands) {

        for (Brand b : brands) {
            if ((b.getName().equalsIgnoreCase(brand.getName()))&&(b.getCategory().equalsIgnoreCase(brand.getCategory()))) {
                return true;
            }
        }
        return false;
    }

    boolean addBrandToSystem(Brand brand, BrandController br) {
        boolean output=false;
        boolean result=br.search(brand,br.brandsOfSystem);

        if (result==true) {
            output= false;
        } else {
            br.brandsOfSystem.add(brand);
            output= true;
        }
        return output;
    }
    boolean checkBrand(String name,BrandController bC){
        for (Brand brand : bC.brandsOfSystem) {
            if (brand.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return  false;
    }

    boolean searchInBrandStore(String name,BrandController bC) {
        if (checkBrand(name,bC)) {
            for (Brand brand : bC.brandsOfSystem) {
                if (brand.getName().equalsIgnoreCase(name)) {
                    return true;
                }
            }
            return false;
        }
        return  false;
    }
    boolean addBrandToStore(String name,BrandController br) {
        if (searchInBrandStore(name,br)) {
            return false;
        } else {
            br.brandsOfStore.add(name);

            return true;
        }
    }

}
