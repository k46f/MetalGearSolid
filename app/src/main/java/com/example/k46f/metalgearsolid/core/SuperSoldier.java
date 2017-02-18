package com.example.k46f.metalgearsolid.core;

import android.util.Log;

import java.util.Set;

/**
 * Created by k46f on 8/02/2017.
 */

public class SuperSoldier extends Soldier {

    final String LOG_TAG = ">>>>>> SuperSoldier ";


    public void performCQC(Soldier soldier) {
        Log.i(LOG_TAG, "Performing CQC.");
    }

    @Override
    public void run() {
        walk(350);
    }

    public void killSoldier(Soldier soldier) {
        Log.i(LOG_TAG, "Killing soldier nammed " + soldier.getName() + ".");
    }

    public SuperSoldier(String name) {
        super(name,250);
    }

    public void killSuperZombie(SuperZombie superZombie) {
        Log.i(LOG_TAG, "Killing super zombie " + superZombie.getName() + ".");
    }

    public void hurtSuperZombie(SuperZombie superZombie, Integer damage) {
        Log.i(LOG_TAG, "Hurting super zombie " + superZombie.getName() + "with " + damage + "of damage.");
    }

    public void hurtZombie(Zombie zombie, Integer damage) {
        Log.i(LOG_TAG, "Hurting zombie " + zombie.getName() + "with " + damage * 2.5 + "of damage.");
    }

}

