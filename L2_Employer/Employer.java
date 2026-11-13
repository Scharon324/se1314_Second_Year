//Make a new class Employer
//name
//address
//salary

public class Employer
{
    private String name;
    private String address;
    private double salary;

    public Employer(String a, String b, double c){
        name = a;
        address = b;
        salary = c;
    }

    public void setSalary(double c){
        salary = c;
    }

    public double getSalary(){
        return salary;
    }

    public void setName(String a){
        name = a;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String b){
        address = b;
    }

    public String getAddress(){
        return address;
    }
}

