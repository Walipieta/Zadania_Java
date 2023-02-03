public class Animal {
    String species;
    double weight ;
    String name;
    int age;
    boolean isAlive;






    public  Animal(String species , double weight, String name , int age ,boolean isAlive){
        this.species = species ;
        this.weight = weight;
        this.name  = name ;
        this.age = age  ;
        this.isAlive =  isAlive;








    }

    public String toString(){
        return species+ " " +weight+ " " +name+ " " +age+ " " +isAlive+ "\n";
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
