package com.example.k46f.metalgearsolid.core;

import android.util.Log;

/**
 * Created by k46f on 9/02/2017.
 */

public class Zombie {

    final String LOG_TAG = "Zombie >>>>>> ";

    private String name;

    private Integer health;

    public String getName(){
        return name;
    }


    public Zombie(String name, Integer health){
        this.name = name;
        this.health = health;
    }

    public void receiveDamage(Integer damage){
        Log.i(LOG_TAG, "Receive " + damage + "of damage.");
    }

    public void walk (Integer speed){
        Log.i(LOG_TAG, "Walking at" + speed + "Cm/s.");
    }
}
