package ex11;

class Employee {
    public String name;
    String address;
    protected int salary;
    private int RRN;

    public String toString() {
        return name + ", " + address + ", " + RRN + ", " + salary;
    }
}

class Manager extends Employee {
    private int bonus;

    public void printSalary() {
        System.out.println(salary);
    }

    // public void printRRN() {
    // System.out.println(RRN);
    // }

}

public class ManagerTest {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.printSalary();
    }
}
