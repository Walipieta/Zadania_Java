import java.sql.SQLOutput;

public class Animal {
    final String species;
    private double weight ;
    String name;
    int age;
    static boolean isAlive;





    public Animal(String species){
        this.species = species ;
        isAlive = true;
        switch (species) {

            case "wolf":
                weight = 20;
                break;
            case "elephant":
                weight = 500;
                break;
            case "cat": weight = 4;



        }


    }






    void feed(){
        if(isAlive == true) {
            weight += 1;
        }
        else{
            System.out.println("Animal is dead");

        }
    }
    void takeForAWalk(){
        if(isAlive == true){
            weight -=1;
            if (weight <= 0 ){
                System.out.println("Animal is dead");
                isAlive = false;
            }
        }
        else {
            System.out.println("Animal is dead");
        }
    }

}
