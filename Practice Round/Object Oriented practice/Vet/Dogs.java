public class Dogs extends Pet {
    private final String breed;

    public Dogs(String name, int age, String breed) {
        super(name, "Dog", age);
        this.breed = breed;
    }
    @Override
    public String describe() {
        return name+" is a "+ age+"-years old"+breed+".";
    }
}
