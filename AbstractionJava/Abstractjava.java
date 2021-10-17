package AbstractionJava;


abstract class Dog {

    String breed;
    public void bark(){
        System.out.println("Bark!");
    }
    public abstract void poop();//we can implement method for poop in chihuahua (extension)
}
//abstract and interface difference 
//interface can have only methods
//but abstract can both abstract methods and implement methods in abstract class. 
//fuck that shit just google it man

class Chihuahua extends Dog{

    public void poop(){
        System.out.println("Poops..");
    }
}
//chihuahua is extension of dog so we can use this dog in main method

public class Abstractjava {
    
    public static void main(String[] args){

        Chihuahua d = new Chihuahua();

        d.bark();
        d.poop();

    }
}
