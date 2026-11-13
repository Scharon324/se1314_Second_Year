public class Car
/* Class car:
 * Model
 * Color
 * maxSpeed
 * currentSpeed
 */
{
    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    public Car(){             
    }

    public Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;        
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed){
        if(maxSpeed > 200){
            System.out.println("Error; Max speed must be below 201");
        }else{
            this.maxSpeed = maxSpeed;
        }
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    
    public void startCar(){
        System.out.println("Car Started!");
    }
    
    public void accelerate(){
        System.out.println("Increasing Speed");
        currentSpeed++;
        
    }
    
    public void brake(){
        System.out.println("Car has stopped");
        currentSpeed = 0;        
    }
    
    public void printDetails(){
        System.out.println("Car details:");
        System.out.println("This car model is "+model);
        System.out.println("This car color is "+color);
        System.out.println("This car Max Speed is "+maxSpeed);
        System.out.println("This car Current Speed is"+currentSpeed);
        
        
    }
}
