package developia.spring.model;

import com.fasterxml.jackson.databind.BeanProperty;
public class Student {
    private int id;
    private String name;

    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public Student(){
        id=5;
        name="Sevil";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
