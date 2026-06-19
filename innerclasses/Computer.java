package innerclasses;

public class Computer {
    private String brand;
    private String model;
    private Os os;

    public Os getOs(){
        return os;
    }
public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setOs(Os os) {
        this.os = os;
    }
    //static class 
    static class USB{
    private String type;

    public USB(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
    public String getOsName() {
            return osName;
        }
        public void setOsName(String osName) {
            this.osName = osName;
        }
    public void displayInfo(){
        System.out.println("display method ");
    }
       
    }
    
    

}
