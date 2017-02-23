package com.example.k46f.metalgearsolid.core;

import android.util.Log;

/**
 * Created by k46f on 8/02/2017.
 */

public class Soldier {

    // -- CONSTANTS

    private final String LOG_TAG = "Soldier >>>";
    private static final Integer COMMON_SOLDIER_HEALTH = 50;

    // -- FIELDS

    private String name;

    protected Integer health;

    private Item[] items;

    protected Gun weapon;

    // -- CONSTRUCTORS

    public Soldier(String name) {
        this.name = name;
        this.health = Soldier.COMMON_SOLDIER_HEALTH;
    }

    // -- METHODS

    public String getName() {
        return name;
    }

    public void walk(Integer speed) {
        Log.i(LOG_TAG, " Walking at " + speed + " cm/s.");
    }

    public void run() {
        walk(200);
    }

    public void receiveDamage(Integer damage) {
        Log.i(LOG_TAG, "Receive " + damage + "of damage.");
    }

    protected Double getDamage() {
        return weapon.getDamage().doubleValue();
    }

    public void hurtZombie(Zombie zombie) {
        Double damage = getDamage();
        zombie.receiveDamage(damage);
        Log.i(LOG_TAG, "Hurting zombie " + zombie.getName() + "Whit " + damage + "of damage.");
    }

    public void equipWeapon(Gun weapon) {
        this.weapon = weapon;
        Log.i(LOG_TAG, "Equipped with " + weapon.getName() + ".");
    }

}
