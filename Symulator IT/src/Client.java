import java.util.ArrayList;
import java.util.Random;

class Client {
    public String name;
    public int budget;
    public int deadline;

    public Client(String name, int budget, int deadline) {
        this.name = name;
        this.budget = budget;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }
}