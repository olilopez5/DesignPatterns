package structuralpatterns.decorator.race;

import structuralpatterns.decorator.Enemy;

public class Human implements Enemy {
    @Override
    public void attack() {
        System.out.println("Human attack!!");

    }
}
