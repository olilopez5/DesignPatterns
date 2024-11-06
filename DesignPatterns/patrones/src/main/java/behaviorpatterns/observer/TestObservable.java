package behaviorpatterns.observer;

public class TestObservable {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Warrior 1");
        Warrior warrior2 = new Warrior("Warrior 2");
        Mage mage1 = new Mage("Mage 1");
        Mage mage2 = new Mage("Mage 2");
        Vigilant vigilant = new Vigilant("Vigilant");

        vigilant.subscribe(warrior1);
        vigilant.subscribe(warrior2);
        vigilant.subscribe(mage1);
        vigilant.subscribe(mage2);
        vigilant.activate();
        System.out.println("===============================");
        vigilant.unsubscribe(mage1);
        vigilant.activate();

    }
}
