package behaviorpatterns.memento;

public class Game {
    private String name;
    private int level;
    private  int kills;
    private static MementoManager manager = new MementoManager();

    //podría utilizar patron builder
    public Game() {
    }

    public Game(String name) {
        this.name = name;
    }

    public Game(String name, int level, int kills) {
        this.name = name;
        this.level = level;
        this.kills = kills;
    }

    public void save(){
        manager.save(new Memento(this));

    }

    public void back(){
        Memento memento = manager.undo();
        setLevel(memento.getLevel());
        setKills(memento.getKills());

    }

    public void forward(){
        Memento memento = manager.redo();
        setLevel(memento.getLevel());
        setKills(memento.getKills());
    }

    public String getName() {
        return name;
    }

    public Game setName(String name) {
        this.name = name;
        return this;
    }

    public int getLevel() {
        return level;
    }

    public Game setLevel(int level) {
        this.level = level;
        return this;
    }

    public int getKills() {
        return kills;
    }

    public Game setKills(int kills) {
        this.kills = kills;
        return this;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                "level=" + level +
                "kills=" + kills;
    }
}
