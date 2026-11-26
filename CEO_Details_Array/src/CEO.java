class CEO extends Manager {
    private String companyCar;

    public CEO(String companyCar, float bonus, String name, float salary) {
        super(bonus, name, salary);
        this.companyCar = companyCar;
    }

    public void setCompanyCar(String companyCar) {
        this.companyCar = companyCar;
    }

    public String getCompanyCar() {
        return companyCar;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("The Name of the CEO Car is: " + companyCar);
    }
}
