package behaviorpatterns.visitor;

public class TestVisitor {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Last warrior");
        Mage mage = new Mage("Last mage");
        Assassin assassin = new Assassin("Last assassin");
        EnemyVisitor visitor = new EnemyVisitor();
        visitor.visit(warrior);
        System.out.println("=======================");
        visitor.visit(mage);
        System.out.println("=======================");
        visitor.visit(assassin);

    }
}
