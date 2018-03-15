package com.mycompany.test1.models;
public class Brand {

    private String name;
    private String category;
    public Brand(){}
    public Brand(String name,String category) {
        this.name=name;
        this.category = category;
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }


}
