package PDF8EVISI2;

public class Employee extends Person{
    int salary;
    String department;
    String username;
    String password;


    Employee(String id,String name,String surname,int age,String phone, String address,int salary,String department,String username,String password){
        super(id, name, surname, age, phone, address);
        this.salary=salary;
        this.department=department;
        this.username=username;
        this.password=password;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("SALARY: " +salary+ " \nDEPARTMENT: " +department+ "\nUSERNAME: " +username+ "\nPASSWORD: " +password);
    }
}
