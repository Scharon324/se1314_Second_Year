class Employee {
    private String name;
    private float salary;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void printDetails() {
        System.out.println("The CEO name is: " + name);
        System.out.println("The Salary for the CEO is: " + salary);
    }
}