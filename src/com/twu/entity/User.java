package com.twu.entity;

public class User {
    private int id;
    private String name;
    private String password;
    private int vote; //票数10

    public User(int id, String name, String password,int vote){
        this.id = id;
        this.name = name;
        this.password = password;
        this.vote = vote;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", vote='" + vote + '\'' +
                '}';
    }
}

