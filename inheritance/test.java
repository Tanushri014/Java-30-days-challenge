package inheritance;

public class test {

    public static void main(String[] args) {
        Animal a = new Animal("grandpa", 80);
        System.out.println(a.getAge());
        a.getName();

        Dog d = new Dog("father", 40, "golden retriever");
        d.getAge();
        d.getName();
        d.getBreed();
        Moti m = new Moti("son", 10,"jerman shepard ");

        m.getAge();
        m.getName();
        // the parent constructor will be called first when child object is created
        // the first statement in child class constructor is super statement but with no
        // arguments

        // we can call super.method in any other method in child and we can write it
        // anywere no complsion as such first statement

    }
}


//multple inheritance 
//a child class cannot extend two classes at the same time ...
//ambuiguty 
//java does not  support multiple inheritance with the help of classes 