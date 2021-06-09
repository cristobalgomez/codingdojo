import com.zoo.Mammal;

public class Gorilla extends Mammal {
    public void eatBananas() {
        if(getEnergy() == 100) {
            System.out.println("Eating bananas... Full of energy ");
            return;
        } else if(getEnergy() > 90) {
            int total = (100-getEnergy());
            incrementEnergy(total);
            System.out.println("Eating bananas.... +" + total + " Energy");
            return;
        }
        incrementEnergy(10);
        System.out.println("Eating bananas.... +10 Energy");
    }

    public void throwSomething() {
        if(getEnergy() < 5) {
            System.out.println("Not enough energy :(");
            return;
        }
        decrementEnergy(5);
        System.out.println("Throwing something.... -5 Energy");
    }

    public void climb() {
        if(getEnergy() < 10) {
            System.out.println("Not enough energy :(");
            return;
        }
        decrementEnergy(10);
        System.out.println("Climbing.... -10 Energy");
    }

}
