public class RaceHorse extends Horse {
    private int races;

    public RaceHorse(){
        this.races=races;
    }
    public int getRaces(){
        return races;
    }
    public void setRaces(int races){
        this.races=races;
    }
    @Override public void printHorse(){
        super.printHorse();
        System.out.println("Races participated: "+this.getRaces());
    }
}
