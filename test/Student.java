package test;

public class Student {

    //final is used to make variables ,methods classes final and should not be changed .
    //final values has to be initalised 
    //we cannot extend final class .
    //constructor can never be final 
private static final double pie;
static{
    pie=3.14;
}
    public static int count=0;
    public Student(){
        count++;
    }
    private int id;
    private int age;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static int getCount(){
        return count;
    }
    
}
