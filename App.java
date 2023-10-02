import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("Bulldog", 4, true, true);
           System.out.println(dog.getAmountOfLegs());

        Dog dog2 = new Dog("Tax", 4, true, true);

        ArrayList<Dog>dogList = new ArrayList<>();
            dogList.add(dog);
            dogList.add(dog2);

            for (int i = 0; i < dogList.size(); i++) {
                System.out.println(dogList.get(i).toString());
            }
        
    }
}
