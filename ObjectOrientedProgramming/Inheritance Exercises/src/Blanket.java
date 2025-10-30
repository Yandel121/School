public class Blanket {
    protected String size;
    protected String color;
    protected String material;
    protected double price;
    private final double BASEPRICE=30.00;
    public Blanket(){
        this.size="Twin";
        this.color="White";
        this.material="Cotton";
        this.price=BASEPRICE;
    }
    public String getSize(){
        return size;}


    public void setSize(String size){
        if(size.equals("Twin")|| size.equals("Double")|| size.equals("Queen")|| size.equals("King")){
            this.size=size;
        }else {
            // If size invalid, reset to default values
            this.size="Twin";
            this.color="White";
            this.material="Cotton";
        }
        setPrice(price);


        }

    public String getColor(){return color;}
    public void setColor(String color){ this.color=color;}
    public String getMaterial(){return material;}
    public void setMaterial(String material){
     if (material.equals("Cotton")|| material.equals("Wool")|| material.equals("Cashmere")){
         this.material=material;
     } else {
         this.size="Twin";
         this.color="White";
         this.material="Cotton";
     }
        setPrice(price);
    }
    public double getPrice(){return price;}
    public void setPrice(double price){
        this.price=BASEPRICE;
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

                break;
        }

        switch(this.material) {
            case "Wool":
                this.price += 20.00;
                break;
            case "Cashmere":
                this.price += 45.00;
                break;
            default:
                break;
        }



    }
    public String toString(){
        return "Size: "+this.getSize()+
                "\nColor: "+this.getColor()+
                "\nMaterial: "+this.getMaterial()+
                "\nPrice: "+ this.getPrice();
    }
}