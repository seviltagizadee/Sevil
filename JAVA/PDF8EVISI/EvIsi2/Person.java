package PDF8EVISI2;

public class Person {
    String id;
    String name;
    String surname;
    int age;
    String phone;
    String address;

    Person(String id,String name,String surname,int age,String phone, String address){
     this.id= id;
     this.name=name;
     this.surname=surname;
     this.age=age;
     this.phone=phone;
     this.address=address;
    }
    public void printInfo(){
        System.out.println("ID: " +id+ " \nNAME: " +name+ " \nSURNAME: " +surname+ " \nAGE: " +age+ " \nPHONE: " +phone+ " \nADDRESS: " +address);
    }
}
