package structuralpatterns.decorator.decorator;

import structuralpatterns.decorator.Enemy;

public class WarriorEnemyDecorator extends EnemyDecorator {

    public WarriorEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Warrior attack!!");
    }
}
