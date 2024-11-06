package behaviorpatterns.visitor;

public class Warrior implements Visitable{

    private String name;

    public Warrior(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Warrior setName(String name) {
        this.name = name;
        return this;
    }

    public  void powerAttack(){
        System.out.println(getName() + " power attack!!");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
