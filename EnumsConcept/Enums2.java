package EnumsConcept;

public class Enums2 {

    enum Flavor{
        CHOCOLATE, VANILLA, STRAWBERRY;
    }
    
public static void main(String[] args){
    Flavor flav = Flavor.CHOCOLATE;

    if(flav == flav.CHOCOLATE){
        System.out.println("Its chocolate!");
    } else if(flav == flav.VANILLA){
        System.out.println("Its vanilla!");
    } else if(flav == flav.STRAWBERRY){
        System.out.println("Its Strawberry!");
    }



    }


}
