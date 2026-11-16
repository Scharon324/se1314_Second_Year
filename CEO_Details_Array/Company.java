class Company {
    public static void main(String[] args) {
        Employee e1 = new Employee("", 2600);

        e1.setName("George");
        e1.setSalary(2353);
        e1.printDetails();

        Manager m1 = new Manager(250, "", 324);

        m1.setBonus(2353);
        m1.printDetails();

        CEO c1 = new CEO("BMW", 2353, "BMW", 2353);

        c1.setCompanyCar("Mazda");
        c1.printDetails();
    }
}