public class TeeShirt {
    protected double orderNumber;
    protected String size;
    protected String color;
    protected double price;
    public TeeShirt(){
        this.orderNumber=orderNumber;
        this.size=size;
        this.color=color;
        this.price=price;
    }
    public double getOrderNumber(){return orderNumber;}

    public void setOrderNumber(double orderNumber){this.orderNumber=orderNumber;}

    public String getSize(){return size;}

    public void setSize(String size){this.size=size;}

    public double getPrice(){
        if(size.equals("S") || size.equals("M") || size.equals("L")) {
            this.price=19.99;
        }else if(size.equals("XXL") || size.equals("XXXL")) {
            this.price=22.99;
        }else{
            System.out.println("Invalid Size");
            this.price=0;
        }
        return this.price;
    }

    public String getColor(){return color;}

    public void setColor(String color){this.color=color;}

    public void printTeeShirt(){
        System.out.println("Order Number: "+this.getOrderNumber());
        System.out.println("Size: "+this.getSize());
        System.out.println("Color: "+this.getColor());
        System.out.println("Price: "+this.getPrice());
    }
}
