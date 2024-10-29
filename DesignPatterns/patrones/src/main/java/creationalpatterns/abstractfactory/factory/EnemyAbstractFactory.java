package creationalpatterns.abstractfactory.factory;

import creationalpatterns.abstractfactory.armor.Armor;
import creationalpatterns.abstractfactory.weapon.Weapon;
import creationalpatterns.factorymethod.Enemy;

public abstract class EnemyAbstractFactory {
    public abstract Enemy createEnemy();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}
