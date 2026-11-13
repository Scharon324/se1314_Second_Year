public class L3
{
public static void main(String [] args){     
        
        
        City c1 = new City("berlin", 65576575);
        // City is a class
        // c1 is a reference / pointer to an object
        // new performs instantsiation, which means
           // creating a new object
        // City() is a constructor which initialises     
           // the object
           
        // City c1 - create a pointer/reference to a City object
        // new - instantsiation: create the object
        // City() - initialisation: set the initial values
           // of the object
        
        City c2;
        c2 = new City();      
        
        c1 = c2;
        // reference c1 now points to the same object
        // that reference c2 points to.
        // access to the old object that c1
        // was pointing to is lost.
        
        System.out.println(  c1.getName()  );
        System.out.println(  c1.getPop()  );
        System.out.println(  c2.getName()  );
        System.out.println(  c2.getPop()  );


        c1.setName("Tokyo");
        System.out.println(  c1.getName()  );        
        System.out.println(  c2.getName()  );
        
    }
    
}
