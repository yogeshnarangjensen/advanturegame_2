package se.yogesh.model;

public abstract class Entity {
    protected String role;//role like Resident and burglar
    protected int health;
    protected int damage;
//con. initialize role, health and damage
    public Entity(String role, int health, int damage) {
        this.role = role;
        this.health = health;
        this.damage = damage;
    }
    //m.to inc damage
    public void addDamage(int damage){
        this.damage += damage;
    }

    public void takeHit(int damage){
        this.health -= damage;
    }
    public void punch(Entity target){
        target.takeHit(this.damage);
    }//check still alive
    public boolean isConscious(){
        return this.health > 0;
    }//getter
    public int getHealth(){
        return this.health;
    }
    public int getDamage(){
        return this.damage;
    }



}



