import com.zoo.Mammal;

public class Bat extends Mammal {

    public Bat() {
        setEnergy(300);
    }

    public void fly() {
        if(getEnergy() < 50) {
            System.out.println("Not enough energy :(");
            return;
        }
        System.out.println("Screeching and Flying... -50 Energy");
        decrementEnergy(50);
    }

    public void eatHumans() {
        if(getEnergy() == 300) {
            System.out.println("ok, i dont care... Full of energy ");
            return;
        } else if(getEnergy() > 275) {
            int total = (300-getEnergy());
            incrementEnergy(total);
            System.out.println("ok, i dont care.... +" + total + " Energy");
            return;
        }
        incrementEnergy(25);
        System.out.println("ok, i dont care.... +25 Energy");
    }

    public void attackTown() {
        if(getEnergy() < 100) {
            System.out.println("Not enough energy :(");
            return;
        }
        System.out.println("City on fire... -100 Energy");
        decrementEnergy(100);
    }

}

