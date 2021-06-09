import com.zoo.Mammal;

public class Gorilla extends Mammal {
    public void eatBananas() {
        if(this.energy == 100) {
            System.out.println("Full of energy");
            return;
        } else if(this.energy > 90) {
            int addEnergy = (100-this.energy);
            this.energy += addEnergy;
        }
        this.energy += 10;
        System.out.println("Eating bananas.... +10 Energy");
    }

    public void throwSomething() {
        if(this.energy == 0) {
            System.out.println("Not enough energy :(");
            return;
        }
        this.energy -= 5;
        System.out.println("Throwing something.... -5 Energy");
    }

    public void climb() {
        if(this.energy == 0) {
            System.out.println("Not enough energy :(");
            return;
        }
        this.energy -= 10;
        System.out.println("Climbing.... -10 Energy");
    }

}
