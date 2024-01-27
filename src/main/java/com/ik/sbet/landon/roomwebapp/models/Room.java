package com.ik.sbet.landon.roomwebapp.models;

public class Room {
    private long id;
    private String name;
    private String number;
    private String info;

    public Room(){
    }

    public Room(long id, String name, String number, String info) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.info = info;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getInfo() {
        return info;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
