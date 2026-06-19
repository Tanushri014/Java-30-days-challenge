package interfaces.example;


//class is blueprint for object 
//but interface is blueprint for class

//abstract class can have both the abstract and concrete methods but interfaces have only 
//abstract method and static constant 

//java 8 version java interfaces can have static and default method  
//interfaces are public abstract 
public  interface Animal{
//variable are public static final 
 int age=150;
    public abstract void eat();
    void sleep();
public static void info(){
    System.out.println("this is a Animal Interface");
}

//the static methods in interface can be acessed by interface name only and cannot be acessed by the implementation class .
public default void run(){
    System.out.println("this is the  default method ");
}
} 
    

