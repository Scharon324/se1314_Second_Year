public class City
{
    // Classes have two types of members: 
    // variables/ attributes & methods / behaviours
    
    // attributes
    private String name;
    private long pop;
    
    // constructors
    public City(){    
    }
    
    public City(String name, long pop){        
        this.name = name; 
        // 'this' keyword refers to the object 
        // to access global variables
        this.pop = pop;
    }
    
    public City(String name){
        this.name = name;        
    }
    
    // mutators and accessors
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setPop(long pop){
        this.pop = pop;
    }
    
    public long getPop(){
        return pop;
    }
    
    
}

