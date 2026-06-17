package encapsulation;

public class Student {
    // properties

    // variables declared inside the class are called as instance variables and the
    // variables declared
    // inside the method are called as local variables

    //anyone can directaly modify data so that why we make it private so we can tget it or set it a so we create getter and setters 
    String name;
    int roll_number;
    int age;

    public void read() {
        System.out.println("reading");
    }

    public void setAge(int age){
        if(age<0){
            age=0;
        }
        else{
            //this refers to the object 
            this.age=age;
        }


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

    public int getAge(){
        return this.age;
    }

}
