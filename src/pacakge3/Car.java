package pacakge3;

public class Car extends PassengerCar implements Moveable{
    @Override
    public void move() {
        System.out.println("Riding tires");
    }


}
