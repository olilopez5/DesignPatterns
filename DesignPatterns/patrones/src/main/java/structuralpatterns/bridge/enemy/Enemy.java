package structuralpatterns.bridge.enemy;

import structuralpatterns.bridge.fighter.Fighter;

public abstract class Enemy {
    public Fighter getFighter() {
        return fighter;
    }

    public Enemy setFighter(Fighter fighter) {
        this.fighter = fighter;
        return this;
    }

    protected int health;
    protected Fighter fighter;

    public int getHealth() {
        return health;
    }

    public Enemy setHealth(int health) {
        this.health = health;
        return this;
    }


}
