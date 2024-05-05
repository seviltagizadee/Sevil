package PDF3EVISI;

public class ClassAndObjectHome {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.id=12345;
        person1.name="Sevil";
        person1.surname="Tagizade";
        person1.age=18;
        person1.phone="0701234567";

        Person person2 = new Person();
        person2.id=12345;
        person2.name="Guler";
        person2.surname="Tagizade";
        person2.age=17;
        person2.phone="0501234567";

        System.out.println(" ID:"+person1.id+"\n NAME: " + person1.name + "\n SURNAME: " + person1.surname + "\n AGE: " + person1.age + "\n PHONE : " +person1.phone);
        System.out.println("*******************************");
        System.out.println(" ID:"+person2.id+"\n NAME: " + person2.name + "\n SURNAME: " + person2.surname + "\n AGE: " + person2.age + "\n PHONE : " +person2.phone);


    }
}
