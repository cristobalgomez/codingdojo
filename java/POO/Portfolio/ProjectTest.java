public class ProjectTest {
    public static void main(String[] args) {
        Project firstProject = new Project();

        System.out.println("Name: " + firstProject.getName());
        System.out.println("Description: " + firstProject.getDescription());
        System.out.println("Initial Cost $: " + firstProject.getInitialCost());

        firstProject.setName("Project 1");
        firstProject.setDescription("Cool project");
        firstProject.setInitialCost(10.5);

        System.out.println("Name: " + firstProject.getName());
        System.out.println("Description: " + firstProject.getDescription());
        System.out.println("Initial Cost $: " + firstProject.getInitialCost());

        firstProject.setInitialCost(18.5);

        System.out.println(firstProject.elevatorPitch());

        Project secondProject = new Project("Project2");
        Project thirdProject = new Project("Project 3", "Description 3");
        Project fourthProject = new Project("Project 4", "Description 4", 11.77);
        
        System.out.println(secondProject.elevatorPitch());
        System.out.println(thirdProject.elevatorPitch());
        System.out.println(fourthProject.elevatorPitch());
    }
}
