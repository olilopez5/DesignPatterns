package structuralpatterns.decorator.decorator;

import structuralpatterns.decorator.Enemy;

public class AssassinEnemyDecorator extends EnemyDecorator{
    public AssassinEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Assassin attack!!");
    }
}
