public class TextMessage extends Message {
    private double messagelength;
    public double getMessageLength(){
        return messagelength;
    }
    public void setMessageLength( double messagelength){
        this.messagelength+=messagelength;
    }

    @Override public double getMessagePrice(){
        return this.messagelength*0.2;
    }
    @Override public void displayMessagePrice(){
        super.displayMessagePrice();
        System.out.println("Message Length: "+this.getMessageLength());
    }
}
