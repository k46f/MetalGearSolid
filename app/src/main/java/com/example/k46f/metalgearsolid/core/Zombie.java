package com.example.k46f.metalgearsolid.core;

import android.util.Log;

import java.util.Random;

/**
 * Created by k46f on 9/02/2017.
 */

public class Zombie {

    final String LOG_TAG = "Zombie >>>";

    protected final Double ZOMBIE_MIN_HEALTH = 100.0;
    protected final Double ZOMBIE_MAX_HEALTH = 200.0;

    private String name;

    private Double health;

    public String getName() {
        return name;
    }


    public Zombie(String name) {
        this.name = name;
        this.health = generateRandomHealth();
    }

    public void receiveDamage(Double damage) {
        health = health - damage;

        if (health <= 0) {
            die();
        }

        Log.i(LOG_TAG, "Receive " + damage + "of damage.");
    }

    private Double generateRandomHealth() {
        Random r = new Random();
        Integer result = r.nextInt(ZOMBIE_MAX_HEALTH.intValue() - ZOMBIE_MIN_HEALTH.intValue()) +
                ZOMBIE_MIN_HEALTH.intValue();
        return result.doubleValue();
    }

    public void walk (Integer speed){
        Log.i(LOG_TAG, "Walking at" + speed + "Cm/s.");
    }

    private void die() {
        Log.i(LOG_TAG, "Zombie formerly named " + name + " has died AGAIN.");
    }
}
