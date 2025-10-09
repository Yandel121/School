public class VoiceMessage extends Message {
    private double messageLength;//per minute
    public double getMessageLength(){
        return messageLength;
    }
   public void setMessageLength(double messageLength) {
        this.messageLength+=messageLength;
    }

    @Override public double getMessagePrice(){
        return this.messageLength*0.4;
    }
    @Override public void displayMessagePrice(){
        super.displayMessagePrice();
        System.out.println("Message Length: "+this.getMessageLength());
    }




}
