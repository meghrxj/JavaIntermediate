package EnumsConcept;


enum Level {
    EASY, INTERMEDIATE, HARD;
}


public class Enums1 {

    public static void main(String[] args){
        System.out.println(Level.HARD);
        
          Level l = Level.EASY;

          System.out.println(l);

          switch(l){
              case EASY:
              System.out.println("Easy level");
              break;
              case INTERMEDIATE:
              System.out.println("Intermediate level");
              break;
              case HARD:
              System.out.println("Hard level");
              break;
          }

    }
    
}
