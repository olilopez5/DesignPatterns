package structuralpatterns.decorator.race;

import structuralpatterns.decorator.Enemy;

public class Orc implements Enemy {
    @Override
    public void attack() {
      System.out.println("Orc attack!!");
    }
}
