public class Inheritance {
    public static void main(String[] args){

        //System.out.println("We will learn about inheritance from an Example -> 'MouseExample'");

        Mouse1 m1 = new Mouse1();

        m1.leftClick();
        m1.rightClick();
        m1.scrollDown();
        m1.scrollUp();

        Mouse2 m2 = new Mouse2();

        m2.connect();
    }
}
