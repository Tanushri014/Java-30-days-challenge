package test;

public class Test {
    public static void main(String[] args) {
        Student st1= new Student();
        Student st2= new Student();
        Student st3= new Student();
        Student st4= new Student();
        Student st5= new Student();
st1.setAge(18);
System.out.println(st1.getAge());
//here we have acessed the count variable with the class name 
System.out.println(Student.count);

System.out.println(st1.getCount());
    }
    
}
//static blocks are used to right one time setup peroperties 
//static memebers cannot call non static methods and  variables 
//this and super are not used in static as this and super refers to the object and static belongs to the class 
//static stores its previous information 
//attached to class than to a object 
