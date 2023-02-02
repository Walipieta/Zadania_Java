

public class Main {

    public static void main(String[] args) {
        Animal pet =new Animal("cat");
        Car c = new Car("E36" ,"BMW" , 2010 , 6 ,4000);

        for(int i = 0 ; i <5 ; i++){
            pet.feed();
            pet.takeForAWalk();
            pet.feed();

        }

        Human h = new Human();
        h.set_car(c);
        h.set_salary(10000);








    }
}