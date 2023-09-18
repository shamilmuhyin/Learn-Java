package learnJava;

import java.util.List;

public class Student {
//    Data
    private int rollNum;
    private String Name;

    public Student(){
    }

// Behaviour
    public void setRollNUm(int rollNUm) {
        this.rollNum = rollNUm;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
