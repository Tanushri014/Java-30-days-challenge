package innerclasses;

public class Test {
    public static void main(String[] args) {
        Car c = new Car("TATA");

        Car.Engine engine = c.new Engine();

        engine.start();
        engine.stop();


        Computer cn=new Computer("hp", "12", "mac");
   cn.getOs().displayInfo();
    }
}
