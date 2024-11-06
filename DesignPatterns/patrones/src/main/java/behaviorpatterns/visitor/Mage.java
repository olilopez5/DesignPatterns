package behaviorpatterns.visitor;

public class Mage implements Visitable {
    private String name;

    public Mage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Mage setName(String name) {
        this.name = name;
        return this;
    }

    public  void elementaryAttack(){
        System.out.println(getName() + " elementary attack!!");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
