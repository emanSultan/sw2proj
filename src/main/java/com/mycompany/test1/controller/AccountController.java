package com.mycompany.test1.controller;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.test1.models.Account;
import com.mycompany.test1.models.Buyer;
import com.mycompany.test1.models.StoreOwner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class AccountController {

    public List<Account> buyers;
    public List<Account> storeOwners;
    public List<Account> admins;

    AccountController() {
        buyers = new ArrayList<>();
        storeOwners = new ArrayList<>();
        admins = new ArrayList<>();

    }

    boolean register(String userName, String pass, String type,AccountController ac) {

        boolean register = false;

        if (type.equalsIgnoreCase("buyer")) {

            Buyer buyer = new Buyer();
            buyer.setUserName(userName);
            buyer.setPass(pass);

            if (!search(buyer, ac.buyers)) {
                ac.buyers.add(buyer);
                register = true;
            }

        } else if (type.equalsIgnoreCase("owner")) {

            StoreOwner storeOwner = new StoreOwner();
            storeOwner.setUserName(userName);
            storeOwner.setPass(pass);

            if (!search(storeOwner,ac.storeOwners)) {
                ac.storeOwners.add(storeOwner);
                register = true;
            }

        }
        return register;
    }

    public boolean search(Account account, List<Account> accounts) {

        for (Account a : accounts) {
            if (a.getUserName().equals(account.getUserName()) && a.getPass().equals(account.getPass())) {
                return true;
            }
        }
        return false;
    }

    boolean login(String userName, String pass,String type,AccountController ac) {

        Account account = new Account();
        account.setUserName( userName);
        account.setPass(pass);

        boolean login = false;

        if(type.equalsIgnoreCase("buyer")) {
            if (search(account, ac.buyers))
                login = true;
        }
        else if(type.equalsIgnoreCase("owner")) {
         if (search(account, ac.storeOwners))
                login = true;
        }
        else {
            if (search(account, ac.admins))
                login = true;
        }
        return login;
    }
     
   
}
