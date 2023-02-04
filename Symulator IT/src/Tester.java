class Tester extends Employee {
    public Tester(int id, String name) {
        super(name);
    }


    @Override
    public void doWork() {
        System.out.println("Tester " + getName() + " is testing the software");
    }
}