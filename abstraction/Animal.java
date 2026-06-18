package abstraction;


//method without body 
//just aa defination
//class has to be abstract 
//class can have concrete method and abstract method 
//all methods in class with abstract keyword has to be  override 
public abstract  class Animal {
    public  abstract void voice();


    //we cannot instatiate the abstract class
    //animal is abstract 
    //so we cant do animal a =new animal();
    //but we can use it as  parent 
    // animal dog=new dog();
}
