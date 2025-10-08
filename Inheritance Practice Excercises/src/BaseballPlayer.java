public class BaseballPlayer {
    private String position;
    private double battingAverage;

    public BaseballPlayer(String position, double battingAverage) {
        this.position = position;
        this.battingAverage = battingAverage;
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
    
}
