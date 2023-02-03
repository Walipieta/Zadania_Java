package device;

public class Car {


    final String model ;
   final String producer;
    int Year;
    double petrol ;
   public  double value ;


    public Car (final String model , String producer , int Year , double petrol,double value){
        this.model = model;
        this.producer = producer;
        this.Year = Year;
        this.petrol = petrol;
        this.value = value;
    }
    public String toString(){
        return model+ " " +producer+ " " +Year+ " " +petrol+ " " +value+ "\n";
    }
}
