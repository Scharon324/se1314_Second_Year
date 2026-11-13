public class RandomSelectStudent
{

    public static void main(String [] args){

        String [] students = {
                "Ricardo",
                "George",
                "Dereje",
                "Issa",
                "Andres",
                "Asna",
                "Helvijs",
                "ravi",
                "Samiya",
                "Rahila",
                "Majid",
                "Alisha"
            };

        int noOfStudents  = students.length;
        int random = (int)(Math.random() * noOfStudents);        
        System.out.println(students[random]);
    }

}