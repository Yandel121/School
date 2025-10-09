public class Message {
    protected double messagePrice;
    public double getMessagePrice(){
        return messagePrice;
    }
    public void setMessagePrice( double messagePrice){
        this.messagePrice=messagePrice;
    }

    public void displayMessagePrice(){
        System.out.println("Message Type: "+this.getClass().getSimpleName());
        System.out.println("Message Price: "+this.getMessagePrice());
    }
    public double calculateMessagePrice(){
        return this.getMessagePrice();
    }

}
