import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Pet> petList = new ArrayList<Pet>();

        Pet pet1 = new Pet("Floppy", "rabbit");
        Pet pet2 = new Dog("Arty", "pug");

        petList.add(pet1);
        petList.add(pet2);
    }
}
