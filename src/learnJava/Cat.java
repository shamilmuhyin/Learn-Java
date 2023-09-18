package learnJava;

import learnJava.Animal;

public class Cat extends Animal implements Animals {
    private int legs = 2;
    private  String color;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    @Override
//    public boolean canWalkProperly(int legs) {
//        return false;
//    }

    public boolean canWalkProperly(int legs){
        if(legs<4){
            return false;
        }
        else{
            return true;
        }
    }
}
