import java.util.ArrayList;
public class Project {
    public String name;
    public int budget;
    public int duration;

    public Project(String name, int budget, int duration) {
        this.name = name;
        this.budget = budget;
        this.duration = duration;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", duration=" + duration +
                '}';
    }
}