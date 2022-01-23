package ex11;

public class Car {
    int speed;
    int gear;
    public String color;

    public void speedUp(int increment) {
        speed += increment;
    }

    public void speedDown(int decrement) {
        speed -= decrement;
    }
}

class SportsCar extends Car {
    boolean turbo;

    public void setTurbo(boolean newValue) {
        turbo = newValue;
    }
}
