package creationalpatterns.abstractfactory.weapon;

public class Staff implements Weapon{
    @Override
    public void damage() {
        System.out.println("staff damage!!");
    }
}
