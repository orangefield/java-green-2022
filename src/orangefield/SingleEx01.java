package orangefield;

class Tube {

    static Tube instance = new Tube();

    private Tube() {

    }

}

public class SingleEx01 {
    public static void main(String[] args) {
        Tube t1 = Tube.instance;
        Tube t2 = Tube.instance;
    }
}
