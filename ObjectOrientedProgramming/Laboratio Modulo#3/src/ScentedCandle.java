public class ScentedCandle extends Candle {
    private String scent;
    public void ScentedCandle(){
        this.scent=scent;
    }
    public String getScent(){
        return scent;
    }
    public void setScent(String scent){
        this.scent=scent;
    }
    @Override public void printCandle(){
        super.printCandle();
        System.out.println("Scent: "+this.getScent());
    }
    @Override public double getPrice(){
       return price+=3*height;
    }
}
