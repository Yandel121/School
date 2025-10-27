public class Blanket {
    protected String size;
    protected String color;
    protected String material;
    protected double price;
    public Blanket(){
        this.size="Twin";
        this.color="White";
        this.material="Cotton";
        this.price=30.00;
    }
    public String getSize(){return size;}
    public void setSize(String size){
        if(size.equals("Double"))
            this.size+=10;

        if (size.equals("Queen"))
        this.size+=25;
        this.size=size;
        if(size.equals("King"))
            this.size+=40;
    }
    public String getColor(){return color;}
    public void setColor(String color){ this.color=color;}
    public String getMaterial(){return material;}
    public void setMaterial(String material){
        this.material=material;}
    public double getPrice(){return price;}
    public void setPrice(double price){this.price=price;}
    public void printBlanket(){
        System.out.println("Size:"+this.getSize());
        System.out.println("Color: "+this.getColor());
        System.out.println("Material: "+ this.getMaterial());
        System.out.println("Price: "+this.getPrice());
    }

}
