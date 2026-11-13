//extends means inherits
//Equipment is the parent/super class
//printer is a child/sub class
public class Printer extends Equipment
{
    // additional variables and methods can be added
    private int maxPages;
    
    public Printer(String make, float price, int maxPages){
        super(make,price);
        this.maxPages = maxPages;
    }
    
    public void setMaxPages(int maxPages){
        this.maxPages = maxPages;        
    }
    
    public int getMaxPages(){
        return maxPages;
    }
    
    
    
    
    }
