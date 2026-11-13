
/**
Create a class:  College

attributes
name
address
tel
email

Make 3 constructors and all mutator/setters and accessor/getters methods

use this keyword for all mutator methods

in another class create 3 objects using more than one constructor 
 */
public class L3_HomeWork
{
   public static void main(String [] args){
       
     College c1 = new College("Andres2",2);
     
     c1.setAttributes("Testing the attributes");
     
     System.out.println(c1.getAttributes ());
     
     c1.setName("Andres");
     
     System.out.println(c1.getName ());
     
     c1.setAddress("My Address is as follows");
     
     System.out.println(c1.getAddress ());
     
     c1.setTel(55374);
          
     System.out.println(c1.getTel());
     
     c1.setEmail("salfj@fsaldf");
     
     System.out.println(c1.getEmail());
    }
    }   
    