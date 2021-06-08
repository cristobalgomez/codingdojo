public class Project {
    private String name;
    private String description;
    private double initialCost;

    public Project() { 
        this("none","none",0.0);
    }

    public Project(String name) {
        this(name, "none", 0.0);
    }

    public Project(String name, String description) {
        this(name, description, 0.0);
    }

    public Project(String name, double initialCost) {
        this(name, "none", initialCost);
    }

    public Project(String name, String description, double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getInitialCost() {
        return this.initialCost;
    }

    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }

    public String elevatorPitch() {
        return "#####" + this.name + " ($" + this.initialCost + "): " + this.description;
    }


}
