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
public class DogTest {
    
    private Dog simpleDog;
    private Collie simpleCollie;
    public DogTest(){
        simpleDog = new Dog("Fido", 10.0);
        simpleCollie = new Collie("Tramp", 12.0);
    }
    private void run(){
        System.out.println("My simple dog: " + simpleDog.getName());
        simpleDog.bark();
        System.out.println("My simple collie: " + simpleCollie.getName());
        simpleCollie.bark();
        simpleCollie.wagTail();
        
        System.out.println("My collie is (toString()): " + simpleCollie);
        System.out.println("Collie formatted:" + simpleCollie.toFormattedString());
        
        
    }
    public static void main(String args[]){
        DogTest dt = new DogTest();
        dt.run();
        
    }
    
}
