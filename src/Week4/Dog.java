package Week4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xiao
 */
public class Dog {

    private int legs;
    private double speed;
    private String name = "";

    public Dog(String name, double speed) {
        this.name = name;
        this.speed = speed;
        legs = 4;
    }
    
    public Dog(String name, double speed, int legs){
        this.name = name;
        this.speed = speed;
        this.legs = legs;
    }
    
    public Dog(String name, String speed, int legs){
        this.name = name;
        this.speed = Double.valueOf(speed);
        this.legs = legs;
    }

    public void bark() {
        System.out.println("Bark");
    }
    public  String getName(){
        return name;
    }
    public Double getSpeed(){
        return speed;
    }
    public int getLegs(){
        return legs;
    }
    @Override
    public String toString() {
        return toFormattedString();
    }
    public String toFormattedString(){
        return String.format("Dog> %1$12s %2$5.2f %3$01d", getName(), getSpeed(), getLegs());
    }
}

