package behaviorpatterns.strategy;

public class AssassinAttack implements AttackStrategy{
    @Override
    public void attack(Player player) {
        System.out.println(player.getName() + " health before assassin attack " + player.getHealth());
        System.out.println(" assassin attacking ");
        player.setHealth(player.getHealth() - 20 );
        System.out.println(player.getName() + " health after assassin attack " + player.getHealth());
    }
}
