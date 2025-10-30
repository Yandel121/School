public class Electric_Blanket extends Blanket {
    private int heatSettings;
    private String automaticShutoff;
    public Electric_Blanket(){
        this.heatSettings=1;
        this.automaticShutoff= "NO";
    }
    public void setHeatSettings(int heatSettings) {

        if (heatSettings<1 || heatSettings>5){
            this.heatSettings=1;

        }
    }
    public void setAutomaticShutoff(String automaticShutoff) {

        if(automaticShutoff.equalsIgnoreCase("Yes"))
        {
            if (!this.automaticShutoff.equalsIgnoreCase("Yes")) {
                this.price += 5.75;
            }
            this.automaticShutoff="Yes";
        }else{
            this.automaticShutoff="No";
        }
    }
    public int getHeatSettings() {
        return heatSettings;
    }
    public String getAutomaticShutoff() {
        return automaticShutoff;
    }

    @Override public String toString(){
        return super.toString()+ "\n"+"Heat Settings: "+ this.getHeatSettings()+
                "\n"+"Automatic Shutoff"+getAutomaticShutoff();
    }

}
