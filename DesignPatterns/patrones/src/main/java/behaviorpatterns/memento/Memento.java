package behaviorpatterns.memento;

public class Memento {
    private int level;
    private  int kills;

    public Memento(Game game){
       level = game.getLevel();
       kills = game.getKills();
    }

    public int getLevel() {
        return level;
    }

    public Memento setLevel(int level) {
        this.level = level;
        return this;
    }

    public int getKills() {
        return kills;
    }

    public Memento setKills(int kills) {
        this.kills = kills;
        return this;
    }
}
