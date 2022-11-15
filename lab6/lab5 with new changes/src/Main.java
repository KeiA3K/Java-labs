import animal.Animal;
import animal.Cat;
import animal.Dog;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AnimalArrayList animalArrayList = new AnimalArrayList(30);
        Animal cat = new Cat("Markiz");
        Animal dog = new Dog("Baron");

        animalArrayList.add(cat);
        animalArrayList.add(dog);

        System.out.println("Second animal is " + animalArrayList.get(1));

        Animal newDog = new Dog("Reks");

        animalArrayList.set(1, newDog);

        for (int i = 0; i < animalArrayList.size(); i++) {
            Animal curAnimal = animalArrayList.get(i);
            System.out.print("Animal " + curAnimal.getName() + " says ");
            curAnimal.sound();
        }

        animalArrayList.clear();
    }
}
