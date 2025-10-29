public class Blanket {
    protected String size;
    protected String color;
    protected String material;
    protected double price;
    protected  double basePrice;
    public Blanket(){
        this.size="Twin";
        this.color="White";
        this.material="Cotton";
        this.price=30.00;
    }
    public String getSize(){
        return size;}


    public void setSize(String size){
        this.size=size;

        switch(size) {
            case "Double":
                this.price += 10.00;
                break;
            case "Queen":
                this.price += 25.00;
                break;
            case "King":
                this.price+= 40.00;
                break;
            default:
                System.out.println("Try again");
                break;
        }

        }

    public String getColor(){return color;}
    public void setColor(String color){ this.color=color;}
    public String getMaterial(){return material;}
    public void setMaterial(String material){
        if (material.equals("Cotton")) {
            this.material="Cotton";
            this.price+= 20.00;
        }

        if (material.equals("Cashmere")){
            this.material="Cashmere";
            this.price+= 45.00;
        }
    }
    public double getPrice(){return price;}
    public void setPrice(double price){this.price=price;
        setSize(size);
        setMaterial(material);


    }

    public void printBlanket(){
        System.out.println("Size:"+getSize());
        System.out.println("Color: "+getColor());
        System.out.println("Material: "+ getMaterial());
        System.out.println("Price: "+getPrice());
    }

}
