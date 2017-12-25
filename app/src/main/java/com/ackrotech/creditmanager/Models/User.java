package com.ackrotech.creditmanager.Models;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by akshay on 12/1/2017.
 */

@IgnoreExtraProperties
public class User {

    public String name;
    public String email;
    public String password;

    public User() {
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

}
