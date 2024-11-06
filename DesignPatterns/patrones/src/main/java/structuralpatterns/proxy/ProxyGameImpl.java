package structuralpatterns.proxy;

import java.util.Date;

public class ProxyGameImpl implements Game{

    private Stats stats;
    private GameImpl gameImpl;

    public ProxyGameImpl(GameImpl gameImpl) {
        this.gameImpl = gameImpl;
    }

    public GameImpl getGameImpl() {
        return gameImpl;
    }

    public ProxyGameImpl setGameImpl(GameImpl gameImpl) {
        this.gameImpl = gameImpl;
        return this;
    }

    public Stats getStats() {
        return stats;
    }

    public ProxyGameImpl setStats(Stats stats) {
        this.stats = stats;
        return this;
    }

    @Override
    public void save(String name) {
        stats.setLastSave(new Date());
        gameImpl.setStats(stats);
        gameImpl.save(name);

    }

    @Override
    public Stats load(String name) {
        Stats stats = getGameImpl().load(name);
        setStats(stats);
        return stats;

    }
}
