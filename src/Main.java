import device.Car;
import device.Device;
import device.Phone;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car("FOCUS", "Ford", 2002, 8, 2000);
        Car c2 =  new Car( "R8","Audi", 2000, 10, 10000);

        if( !c1.equals(c2) ){
            System.out.println("Takie same");
        }
        else{
            System.out.println("Inne");
        }
        System.out.println(c1);
        ArrayList<Device> De = new ArrayList<Device>();
        Device dd = new Phone();
        De.add(dd);
        Device ddd = new Car( "R8","Audi", 2000, 10, 10000);
        De.add(ddd);

        for ( Device i : De ){
            i.turnOn();
        }












    }
}