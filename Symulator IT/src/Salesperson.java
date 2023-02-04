class Salesman extends Employee {
    public int projectsSold;

    public Salesman(int id, String name, double salary, double efficiency) {
        super(String.valueOf(name));
        this.projectsSold = 0;
    }



    public int getProjectsSold() {
        return projectsSold;
    }

    public void setProjectsSold(int projectsSold) {
        this.projectsSold = projectsSold;
    }

    @Override
    public void doWork() {
        System.out.println("Salesman " + getName() + " is looking for new clients");
        setProjectsSold(getProjectsSold() + 1);
    }
}