public class L2
{
    public static void main(String [] args){
        House h1 = new House();

        h1.bedroom = 2;
        h1.price = 63.2f;
        h1.Garden = true;
        h1.type = "Good";   
        
        System.out.println("Bedroom is:" + h1.bedroom);
        System.out.println("Price is:" + h1.price);
        System.out.println("Garden is:" + h1.Garden);
        System.out.println("Type is:" + h1.type);

    }
}
class House{
    public int bedroom;
    public float price;
    public boolean Garden;
    public String type;

}

