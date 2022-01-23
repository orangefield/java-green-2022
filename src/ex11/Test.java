package ex11;

public class Test {
    public static void main(String[] args) {
        SportsCar c = new SportsCar();
        c.color = "Red";
        c.speedUp(100);
        c.speedDown(30);
        c.setTurbo(true);
        System.out.println(c.speed);

    }
}
