package creationalpatterns.abstractfactory.enemy;

public class Mage implements Enemy{
    @Override
    public void attack() {
        System.out.println("mage attack !!");
    }
}