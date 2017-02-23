package com.example.k46f.metalgearsolid.core;

import android.util.Log;

/**
 * Created by k46f on 8/02/2017.
 */

public class Captain extends Soldier {

    final String LOG_TAG = ">>>>>> Captain ";

    public void order(SuperSoldier superSoldier, Soldier soldier) {
        superSoldier.killSoldier(soldier);
    }

    @Override
    public void run() {
        walk(250);
    }

    public Captain(String name){
        super(name, 100);
    }
    public void hurtZombie(Zombie zombie, Integer damage) {
        Log.i(LOG_TAG, "Hurting zombie " + zombie.getName() + "with " + damage * 1.2 + "of damage.");
    }
}
