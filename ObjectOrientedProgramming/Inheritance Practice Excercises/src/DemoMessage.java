//File: DemoMessage.java
//Author: Yandel Colón Rivera
//Date: 10/10/2025
//Class: COMP 2400 OOP
//Description: Calculates the price of different types of messages per minutes.
public class DemoMessage {
    public static void main(String[] args) {
        Message message = new Message();
        message.setMessagePrice(100);
        message.displayMessagePrice();

        TextMessage textMessage = new TextMessage();
        textMessage.setMessageLength(100);
        textMessage.displayMessagePrice();


        VoiceMessage voiceMessage = new VoiceMessage();
        voiceMessage.setMessageLength(100);
        voiceMessage.displayMessagePrice();


        PictureMessage pictureMessage = new PictureMessage();
        pictureMessage.setMessageLength(100);
        pictureMessage.displayMessagePrice();


    }
}
