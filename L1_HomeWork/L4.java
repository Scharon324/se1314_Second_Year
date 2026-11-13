public class L4
{
   public static void main(String [] args){
       Car c1 = new Car("Honda","Blue", 120);
       
       c1.setMaxSpeed(80000);
       c1.printDetails();
       
       c1.startCar();
       //c1.brake();
       c1.accelerate();
       c1.accelerate();
    }
    }

