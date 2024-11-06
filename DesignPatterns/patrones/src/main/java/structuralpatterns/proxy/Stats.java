package structuralpatterns.proxy;

import java.io.Serializable;
import java.util.Date;

public class Stats implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int level;
    private int kills;
    private int deaths;
    private Date createdAt;
    private Date lastSave;

    public Stats(String name, int level, int kills, int deaths) {
        this.name = name;
        this.level = level;
        this.kills = kills;
        this.deaths = deaths;
    }

    public String getName() {
        return name;
    }

    public Stats setName(String name) {
        this.name = name;
        return this;
    }

    public Date getLastSave() {
        return lastSave;
    }

    public Stats setLastSave(Date lastSave) {
        this.lastSave = lastSave;
        return this;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Stats setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public int getDeaths() {
        return deaths;
    }

    public Stats setDeaths(int deaths) {
        this.deaths = deaths;
        return this;
    }

    public int getLevel() {
        return level;
    }

    public Stats setLevel(int level) {
        this.level = level;
        return this;
    }

    public int getKills() {
        return kills;
    }

    public Stats setKills(int kills) {
        this.kills = kills;
        return this;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", kills=" + kills +
                ", deaths=" + deaths +
                ", createdAt=" + createdAt +
                ", lastSave=" + lastSave +
                '}';
    }
}
