package creationalpatterns.abstractfactory.factory;

import creationalpatterns.abstractfactory.armor.Armor;
import creationalpatterns.abstractfactory.armor.HeavyArmor;
import creationalpatterns.abstractfactory.weapon.Axe;
import creationalpatterns.abstractfactory.weapon.Weapon;
import creationalpatterns.factorymethod.Enemy;
import creationalpatterns.factorymethod.Warrior;

public class WarriorFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new Axe();
    }
}
