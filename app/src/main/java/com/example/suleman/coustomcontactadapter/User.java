package com.example.suleman.coustomcontactadapter;

import java.util.ArrayList;

/**
 * Created by suleman on 30/09/2017.
 */

public class User {
    public ArrayList<User> userList;
    private String name;
    private String number;
    private String gender;
User(String name, String number, String gender){
    this.number=number;
    this.name=name;
    this.gender=gender;
}
    public String getName() {

        return  name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
