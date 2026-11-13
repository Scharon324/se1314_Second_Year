public class L5
{
  public static void main(String [] args){
      Equipment e1 = new Equipment("Printer");
      
      e1.setMake("HP");
      e1.setPrice(20);
      e1.printDetails();
      
      Monitor m2 = new Monitor("Monitors", 22, 23);
      
      m2.setMake("Dell");
      m2.setPrice(200);
      m2.setScreensize(22);
      m2.printDetails();
      
      Printer p3 = new Printer("Samsung", 20, 65);
      
      p3.printDetails();
    }
}
