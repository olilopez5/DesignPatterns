package creationalpatterns.factory;

public class TestFactory {
    public static void main(String[] args) {
        EnemyFactory enemyfactory = new EnemyFactory();
        Enemy warrior = enemyfactory.createEnemy("warrior");
        Enemy mage = enemyfactory.createEnemy("mage");
        warrior.attack();
        mage.attack();

    }
}
