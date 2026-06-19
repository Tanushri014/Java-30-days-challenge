package innerclasses;

public class Computer {
    private String brand;
    private String model;
    private Os os;

    public Os getOs(){
        return os;
    }
//static class 
    static class USB{
    private String type;

    public USB(String type) {
        this.type = type;
    }

    }
    public Computer(String brand, String model,String osName) {
        this.brand = brand;
        this.model = model;
        this.os=new Os("mac");
       
    }
    class Os{
        private String osName;
        public Os(String osName) {
        this.osName = osName;
    }
    public void displayInfo(){
        System.out.println("display method ");
    }
       
    }
    
    

}
