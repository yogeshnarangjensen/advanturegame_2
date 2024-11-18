package se.yogesh.model;


import se.yogesh.game.GameVariables;

public class Resident extends Entity {
    public Resident() {
        super("Resident", 12, 3);
    }

    public Resident(String role, int health, int damage) {
        super(role, health, damage);
    }

}