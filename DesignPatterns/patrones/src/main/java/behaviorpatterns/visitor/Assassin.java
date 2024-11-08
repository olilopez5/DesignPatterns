package behaviorpatterns.visitor;

public class Assassin implements Visitable {
    private String name;

    public Assassin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Assassin setName(String name) {
        this.name = name;
        return this;
    }

    public  void stealthAttack(){
        System.out.println(getName() + " stealth attack!!");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
