package classesJava;

public class ClassMain {

    public static void main(String[] args){
        Class1 c = new Class1();
        Class1 d = new Class1();

        Class2 c2 = new Class2();


        System.out.println(c2.y);
        System.out.println(d.x);
        System.out.println(c.x);

        c.printHi();
        d.printHi();
    }
    
}
