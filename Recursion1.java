public class Recursion1{
    public static void main(String[] args) {
        sayHi(5);
    }

    public static void sayHi(int n){
        if(n == 0){
            System.out.println("Done!");
        } else {
            System.out.println("hi");
            n--;
            sayHi(n);
        }
        
        //rule for recursion is :
        // we need to mention the recursion when to stop


    }
}