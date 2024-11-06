package behaviorpatterns.strategy;

public class ZombieAttack implements AttackStrategy{
    @Override
    public void attack(Player player) {
        System.out.println(player.getName() + " health before zombie attack " + player.getHealth());
        System.out.println(" zombie attacking ");
        player.setHealth(player.getHealth() - 40 );
        System.out.println(player.getName() + " health after zombie attack " + player.getHealth());
    }
}
