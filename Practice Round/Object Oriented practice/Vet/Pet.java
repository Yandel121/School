//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Pet {
    protected String name;
    protected String species;
    protected int age;


    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;

    }

    public String describe() {
        return name + " " + species + " " + age + "-years old.";

    }
}