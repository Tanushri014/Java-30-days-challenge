package interfaces.devices;

public class Test {
    public static void main(String[] args) {

        SmartPhone sm = new SmartPhone();

        sm.makeCall("1009920123");
        sm.stopCall();

        sm.takePhoto();
        sm.takeRecord();

        sm.playMusic();
        sm.stopMusic();
    }
}