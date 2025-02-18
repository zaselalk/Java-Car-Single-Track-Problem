import static java.lang.Thread.sleep;

public class RacingTrack {
    private static RacingTrack instance;

    private RacingTrack(){}

    public static synchronized RacingTrack getInstance() {
        if (instance == null) {
            instance = new RacingTrack();
        }
        return instance;
    }

    public synchronized void passTheSingleTrack(Car car) throws InterruptedException {
        System.out.println(car.getName()+ " Is entering to commonn passange");
        for (int i = 0; i < 3; i++) {
            System.out.println(car.getName()+ " current stage of common passange is"+ i);
            sleep(car.getSpeed());
        }
    }
}
