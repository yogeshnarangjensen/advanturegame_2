package se.yogesh.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntityTest {
    //Entity entity=new Entity("Resident",10,3);
    Resident resident = new Resident("resident",10,5);
    @Test
    void addDamageShouldIncreaseDamage() {
        assertEquals(5, resident.getDamage());
        resident.addDamage(2);
        assertEquals(7, resident.getDamage());
    }

    @Test
    void takeHitShouldDecreaseHealth() {
        resident.takeHit(2);
        assertEquals(8, resident.getHealth());
    }
}