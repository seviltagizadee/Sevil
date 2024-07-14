package PDF6EVISI;

public class Person {
    String name;
    public String surname;
    private int age;
    protected String number;
    private int workYear;
    static int salary;


    public Person(String name, String surname, int age, String number, int workYear) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.number = number;
        this.workYear = workYear;
    }

    Person(int age, String number) {
        this.age = age;
        this.number = number;
    }

    private Person(int workYear){
        this.workYear=workYear;
    }


    protected Person(String name){
        this.name=name;
    }
    void fullName(){
        System.out.println("NAME: " + name + "\n SURNAME: " +surname);
    }

    public void FullInfo() {
        System.out.println("Name: " + name + "\n Surname: " + surname + "\n Age: " + age + "\n Personal number: " + number);
    }

    private void checkSalary() {
        salary *= workYear;
        System.out.println("You work " + workYear + " year. Your Salary : " + salary);
    }


    protected void checkWorkYear() {
        if (workYear > 5) {
            System.out.println("You are old worker :)");

        } else {
            System.out.println("You are still a child worker :)");

        }
    }

    void checkBonus(final int percent){
        salary+=percent;
        System.out.println("Your bonus : " +percent);
    }
}
