// File: DemoHorse.java
// Author: Yandel Colon Rivera
// Date: 2025-29-9
// Class: COMP 2400 OOP
// Description:  Outputs the horse's name, birth year and hair color. If there a racehores it outputs the amount of races participated in

public class DemoHorse extends Horse {

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
