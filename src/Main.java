

public class Main {

    public static void main(String[] args) {
        Animal pet =new Animal("cat");

        for(int i = 0 ; i <5 ; i++){
            pet.feed();
            pet.takeForAWalk();
            pet.feed();

        }
        Car c = new Car("E36" ,"BMW" , 2010 , 6 );
        Human h = new Human();
        h.c = c;








    }
}