package com.mycompany.test1.models;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeID;
    String ownerusername;
    StoreOwner owner;
    private String name;
    public List<Product> storeProduct = new ArrayList<>();
    int exploreNumber = 0;
    int numOfUsersBuy; //aly ashtro al-products bta3to
    int mostOrderedPro;
    int mostOrderedBra;

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

    public void setStoreProduct(List<Product> storeProduct) {
        this.storeProduct = storeProduct;
    }

    public void setExploreNumber(int exploreNumber) {
        this.exploreNumber = exploreNumber;
    }

    public List<Product> getStoreProduct() {
        return storeProduct;
    }

    public int getExploreNumber() {
        return exploreNumber;
    }

    public void setNumOfUsersBuy(int numOfUsersBuy) {
        this.numOfUsersBuy = numOfUsersBuy;
    }

    public void setMostOrderedPro(int mostOrderedPro) {
        this.mostOrderedPro = mostOrderedPro;
    }

    public void setMostOrderedBra(int mostOrderedBra) {
        this.mostOrderedBra = mostOrderedBra;
    }

    public int getNumOfUsersBuy() {
        return numOfUsersBuy;
    }

    public int getMostOrderedPro() {
        return mostOrderedPro;
    }

    public int getMostOrderedBra() {
        return mostOrderedBra;
    }


}
