package behaviorpatterns.strategy;

public class Enemy {

    private String name;
    private AttackStrategy attackStrategy;

    public Enemy(String name) {
        this.name = name;
        attackStrategy = new ZombieAttack();
    }

    public void attack(Player player) {
        attackStrategy.attack(player);

    }

    public String getName() {
        return name;
    }

    public Enemy setName(String name) {
        this.name = name;
        return this;
    }

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}
