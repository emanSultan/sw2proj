package com.mycompany.test1.controller;;

import com.mycompany.test1.models.Store;
import com.mycompany.test1.models.StoreOwner;

import java.util.ArrayList;
import java.util.List;

public class StoreController {

    StoreOwner owner;
    public List<Store> mStores = new ArrayList<>();
    int ID = 0;


    public void setOwner(StoreOwner owner) {
        this.owner = owner;
    }

    boolean search(String name) {

        for (Store s : mStores) {
            if (s.getName().equalsIgnoreCase(name))
                return true;
        }
        return false;
    }

    boolean addStore(String name) {
        Store store;
        if (search(name)) {
            return false;
        } else {
            store = new Store();
            store.setName(name);
            mStores.add(store);
            ID++;
            return true;
        }
    }

    void increamentViews(Store mystore) {
        mystore.setExploreNumber(mystore.getExploreNumber() + 1);
    }

    void viewStroeToExplore(String name, StoreController stc) {
        if (search(name)) {
            for (int i = 0; i < stc.mStores.size(); i++) {
                if (mStores.get(i).getName().equalsIgnoreCase(name)) {
                    increamentViews(mStores.get(i));
                }
            }
        } else {
            System.out.println("Store not exist .");
        }

    }

    List<Store> getAll() {
        return mStores;
    }

    int getExploreStorre(String mystore) {
        if (search(mystore)) {
            for (int i = 0; i < mStores.size(); i++) {
                if (mStores.get(i).getName().equalsIgnoreCase(mystore)) {
                    return mStores.get(i).getExploreNumber();
                }
            }
        }
        return -1;
    }

    int getNumofProductStore(String mystore) {

        if (search(mystore)) {
            for (int i = 0; i < mStores.size(); i++) {
                if (mStores.get(i).getName().equalsIgnoreCase(mystore)) {
                    return mStores.get(i).storeProduct.size();
                }
            }
        }
        return -1;
    }
}