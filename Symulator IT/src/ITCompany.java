import java.util.ArrayList;
class ITCompany {
    public String name;
    public double budget;
    public ArrayList<Client> clients;
    public ArrayList<Employee> employees;

    public ITCompany() {
        this.budget = budget;
        this.clients = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }



    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public double employeeCost() {
        double totalCost = 0;
        for (Employee employee : employees) {
            totalCost += employee.getSalary();
        }
        return totalCost;
    }

    public void paySalaries() {
        budget -= employeeCost();
    }

    public void hireEmployee(Employee employee) {
        if (budget >= employee.getSalary() && employee.getAvailability()) {
            addEmployee(employee);
            budget -= employee.getSalary();
            employee.setAvailability(false);
        }
    }

    public void releaseEmployee(Employee employee) {
        employees.remove(employee);
        employee.setAvailability(true);
    }

    public void addSalesman(Salesman salesman) {
    }

    public void addTester(Tester tester) {
    }

    public void simulateWorkingDays(int i) {
    }

    public String calculateTotalProfit() {
        return calculateTotalProfit();
    }

}