package SubAndSuper;

public class Main {

    public static void main(String[] args){

        Walking s = new Walking(true, "Nike", 10);
        System.out.println(s.brand);

        Running r = new Running(4.5, "Nike", 10);
        System.out.println(r.brand);
        System.out.println(r.size);
    }
    
}
