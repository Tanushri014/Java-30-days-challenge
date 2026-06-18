package polymorphism;

public class Calculator {

    //method overloading 
    public int add(int a,int b){
        return a+b;
    }

    //method overloading 
    public int add (int a,int b ,int c){
        return a+b+c;
    }
//compile type polymorphism 
//many forms
//at compi,l type it will be decided which method to call 
    //method overloading 
    public double add (double a,double b){
        return a+b;
    }
    
}

//dynamic methodd dispatch-method overriding 
//Animal dog=new Dog();//by doing this we can only acess the methods present in animal parent class only 
 // Dog d=new Dog() here we can acess all the methods present in the dog only  

class Main{
    public static void main(String[] args) {
        Calculator c =new Calculator();
        System.out.println(c.add(4,5));
        System.out.println(c.add(4,5,6));
        System.out.println(c.add(4.7,5));

    }
}