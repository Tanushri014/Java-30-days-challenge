package pack;
import pack2.Cat;
//used to group the data of same type all related files are kept here
public class test {
    public static void main(String[] args) {
        pack.Cat c=new pack.Cat();//current package
        Cat cat=new Cat();//imported package 
        c.eat();
        cat.data();
    }
}
//package is first stateement 
//package can have subpackage 
//java .lang package is automatically imported 
