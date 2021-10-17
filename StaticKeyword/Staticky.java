package StaticKeyword;

public class Staticky {

    static int a = 0;
    static int months = 12;
//static increases scope
    public static void main(String[] args){
        int b = 1;

        System.out.println(a + b);
    }
    
}
