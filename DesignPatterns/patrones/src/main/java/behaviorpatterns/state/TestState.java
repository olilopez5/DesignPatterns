package behaviorpatterns.state;

public class TestState {
    public static void main(String[] args) {
        Mission mission = new Mission("Mision 1: ");
        System.out.println(mission);
        mission.next();
        System.out.println(mission);
        mission.next();
        System.out.println(mission);
        mission.next();
        System.out.println(mission);



    }
}
