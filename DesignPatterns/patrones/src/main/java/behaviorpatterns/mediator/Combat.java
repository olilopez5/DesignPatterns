package behaviorpatterns.mediator;

public interface Combat {

    void send();
    void receive (Combat combat);
}
