public class Human {
     String name;
     int age;
     Animal pet;
     public Car c;

      double salary;

     Double   get_salary()
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
     }







}
