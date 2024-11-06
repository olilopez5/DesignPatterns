package behaviorpatterns.state;

public interface MissionState {
    void next(Mission mission);
    String print();
}
