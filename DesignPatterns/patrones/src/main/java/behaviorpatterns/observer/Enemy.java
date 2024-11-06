package behaviorpatterns.observer;

public abstract class Enemy {

    private String name;
    private boolean active;


    public Enemy(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void activate();

    public String getName() {
        return name;
    }

    public Enemy setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isActive() {
        return active;
    }

    public Enemy setActive(boolean active) {
        this.active = active;
        return this;
    }
}
