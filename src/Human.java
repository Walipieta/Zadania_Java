import device.Car;

public class Human {
     String name;
     int age;
     Animal pet;
     private Car c;

      double salary;

     double get_salary()
     {
          System.out.println(" Pobrano we wtorek i wynosila:"  + salary);
          return salary;
     }
     public void set_salary( double salary ){
          if( salary < 0 ){
               System.out.println("Podano ujemna wartosc wynagrodzenia");
          }
          else{
               this.salary = salary;
               System.out.println("Wyslano do systemu ksiegowego");
               System.out.println("Prosze zglosic sie do dzialu kadr");
               System.out.println("Zglosic sie do ZUS i US");
          }
     }

     public Car getC() {
          return c;
     }
     public void set_car( Car c ){
          if( this.salary > c.value ){
               System.out.println("Zakupiono auto");
               this.c = c;
          }
          else if( this.salary > (1/12)*c.value ){
               System.out.println("Zakupiono auto na raty");
               this.c = c;
          }
          else{
               System.out.println("Idz do pracy biedaku");
          }
     }
     public String toString(){
          return salary + "\n";
     }

}








