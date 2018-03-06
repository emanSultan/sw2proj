package com.mycompany.test1.controller;;

import com.mycompany.test1.models.Store;
import com.mycompany.test1.models.StoreOwner;

import java.util.ArrayList;
import java.util.List;

public class StoreController {

    StoreOwner owner;
    private List<Store> mStores=new ArrayList<>();
    int ID=0;

  
    public void setOwner(StoreOwner owner) {
        this.owner=owner;
    }

    boolean search(String name,StoreController sc){

        for(Store s: sc.mStores){
            if(s.getName().equalsIgnoreCase(name))
                return true;
        }
        return false;
    }
  
    boolean addStore(String name,StoreController stc){
        Store store;
        if(search(name,stc)){
            return false;
        }
        else{
            store = new Store();
            store.setName(name);
            stc.mStores.add(store);
            ID++;
            return true;
        }
    }

   
    

    List<Store> getAll(){ return mStores; }

}
