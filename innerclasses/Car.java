package innerclasses;

public class Car {
    private String model;

    private boolean isEngineOn;

    public Car(String model){
        this.model=model;
        this.isEngineOn=false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean isEngineOn) {
        this.isEngineOn = isEngineOn;
    }

    //here class engine is a inner member class of the car ..
    class Engine{
        void start(){
            if(!isEngineOn){
                isEngineOn=true;
                System.out.println("Engine is started");
            }
            else{
                System.out.println("engine is stopped ");
            }

        }

        void stop(){
            if(isEngineOn){
                isEngineOn=false;
                System.out.println("Engine is stoped");
            }
            else{
                System.out.println("engine is started ");
            }

        }
    }
}
