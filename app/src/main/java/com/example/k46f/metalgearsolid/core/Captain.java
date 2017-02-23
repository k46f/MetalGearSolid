package com.example.k46f.metalgearsolid.core;

import android.util.Log;

/**
 * Created by k46f on 8/02/2017.
 */

public class Captain extends Soldier {

    final String LOG_TAG = ">>>>>> Captain ";

    private static final Integer CAPTAIN_SOLDIER_HEALTH = 100;
    private static final Double CAPTAIN_SOLDIER_MULTIPLIER = 1.2;

    public void order(SuperSoldier superSoldier, Soldier soldier) {
        superSoldier.killSoldier(soldier);
    }

    @Override
    public void run() {
        walk(250);
    }

    public Captain(String name){
        super(name);
        health = CAPTAIN_SOLDIER_HEALTH;
    }

    @Override
    protected Double getDamage() {
        return weapon.getDamage() * CAPTAIN_SOLDIER_MULTIPLIER;
    }

}
