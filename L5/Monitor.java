public class Monitor extends Equipment
{
   private float screenSize;
   
   public Monitor(String make, float price, float screenSize){
       super(make, price);
       this.screenSize = screenSize;
    }
   
    public void setScreensize(float screenSize){
        this.screenSize = screenSize;     
        
    }
    
    public float getScreenSize(){
        return screenSize;
    }
   
   
   
    }

