package com.ik.sbet.landon.roomwebapp.models;

public class Staff {
    private long id;
    private String name;
    private String info;

    public Staff() {
    }

    public Staff(long id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }
}
