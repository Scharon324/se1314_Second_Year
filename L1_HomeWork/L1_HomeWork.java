
/// Make a class car
// model
// make
// price
// color
// max speed

// then make three objects and print their values
public class L1_HomeWork
{
    public static void main(String [] args){

        Car cars = new Car();

        cars.model = "BM2234";
        cars.make = 12432;
        cars.price = 5523.23;
        cars.color = "Blue";
        cars.maxSpeed = 56.74f;

        System.out.println("This car is:" + cars.model);
        System.out.println("This car is:" + cars.make);
        System.out.println("This car is:" + cars.price);
        System.out.println("This car is:" + cars.color);
        System.out.println("This car is:" + cars.maxSpeed);
        
        System.out.println (cars.model + ":" + cars.make + ":" + cars.price + ":" + cars.color + ":" + cars.maxSpeed);
    }
}

class Car{
    public String model;
    public int make;
    public double price;
    public String color;
    public float maxSpeed;

}
