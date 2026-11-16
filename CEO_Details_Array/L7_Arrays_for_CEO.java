import java.util.*;

public class L7_Arrays_for_CEO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CEO[] list = new CEO[10];

        // Input details for the first CEO
        System.out.println("Please enter the name of the CEO");
        String name = sc.nextLine();
        
        System.out.println("Please enter the salary of the CEO");
        float salary = Float.parseFloat(sc.nextLine());
        
        System.out.println("Please enter the bonus of the CEO");
        int bonus = Integer.parseInt(sc.nextLine());
        
        System.out.println("Please enter the car of the CEO");
        String companyCar = sc.nextLine();

        list[0] = new CEO(companyCar, bonus, name, salary);

        // Input details for the second CEO
        System.out.println("Please enter the name of the CEO");
        name = sc.nextLine();
        
        System.out.println("Please enter the salary of the CEO");
        salary = Float.parseFloat(sc.nextLine());
        
        System.out.println("Please enter the bonus of the CEO");
        bonus = Integer.parseInt(sc.nextLine());
        
        System.out.println("Please enter the car of the CEO");
        companyCar = sc.nextLine();

        list[1] = new CEO(companyCar, bonus, name, salary);

        int x = 0;
        while (x <= 1) {
            list[x].printDetails();
            x++;
        }
    }
}