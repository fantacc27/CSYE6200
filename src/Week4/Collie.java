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
public class Collie extends Dog{
    public Collie(String name, double speed){
        super(name, speed);
    }
    public void bark(){
        super.bark();
        System.out.println("Woof");
    }
    public void wagTail(){
        System.out.println("Wag tail");
        
    }
    public String toString(){
        return "Collie[name= " + getName() + "]";
    }
    
    @Override
    public String toFormattedString(){
        return String.format("> %1$12s %2$5.2f %3$01d", getName(), getSpeed(), getLegs());
    }
}
