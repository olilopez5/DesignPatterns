package behaviorpatterns.state;

public class Mission {
    private  String name;
    private MissionState state;

    public Mission(String name) {
        this.name = name;
        state = new Blocked();
    }

    public void next(){
        state.next(this);
    }

    public String getName() {
        return name;
    }

    public Mission setName(String name) {
        this.name = name;
        return this;
    }

    public MissionState getState() {
        return state;
    }

    public Mission setState(MissionState state) {
        this.state = state;
        return this;
    }

    @Override
    public String toString() {
        return getName() + state.print();
    }
}
