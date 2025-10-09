public class Horse {
    protected String name;
    protected int birth_year;
    protected String color;

    public Horse() {
        this.name = name;
        this.birth_year = birth_year;
        this.color = color;
    }
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getBirth_year() {;return birth_year;}

    public void setBirth_year(int birth_year) {this.birth_year = birth_year;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public void printHorse(){
        System.out.println("Name: "+this.getName());
        System.out.println("Birth Year: "+this.getBirth_year());
        System.out.println("Color: "+this.getColor());
    }
}
