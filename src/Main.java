import device.Car;

public class Main {

    public static void main(String[] args) {

        Animal pet =new Animal("PIESS",10,"Arek",5,true);
        Animal pet1 = new Animal("KOT",5,"FELIX",1,false);
        Car c = new Car("E36" ,"BMW" , 2010 , 6 ,4000);
        Car c1 = new Car("2000", "Audi", 1999, 2, 100);
        Car c2 = new Car("2000", "Audi", 1999, 2, 100);
        if( !c1.equals(c2) ){
            System.out.println("Takie same");
        }
        else{
            System.out.println("Inne");
        }
        System.out.println(c1);

        for(int i = 0 ; i <5 ; i++){
            pet.feed();
            pet.takeForAWalk();
            pet.feed();

        }

        Human h = new Human();
        h.set_car(c);
        h.set_salary(10000);
        c.toString();
        pet.toString();

        System.out.println(c1.equals(c2));

        System.out.println(pet1);









    }
}