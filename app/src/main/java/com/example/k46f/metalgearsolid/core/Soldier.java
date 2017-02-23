package com.example.k46f.metalgearsolid.core;

import android.util.Log;

/**
 * Created by k46f on 8/02/2017.
 */

public class Soldier {

    // -- FIELDS

    final String LOG_TAG = ">>>>>> Soldier";

    private String name;

    private Integer health;

    private Item[] items;

    private Gun weapon;

    // -- CONSTRUCTORS

    public Soldier(String name, Integer health){
        this.name = name;
        this.health = health;
    }

    // -- METHODS

    public String getName() {
        return name;
    }

    public void walk(Integer speed){
        Log.i(LOG_TAG, " Walking at " + speed + " cm/s.");
    }

    public void run(){
        walk(200);
    }

    public void killZombie(Zombie zombie) {
        Log.i(LOG_TAG, "Killing zombie " + zombie.getName() + ".");
    }

    public void receiveDamage(Integer damage){
        Log.i(LOG_TAG, "Receive " + damage + "of damage.");
    }

    public void hurtZombie(Zombie zombie, Integer damage) {
        Log.i(LOG_TAG, "Hurting zombie " + zombie.getName() + "Whit " + damage + "of damage.");
    }

    public void equipWeapon(Gun weapon) {
        this.weapon = weapon;
        Log.i(LOG_TAG, "Equipped with " + weapon.getName() + ".");
    }

}
