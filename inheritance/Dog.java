package inheritance;

public class Dog extends Animal {
    private String breed;
    public Dog(String name,int age,String breed){
        super(name,age);
        this.breed=breed;
        
        System.out.println("father constructor called ");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    //override
    @Override
    public void sayHello(){
        System.out.println("Father");
    }
    
}
