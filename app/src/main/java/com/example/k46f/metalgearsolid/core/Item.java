package com.example.k46f.metalgearsolid.core;

/**
 * Created by k46f on 8/02/2017.
 */

public class Item {
    private String name;
    private String description;
    private Category category;
    private String id;

}

enum Category {
    Weapon, Tool, SecondaryWeapon, Ration
}