public class PictureMessage extends Message {
    private double messagelength;
    public double getMessageLength(){
        return messagelength;
    }
    public void setMessageLength(double messageLength){
        this.messagelength=messageLength;
    }

    @Override public double getMessagePrice(){
        return this.messagelength*0.1;
    }
    @Override public void displayMessagePrice(){
        super.displayMessagePrice();
        System.out.println("Message Length: "+this.getMessageLength());
    }

    }

