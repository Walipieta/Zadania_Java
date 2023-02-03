package device;

public abstract class Device {
    String model ;
     String producer;
    int Year;
    public abstract String toString();
    public abstract void turnOn();
    public void sell( Human seller, Human buyer, double price ){
        if( buyer.cash >= price && seller.d.model == this.model ){
            buyer.cash -= price;
            seller.cash += price;
            buyer.d = seller.d;
            seller.d.model=" ";
            System.out.println("kupiono samochod");
        }
    }
}
