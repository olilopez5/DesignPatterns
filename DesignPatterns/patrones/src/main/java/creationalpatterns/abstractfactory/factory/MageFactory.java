package creationalpatterns.abstractfactory.factory;

import creationalpatterns.abstractfactory.armor.Armor;
import creationalpatterns.abstractfactory.armor.Robe;
import creationalpatterns.abstractfactory.weapon.Staff;
import creationalpatterns.abstractfactory.weapon.Weapon;
import creationalpatterns.factorymethod.Enemy;
import creationalpatterns.factorymethod.Mage;

public class MageFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Mage();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }

    @Override
    public Weapon createWeapon() {
        return new Staff();
    }
}
