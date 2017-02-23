package com.example.k46f.metalgearsolid.core;

/**
 * Created by k46f on 12/02/2017.
 */

public class Gun {

    private String name;

    private Integer damage;

    private Integer munition;

    public String getName() {
        return name;
    }

    public Gun(Integer damage, Integer munition, String name){
        this.damage = damage;
        this.munition = munition;
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

}
