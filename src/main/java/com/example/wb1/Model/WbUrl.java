package com.example.wb1.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class WbUrl {
    private String name;
    private int cat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCat() {
        return cat;
    }

    public void setCat(int cat) {
        this.cat = cat;
    }

    public WbUrl(String name, int cat) {
        this.name = name;
        this.cat = cat;
    }
}
