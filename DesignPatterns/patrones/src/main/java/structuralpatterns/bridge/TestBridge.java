package structuralpatterns.bridge;

import structuralpatterns.bridge.enemy.Mage;
import structuralpatterns.bridge.enemy.Warrior;
import structuralpatterns.bridge.fighter.MageFighterImpl;
import structuralpatterns.bridge.fighter.WarriorFighterImpl;

public class TestBridge {
    public static void main(String[] args) {
        System.out.println("=================WARRIOR===============");
        Warrior warrior = new Warrior();
        warrior.attack();
        warrior.protect();
        warrior.setFighter(new MageFighterImpl());
        warrior.attack();
        warrior.protect();
        System.out.println("=================MAGE==================");
        Mage mage = new Mage();
        mage.attack();
        mage.protect();
        mage.setFighter(new WarriorFighterImpl());
        mage.attack();
        mage.protect();
    }
}
