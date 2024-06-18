package org.example.soldier;

public class Soldier {

    public int strength;
    public int health;

    public Soldier (int health, int strength) {

        this.health = health;
        this.strength = strength;
    }
      
    public int attack() {
        return this.strength;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void receiveDamage(int damage) {
        this.health = health - damage;
    }
}
