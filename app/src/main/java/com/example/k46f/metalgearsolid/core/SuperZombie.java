package com.example.k46f.metalgearsolid.core;

import android.util.Log;

/**
 * Created by k46f on 12/02/2017.
 */

public class SuperZombie extends Zombie {

    protected final Double ZOMBIE_MIN_HEALTH = 200.0;
    protected final Double ZOMBIE_MAX_HEALTH = 300.0;

    final String LOG_TAG = ">>>>>> Super Zombie ";

    public SuperZombie(String name){
        super(name);
    }

    public void run() {
        walk(300);
    }

}
