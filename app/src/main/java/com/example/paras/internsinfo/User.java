package com.example.paras.internsinfo;

/**
 * Created by Paras on 1/1/2018.
 */

//this is very simple class and it only contains the user attributes, a constructor and the getters
// you can easily do this by right click -> generate -> constructor and getters
public class User {

    private String username, email, gender;
    int id;

    public User( String username, String email, String gender, int id) {
        this.username = username;
        this.email = email;
        this.gender = gender;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }
}
