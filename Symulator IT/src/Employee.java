abstract class Employee {
    public int id;
    public String name;
    public double salary;
    public boolean efficiency;
    public boolean availability;

    public Employee(String name) {
        this.name = name;
        this.salary = salary;
        this.availability = true;
    }

    public Employee(int id, String bestStudent, int salary, String git) {

    }

    public Employee(int id2, String average, int salary, String git) {
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isEfficiency() {
        return efficiency;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public abstract void doWork();

    public boolean getAvailability() {
        return availability;
    }
}