package behaviorpatterns.strategy;

public class Player {
    private String name;
    private int health;

    public Player(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public Player setName(String name) {
        this.name = name;
        return this;
    }

    public int getHealth() {
        return health;
    }

    public Player setHealth(int health) {
        this.health = health;
        return this;
    }
}
