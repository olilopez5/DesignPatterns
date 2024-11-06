package behaviorpatterns.visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
