package interfaces.devices;

public class SmartPhone implements Camera, MusicPlayer, Phone {

   
    public void takePhoto() {
        System.out.println("Taking photo...");
    }

    
    public void takeRecord() {
        System.out.println("Recording video...");
    }

  
    public void playMusic() {
        System.out.println("Playing music...");
    }

 
    public void stopMusic() {
        System.out.println("Stopping music...");
    }

    
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

  
    public void stopCall() {
        System.out.println("Call ended");
    }
}