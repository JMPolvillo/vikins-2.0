package org.example.vikins;
import org.example.soldier.Soldier;

public class Vikings extends Soldier {

    public Vikings(int health, int strength, String name) {
        super(health, strength);
        this.name = name;
        this.msg = "";
    }

    public String name;
    public String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
        if (this.getHealth() > 0) {
            msg = name + " has received " + damage + " points of damage.";
        } else {
            msg = name + " has died in act of combat.";
        }
    }

    public String battleCry(){
        return "Odin Owns You All!";
    }
}
