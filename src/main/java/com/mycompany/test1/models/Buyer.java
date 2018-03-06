package com.mycompany.test1.models;

public class Buyer extends Account {

    float wallet = 0;

    public Buyer() {}

    public Buyer(float wallet) { this.wallet = wallet; }

    public float getWallet() { return wallet; }

    public void setWallet(float wallet) { this.wallet = wallet; }

}
