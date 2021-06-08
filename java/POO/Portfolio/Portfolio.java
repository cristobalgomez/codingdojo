import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<Project> projectList = new ArrayList<>();

    public Portfolio() {
        this("none","none",0.0);
    }

    public Portfolio(String name) {
        this(name,"none",0.0);
    }

    public Portfolio(String name, double initialCost) {
        this(name,"none",initialCost);
    }

    public Portfolio(String name, String description) {
        this("none","none",0.0);
    }

    public Portfolio(String name, String description, double initialCost) {
        this.projectList.add(new Project(name, description, initialCost));
    }
    

    public List<Project> getProjectList() {
        return projectList;
    }

    public Project getProject(int id) {
        return projectList.get(id);
    }

    public void setProject(String name, String description, double initialCost) {
        this.projectList.add(new Project(name, description, initialCost));
    }

    public void setProject(String name, double initialCost) {
        this.projectList.add(new Project(name, initialCost));
    }

    public void setProject(String name) {
        this.projectList.add(new Project(name));
    }

    public void showPortfolio() {
        for (Project project : projectList) {
            System.out.println(project.elevatorPitch());
        }
    }

    public double getPortfolioCost() {
        double total = 0;
        for (Project project : projectList) {
            total += project.getInitialCost();
        }

        return total;
    }
}
