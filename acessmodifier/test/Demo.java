package acessmodifier.test;

public class Demo {
    private static Demo demo;
    private Demo(){

    }
    //singlton pattern  only one object of that class .
    public static Demo getInstance(){
        if(demo==null){
            demo=new Demo();

        }
        return demo;
    }
}
