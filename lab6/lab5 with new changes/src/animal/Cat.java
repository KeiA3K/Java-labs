package animal;

import java.util.Objects;

public class Cat extends Animal{
    private final String name; // encapsulation (we cannot change the name of the Cat after it was created)
    private final String sound = "meow";

    public Cat(String name) {
        this.name = name;
    }

    @Override // polymorphism (it differs from other classes extending Animal)
    public String getName() {
        return name;
    }

    @Override // polymorphism (it differs from other classes extending Animal)
    public void sound() {
        System.out.println(sound);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Cat cat)) return false;
        return Objects.equals(getName(), cat.getName()) && Objects.equals(sound, cat.sound);
    }

}
