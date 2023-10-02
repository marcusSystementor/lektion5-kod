public class Dog {

    private String race;
    private int amountOfLegs;
    private boolean hasTail;
    private boolean isAlive;

    public Dog(String race, int amountOfLegs, boolean hasTail, boolean isAlive) {
        this.race = race;
        this.amountOfLegs = amountOfLegs;
        this.hasTail = hasTail;
        this.isAlive = isAlive;

    }

    public Dog(String race, int amountOfLegs, boolean hasTail) {
        this.race = race;
        this.amountOfLegs = amountOfLegs;
        this.hasTail = hasTail;
    }

    public Dog(boolean isAlive) {
        this.isAlive = isAlive;
    }
    
    public boolean isItAlive() {
        return this.isAlive;
    }

    //metod, sätter om hunden är levande eller död
    public void setIsAlive(boolean alive) {
        this.isAlive = alive;
    }

    // Setter
    public void setAmountOfLegs(int amountOfLegs) {
        this.amountOfLegs = amountOfLegs;
    }

    // Getter
    public int getAmountOfLegs() {
        return this.amountOfLegs;
    }

    // To String Method
    public String toString() {
        return race + " " + amountOfLegs + " " + isAlive;
    }
 
}
