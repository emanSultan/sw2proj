package com.mycompany.test1.models;

import java.util.ArrayList;
import java.util.List;

public class Store {
   int storeID;
    String ownerusername;
    StoreOwner owner;
    private String name;
    public int getStoreID() {
        return storeID;
    }

    public String getOwnerusername() {
        return ownerusername;
    }

    public StoreOwner getOwner() {
        return owner;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public void setOwnerusername(String ownerusername) {
        this.ownerusername = ownerusername;
    }

    public void setOwner(StoreOwner owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
