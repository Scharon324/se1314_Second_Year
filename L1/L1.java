public class L1
{
    public static void main(){  
        int x;
        String s; // String is a class
        // s is an object
        Coffee c1 = new Coffee(); 
        Human h1 = new Human();
        // Coffee is a class and c is the object        
        // Coffee() is a constructor
        // L1  contains the objects s, c 
        // This concept is called containment

        Coffee c2 = new Coffee();
        Human h2 = new Human();

        h1.name = "Andres";
        h1.weight = 63.2f;
        h1.age = 27;
        h1.gender = "male";

        h2.name = "George";
        h2.weight = 43.2f;
        h2.age = 21;
        h2.gender = "male";

        c1.isWhite = true;
        c1.sugars = 2;
        c1.price = 1.99f;

        c2.isWhite = false;
        c2.sugars = 10;
        c2.price = 5.99f;        

        System.out.println("Human weight is:" + h1.name);
        System.out.println("Human weight is:" + h1.weight);
        System.out.println("Human age is:" + h1.age);
        System.out.println("Human name is:" + h1.gender);

        System.out.println("Human weight is:" + h2.name);
        System.out.println("Human weight is:" + h2.weight);
        System.out.println("Human age is:" + h2.age);
        System.out.println("Human name is:" + h2.gender);

        System.out.println("Coffee one white: " + c1.isWhite);
        System.out.println("Coffee one sugars: " + c1.sugars);
        System.out.println("Coffee one white: " + c1.price);

        System.out.println("Coffee two white: " + c2.isWhite);
        System.out.println("Coffee two sugars: " + c2.sugars);
        System.out.println("Coffee two price: " + c2.price);
    } 

}
/*
class Coffee{

    // A class contains:
    // 1, attributes / properties / variables
    // 2, activities / actions / methods   

    public boolean isWhite;
    public int sugars;
    public float price;

}
*/
// make class Human
// with these attributes:
// name
// weight
// age
// gender
// then make two  objects and assign the values
// print all the values

class Human{
    public String name;
    public float weight;
    public int age;
    public String gender;

}