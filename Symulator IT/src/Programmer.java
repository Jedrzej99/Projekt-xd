class Programmer extends Employee {
    public String technology;

    public Programmer(int id, String name, double salary, double efficiency, String technology) {
        super(name);
        this.technology = technology;
    }

    public String getTechnology() {
        return technology;
    }

    @Override
    public void doWork() {
        System.out.println("Programmer " + getName() + " is coding using " + technology);
    }
}
