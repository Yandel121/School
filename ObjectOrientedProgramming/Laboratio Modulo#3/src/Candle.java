public class Candle {
    protected String color;
    protected double height;
    protected double price;
    public Candle(){
        this.color=color;
        this.height=height;
        this.price=price;
    }

    public String getColor(){return color;}

    public void setColor(String color){this.color=color;}

    public double getHeight(){return height;}

    public void setHeight(int height){this.height=height;}

    public double getPrice(){return this.price+=2*height;}

    public void printCandle(){
        System.out.println("Color: "+this.getColor());
        System.out.println("Height: "+this.getHeight());
        System.out.println("Price: "+this.getPrice());
    }
}


