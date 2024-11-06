package behaviorpatterns.chainofresponsibility;

public class Player {

    private TypePlayer typePlayer;

    public Player(TypePlayer typePlayer) {
        this.typePlayer = typePlayer;
    }

    public TypePlayer getTypePlayer() {
        return typePlayer;
    }

    public Player setTypePlayer(TypePlayer typePlayer) {
        this.typePlayer = typePlayer;
        return this;
    }
}
