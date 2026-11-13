public class Equipment
{
    private float price;
    private String make;

    public Equipment(String make, float price){
        this.make = make;
        this.price = price;      
    }

    public Equipment(String make){
        this.make = make;
    }

    public void setMake(String make){
        this.make=make;        
    }

    public String getMake(){
        return make;        
    }
    
    public void setPrice(float price){
        this.price = price;
    }
    
    public float getPrice(){
        return price;
    }
    
    public void printDetails(){
        System.out.println(make);
        System.out.println(price);
        
    }

}
