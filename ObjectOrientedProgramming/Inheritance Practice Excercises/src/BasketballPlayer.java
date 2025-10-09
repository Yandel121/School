public class BasketballPlayer extends Player {
    private String position;
    private double free_throw_percentage;
    public BasketballPlayer() {
        setPosition("Guard");
        setFree_throw_percentage(0.2*100);
        super.playerNumber=1;
        super.name="Yandel";
        System.out.println("Basketball Player Created");
        this.displayPlayerDetails();
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getFree_throw_percentage() {
        return free_throw_percentage;
    }
    public void setFree_throw_percentage(double free_throw_percentage) {
        this.free_throw_percentage = free_throw_percentage;
    }

    @Override
    public void displayPlayerDetails() {
        super.displayPlayerDetails();
        System.out.println("Position: "+this.getPosition());
        System.out.println("Free Throw Percentage: "+this.getFree_throw_percentage());
    }
}
