package behaviorpatterns.templatemethod;

public class TestTemplate {
    public static void main(String[] args) {
        System.out.println("======Warrior template======");
        EnemyTemplate warrior = new Warrior();
        warrior.template();
        System.out.println("=======Mage template==========");
        EnemyTemplate mage = new Mage();
        mage.template();

    }
}
