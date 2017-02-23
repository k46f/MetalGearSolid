package com.example.k46f.metalgearsolid.core;

import android.util.Log;

/**
 * Created by k46f on 12/02/2017.
 */

public class SuperZombie extends Zombie {

    final String LOG_TAG = ">>>>>> Super Zombie ";

    public SuperZombie(String name){
        super(name, (Math.random() * 300 + 200));
    }

    public void run() {
        walk(300);
    }

    public void receiveDamage(Integer damage) {
        Log.i(LOG_TAG, "receive " + damage + "of damage.");
    }
}
