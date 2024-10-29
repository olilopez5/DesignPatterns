package structuralpatterns.bridge.enemy;

import structuralpatterns.bridge.fighter.Fighter;
import structuralpatterns.bridge.fighter.MageFighterImpl;

public class Mage extends Enemy  {
    public Mage() {
        setFighter(new MageFighterImpl());
    }

    @Override
    public Fighter getFighter() {
        return super.getFighter();
    }

    @Override
    public Enemy setFighter(Fighter fighter) {
        return super.setFighter(fighter);
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public Enemy setHealth(int health) {
        return super.setHealth(health);
    }


    public void attack() {
        System.out.println("mage: ");
        getFighter().attack();
    }


    public void protect() {
        System.out.println("mage: ");
        getFighter().protect();
    }
}
