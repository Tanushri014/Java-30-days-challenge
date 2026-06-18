package inheritance;



//Moti inherites from dog and dog inherites from animal multilevel inheritance  
public class Moti extends Dog{


    public Moti(String name,int age,String breed){
        super(name,age,breed);
         System.out.println("child constructor called ");
    }

    @Override
    public void sayHello(){
        System.out.println("son");
    }
}
