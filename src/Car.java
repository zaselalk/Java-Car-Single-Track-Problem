public class Car extends Thread{
    private final int speed;

    public Car(String Name, int speed){
        this.speed = speed;
        this.setName(Name);
    }

    @Override
    public void run(){
        try {
            RacingTrack.getInstance().passTheSingleTrack(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public int getSpeed() {
        return speed;
    }


}
