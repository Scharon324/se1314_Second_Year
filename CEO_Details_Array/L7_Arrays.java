import java.util.*;

public class L7_Arrays
{
    public static void main (String []args ){
        // Creating an array of objects
        CEO [] list = new CEO [10];
        // Two different ways of inserting an object
        // into an array
        // 1
        CEO c1 = new CEO("helvijs", 80000, "Subaru", 70000);
        // list[0] will point to the object that c1 is 
        // pointing to
        list[0]  = c1;
        // 2       
        list[1] = new CEO("andres", 90000, "BMW", 100);
        // c3 will point to the object that c1  and 
        // list[0] are pointing to
        CEO c3 = list[0];

        System.out.println(list[0].getName()); // subaru
        System.out.println(list[1].getName()); // BMW
        System.out.println(c1.getName()); // Subaru
        System.out.println(c3.getName()); // Subaru       
        //System.out.println(list[2].getName()); // NullPointerException                  

    }

}
