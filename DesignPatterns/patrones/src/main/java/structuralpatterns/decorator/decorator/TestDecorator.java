package structuralpatterns.decorator.decorator;

import structuralpatterns.decorator.Enemy;
import structuralpatterns.decorator.race.Elf;
import structuralpatterns.decorator.race.Human;

public class TestDecorator {
    public static void main(String[] args) {
        System.out.println("================HUMAN WARRIOR===============");
        Enemy humanWarrior = new WarriorEnemyDecorator(new Human());
        humanWarrior.attack();
        System.out.println("================HUMAN MAGE WARRIOR===============");
        Enemy humanMageWarrior = new WarriorEnemyDecorator(new MageEnemyDecorator(new Human()));
        humanMageWarrior.attack();
        System.out.println("================ELF MAGE WARRIOR ASSASSIN===============");
        Enemy elfMageWarriorAssassin = new AssassinEnemyDecorator(
                new WarriorEnemyDecorator(
                        new MageEnemyDecorator(
                                new Elf()
                        )
                )
        );
        elfMageWarriorAssassin.attack();
    }
}
