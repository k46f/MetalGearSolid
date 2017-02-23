package com.example.k46f.metalgearsolid.core;

/**
 * Created by k46f on 12/02/2017.
 */

public class Squad {

    private final static Integer SOLDIERS_QUANTITY = 10;

    private Captain captain;

    private SuperSoldier superSoldier;

    private Soldier[] soldiers;

    public Squad() {
        captain = new Captain("Roy Mustang");
        superSoldier = new SuperSoldier("King Bradley");
        soldiers = new Soldier[SOLDIERS_QUANTITY];
    }


}
