public class CarRaceDemo {
    public static void main(String[] args) throws InterruptedException {

        Car Dilango = new Car("Dilango",2000);
        Car Ferrari = new Car("Ford Mustang",1000);
        Car Micro = new Car("Micro",3000);

        Dilango.start();
        Ferrari.start();
        Micro.start();
    }
}
