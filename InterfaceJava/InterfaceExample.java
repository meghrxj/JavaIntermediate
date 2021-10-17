package InterfaceJava;

interface WaterBottleInterface {

    String color = "Blue";
    int volume = 830;
    void fillUp();
    void pourOut();
}
public class InterfaceExample implements WaterBottleInterface {

    public static void main(String[] args){

        System.out.println(color);

        InterfaceExample ex = new InterfaceExample();
        ex.fillUp();

    }

    @Override 
    public void fillUp() {
        System.out.println("It is filled");

    }

    @Override
    public void pourOut() {
        System.out.println("It is empty");
        
    }
    
}
