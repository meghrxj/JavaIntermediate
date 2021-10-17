package FinalKeyword;
//MORAL OF THE STORY : YOU CANT CHANGE / MODIFY FINAL KEYW
public class FinalJava {

    final int MIN = 0;
    final int MAX = 5;
    static final double PI = 3.14;

    //void changeMax(int newMax){
       // MAX = newMax;
    //} 

    final public void sayHi(){
        System.out.println("Hi");
    }

    public static void main(String[] args){

        FinalJava f = new FinalJava();
        System.out.println(f.MAX);
    }

}

class OtherClass extends FinalJava {

    public void sayHi(){
        System.out.println("Hello!");
    }

}
