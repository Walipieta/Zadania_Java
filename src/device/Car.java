package device;

public class Car extends Device {
    double petrol ;
    public  double value ;
    public Car (final String model , String producer , int Year , double petrol,double value){
        this.model = model;
        this.producer = producer;
        this.Year = Year;
        this.petrol = petrol;
        this.value = value;
    }
    public boolean equals(Car obj) {
        return (this == obj);
    }
    public String toString(){
        return model+ " " +producer+ " " +Year+ " " +petrol+ " " +value+ "\n";
    }
    public void turnOn(){
        System.out.println("Wlaczono samochod\n");
    }
}
