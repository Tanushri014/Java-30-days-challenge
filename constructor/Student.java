package constructor;

// constructor has  a same name class name 
// it does not have return type 
// it is used to initalised the objects

// types of constructors
// defult created by java 
// custome-paramatarised cunstructor  
public class Student {

    private String name;
   private  int roll_number;
   private int age;
   //constructor overloading 
 public Student(int roll_number, int age) {
        this.age = age;
        this.roll_number = roll_number;
    }
    public Student(String name, int roll_number, int age) {
        this.age = age;
        this.name = name;
        this.roll_number = roll_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
