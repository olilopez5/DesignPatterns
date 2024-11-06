package behaviorpatterns.state;

public class Completed implements MissionState{
    @Override
    public void next(Mission mission) {
        System.out.println(mission.getName() + " is completed.");

    }

    @Override
    public String print() {
        return " congratulations, this mission is completed!!";
    }
}
