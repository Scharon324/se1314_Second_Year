class Manager extends Employee {
    private float bonus;

    public Manager(float bonus, String name, float salary) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("The Managers Bonus are: " + bonus);
    }
}