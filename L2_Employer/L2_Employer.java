//Make a new class Employer
//name
//address
//salary

public class L2_Employer
{
    public static void main (String [] args){

        Employer e1 = new Employer("andres", "K13:33", 5  );
        System.out.println(e1.getSalary());
        System.out.println(e1.getName());
        System.out.println(e1.getAddress());

        e1.setSalary(3000);

        System.out.println(e1.getSalary());

        e1.setName("Andres");

        System.out.println(e1.getName());

        e1.setAddress("K13:32");

        System.out.println(e1.getAddress());

    }

}
