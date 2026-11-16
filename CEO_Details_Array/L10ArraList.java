import java.util.*;
public class L10ArraList
{
    public static void main(String [] args){

        ArrayList<Employee> list = new ArrayList();

        list.add( new Employee ("Matthew"));
        Employee t1 = new Employee ("Bratati");
        list.add( t1 );

        int x = 0;
        while(list.size() > x){
            System.out.println(list.get(x).getName());
            x++;
        }

    }
}
