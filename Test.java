
public class Test {
    public static void main(String[] args) {
        // class and object
        Car c = new Car();
        c.setColor("pink");
        c.setBrand("tata");
        c.setModel("12");
        c.setSpeed(50);
        String color = c.getColor();
        System.out.println(color);

        // inheritance child---->parent
        Child ch = new Child();
        System.out.println(ch.name);

        // polymorphism
        // parent --child
        Animal an = new Dog();
        an.voice();
        // --child
        Dog d = new Dog();
        d.voice();
        // parent
        Animal a = new Animal();
        a.voice();

    }

    // triple dot are used to take multiple parameters
    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static boolean is_prime(int num) {
        int count = 0;
        for (int i = 1; i <= 13; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count==2;

    }
    boolean ans=is_prime(13);
       System.out.println(ans);
}

// how to write a methos for a multiple number of parameters ..

/**
 * //encapsulation --bundle of data feilds and methods
 * make feilds private --protects it
 * 
 * 
 * //inheritance
 * class animal parent class
 * name age
 * class cat child breed
 * so here class cat can reuse the properties
 * from animal class which is paretn class this is inheritance
 * 
 * 
 * 
 * 
 * //abstraction
 * hides internal complexity
 * 
 * 
 * //polymorphism
 * animal parent class
 * cat is child
 * dog is also child
 * animal dog=new dog();
 * 
 * 
 * 
 * 
 * //method is a set of line used to perform some action or work
 * i need addition and i have to code multiple times for that ,,,
 * i can write code once and call it again and again
 * 
 * acess modifier return type methodname(parameters){
 * }
 * public int add(int a,int b){
 * return a+b;
 * }
 */

/*
 * method overloding--same method name but different number of parameters
 * method overirding ---same return type and same number of parameters
 */
