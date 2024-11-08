package structuralpatterns.proxy;

public class TestProxy {
    public static void main(String[] args) {
        GameImpl gameImpl = new GameImpl();
        gameImpl.newGame("player1");
        ProxyGameImpl proxyGame = new ProxyGameImpl(gameImpl);
        proxyGame.load("player1");
        System.out.println(proxyGame.getStats());
        proxyGame.getStats().setKills(50);
        proxyGame.getStats().setDeaths(2);
        proxyGame.getStats().setLevel(5);
        proxyGame.save("player1");
        proxyGame.load("player1");
        System.out.println(proxyGame.getStats());
    }
}
