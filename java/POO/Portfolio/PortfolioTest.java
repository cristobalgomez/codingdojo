public class PortfolioTest {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio("Project 1","Description 1", 2.5);
        Project project1 = portfolio.getProject(0);
        String descriptionProject1 = project1.elevatorPitch();

        System.out.println(descriptionProject1);

        project1.setName("New Project 1");
        project1.setInitialCost(13.3);

        System.out.println(portfolio.getProject(0).elevatorPitch());

        portfolio.setProject("Project 2", 34.4);
        System.out.println(portfolio.getProject(1).elevatorPitch());

        portfolio.setProject("Project 3");
        System.out.println(portfolio.getProject(2).elevatorPitch());

        portfolio.getProject(1).setDescription("Description 2");

        System.out.println("------ALL PROJECTS------");
        portfolio.showPortfolio();
        System.out.println("Total cost: $" + portfolio.getPortfolioCost());
    }
}
