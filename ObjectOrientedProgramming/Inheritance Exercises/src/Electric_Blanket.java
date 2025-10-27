public class Electric_Blanket extends Blanket {
    private int heatSettings;
    private String automaticShutoff;
    public Electric_Blanket(){
        this.heatSettings=1;
        this.automaticShutoff= "NO";
    }
    public void setHeatSettings(int heatSettings) {
        this.heatSettings = heatSettings;
    }
    public void setAutomaticShutoff(String automaticShutoff) {
        if(automaticShutoff.equals("YES")) {
            this.automaticShutoff = "Yes";
            this.price += 5.75;
        }
    }
    public int getHeatSettings() {
        if (heatSettings<1 || heatSettings>5){
            this.heatSettings=1;

        }
        return this.heatSettings;
    }
    public String getAutomaticShutoff() {
        return automaticShutoff;
    }

    @Override public void printBlanket(){
        super.printBlanket();
        System.out.println("Heat: " + this.getHeatSettings());
        System.out.println("Automatic Shutoff: " + this.getAutomaticShutoff());
    }

}
