package PDF3EVISI;

public class Employee {
    int id;
    String name;
    String surname;
    String phone;
    String address;
    int salary;


    public Employee() {
        System.out.println("Empty");
    }

    public Employee(String name) {
    this.name=name;
        System.out.println( "Name:" + name);
    }

    public Employee(String name,String surname) {
        this.name=name;
        this.surname=surname;
        System.out.println("Name:" + name + "\n Surname : " +surname);
    }

    public Employee(String name, String phone, int salary) {
        this.name=name;
        this.phone=phone;
        this.salary=salary;
        System.out.println("Name:" + name + "\n Phone : " +phone + "\n Salary : " +salary);
    }
}
