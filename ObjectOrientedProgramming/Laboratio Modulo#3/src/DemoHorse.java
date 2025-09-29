import java.time.format.DateTimeFormatter;

public class DemoHorse extends Horse {

    public DemoHorse(String name, int birth_year, String color) {
        super();
    }

    public static void main(String [] args){
    Horse horse= new Horse();
    horse.setName("Shining Star");
    horse.setBirth_year(1999);
    horse.setColor("Grey");
    horse.printHorse();

    RaceHorse raceHorse= new RaceHorse();
    raceHorse.setName("Lighting Strike");
    raceHorse.setBirth_year(2000);
    raceHorse.setColor("Black");
    raceHorse.setRaces(10);
    raceHorse.printHorse();



    }

}
