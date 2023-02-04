public class Main {


    private static String Salesman;

    public static void main(String[] args) {
        ITCompany itCompany = new ITCompany();

        Client client1 = new Client("Client1", 1000, 7);
        Client client2 = new Client("Client2", 2000, 5);
        Client client3 = new Client("Client3", 3000, 10);

        itCompany.addClient(client1);
        itCompany.addClient(client2);
        itCompany.addClient(client3);

        Employee bestStudent = new Employee(1, "BestStudent", 50, "git") {
            @Override
            public void doWork() {

            }
        };
        Employee averageStudent = new Employee(2,"Average", 40, "Trzeba poprawic") {
            @Override
            public void doWork() {

            }
        };
        Employee knowItAll = new Employee(75, "wie wszystko", 100, ) {
            @Override
            public void doWork() {

            }
        };

        itCompany.addEmployee(bestStudent);
        itCompany.addEmployee(averageStudent);
        itCompany.addEmployee(knowItAll);

        
        Salesman salesman = new Salesman(11, Salesman, 5, 100);
        Tester tester = new Tester(12, "Tester");

        itCompany.addSalesman(salesman);
        itCompany.addTester(tester);

        itCompany.simulateWorkingDays(365);
        System.out.println("Total profit: " + itCompany.calculateTotalProfit());
    }
}