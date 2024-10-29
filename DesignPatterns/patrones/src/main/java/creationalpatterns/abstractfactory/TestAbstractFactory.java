package creationalpatterns.abstractfactory;

import creationalpatterns.abstractfactory.armor.Armor;
import creationalpatterns.abstractfactory.factory.EnemyAbstractFactory;
import creationalpatterns.abstractfactory.factory.MageFactory;
import creationalpatterns.abstractfactory.factory.WarriorFactory;
import creationalpatterns.abstractfactory.weapon.Weapon;
import creationalpatterns.factorymethod.Enemy;

public class TestAbstractFactory {
    public static void main(String[] args) {
        EnemyAbstractFactory factory = new WarriorFactory();
        Enemy warrior = factory.createEnemy();
        Armor heavyArmor = factory.createArmor();
        Weapon axe = factory.createWeapon();
        warrior.attack();
        heavyArmor.protect();
        axe.damage();

        factory = new MageFactory();
        Enemy mage = factory.createEnemy();
        Armor robe = factory.createArmor();
        Weapon staff = factory.createWeapon();
        mage.attack();
        robe.protect();
        staff.damage();


    }
}
