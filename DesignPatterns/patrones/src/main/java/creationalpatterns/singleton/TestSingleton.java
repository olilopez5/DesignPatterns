package creationalpatterns.singleton;

public class TestSingleton {
    public static void main(String[] args) {

        Thread threadOlivia = new Thread(new RunOlivia());
        Thread threadLucia = new Thread(new RunLucia());

        threadOlivia.start();
        threadLucia.start();


    }

    static class RunOlivia implements Runnable{

        @Override
        public void run() {
            Player player = Player.getPlayer("olivia");
            System.out.println("Running olivia: " + player);
        }
    }
    static class RunLucia implements Runnable{

        @Override
        public void run() {
            Player player = Player.getPlayer("lucia");
            System.out.println("Running lucia: " + player);
        }
    }
}
