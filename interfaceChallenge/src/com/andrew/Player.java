package com.andrew;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Player implements iSaveable {
    private String name;
    private int hitpoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitpoints, int strength) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {

        return name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitpoints);
        values.add(2, "" + this.strength);
        values.add(3, this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitpoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }
}
