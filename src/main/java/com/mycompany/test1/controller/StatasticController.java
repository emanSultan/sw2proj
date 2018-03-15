package com.mycompany.test1.controller;

import com.mycompany.test1.models.Store;

import java.util.Comparator;
import java.util.List;

public class StatasticController {
    String getExploreStorre(Store mystore) {

        String output = "";
        output += "The number that explore the products' store: " + mystore.getExploreNumber();

        return output;
    }

    String getNumofProductStore(Store mystore) {

        String output = "";
        output += "The number products in store: " + mystore.getStoreProduct().size();

        return output;
    }
}
