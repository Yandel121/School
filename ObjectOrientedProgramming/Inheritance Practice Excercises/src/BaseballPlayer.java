public class BaseballPlayer extends Player {
    private String position;
    private double battingAverage;

    public BaseballPlayer() {
        setPosition("Pitcher");
        setBattingAverage(0.25*100);
        super.playerNumber=2;
        super.name="Sam";
        System.out.println("Baseball Player Created");
        this.displayPlayerDetails();
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getBattingAverage() {
        return battingAverage;
    }
    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    @Override public void displayPlayerDetails() {
        super.displayPlayerDetails();
        System.out.println("Position: "+this.getPosition());
        System.out.println("Batting Average: "+this.getBattingAverage());
    }

}
