package geekbrains.hw_4;

public class Employee {

    private int id;
    private String fulName;
    private String position;
    private String phoneNumber;
    private double salary;
    private int age;
    private static int counter = 1;


    public Employee(String fulName, String position, String phoneNumber, double salary, int age) {
        this.id = counter++;
        this.fulName = fulName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    String GetFulName() {

        return fulName;
    }
    String GetPosition() {

        return position;
    }
    String GetPhoneNumber() {

        return phoneNumber;
    }
    double GetSalary() {

        return salary;
    }
    int GetAge() {

        return age;
    }
    int GetId() {

        return id;
    }
    public void setSalary(double newSalary) {
        salary = newSalary;
    }
}