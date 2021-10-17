package Constructors;

public class Main {

    public static void main(String[] args){

        Shirt s = new Shirt();
        s.putOn();

        s.setColor("white");
        s.setSize('M');
        
        Shirt m = new Shirt("white", 'S');

        System.out.println(m.color);

    }
    
}
