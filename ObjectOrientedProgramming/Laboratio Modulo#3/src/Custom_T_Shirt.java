public class Custom_T_Shirt extends TeeShirt {
    private String slogan;
    public void Custom_T_Shirt(){
        this.slogan=slogan;
    }
    @Override public void printTeeShirt(){
        super.printTeeShirt();
        System.out.println("Slogan: "+this.getSlogan());
    }
    public String getSlogan(){
        return slogan;
    }
    public void setSlogan(String slogan){
        this.slogan=slogan;
    }
}
