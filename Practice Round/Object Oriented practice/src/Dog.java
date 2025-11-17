public class Dog {
    private String name;
    private String color;

    public Dog(String name, String color){
        this.name=name;
        this.color=color;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public static void main(String[]args){
        Dog dog=new Dog("Fido", "Brown");
        System.out.println(dog.getName());
        System.out.println(dog.getColor());
    }
}
