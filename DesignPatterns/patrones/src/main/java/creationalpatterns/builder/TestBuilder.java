package creationalpatterns.builder;

public class TestBuilder {

    public static void main(String[] args) {
        Enemy enemy = Enemy.builder()
                .name("adrian")
                .type("warrior")
                .health(100)
                .damage(100)
                .endurance(100)
                .build();
        System.out.println(enemy.toString());
    }
}
