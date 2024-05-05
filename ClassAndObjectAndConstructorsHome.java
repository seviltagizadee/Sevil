package PDF3EVISI;

public class ClassAndObjectAndConstructorsHome {
    public static void main(String[] args) {
     Employee employee1= new Employee();
     Employee employee2= new Employee("Sevil");
     Employee employee3= new Employee("Guler","Taghizade");
     Employee employee4= new Employee("Meryem","99412345678",1200);


        System.out.println(employee2.name);
        System.out.println(employee3.name + employee3.surname);
        System.out.println(employee4.name + "," + employee4.phone + "," + employee4.salary);
    }
}
