package ThisKeyword;

public class Thisjava2 {

    String food;
    char size;

    public void setData(String food, char size){
        this.food = food;
        this.size = size;
    }

    public static void main(String[] args){


        Thisjava2 p = new Thisjava2();

        p.setData("soup", 'L');

        System.out.println(p.food);
        System.out.println(p.size);
    }
    
}
