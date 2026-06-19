package exception;

import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        try{
            checkAge(age);
        }catch(Exception e){
            System.out.println("Problem occured");
        }
    }

public static void checkAge(int age) throws AgeException{
if(age<18){
    throw new AgeException("You are not old enough to sign in");

}
else{
    System.out.println("you are signed in ");
}

}







    public static int divide(int a,int b){
        try{
            return a/b;
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        return -1;
    }
}
//to creATE CUSTOME EXCEPTIONS WE ARE FIRST GOING TO CREATE THE CLASS OF THAT EXCEPTION AND GOING TO EXTEND EXCEPTION CLASS 
//throw to generate manul exception 
//throws in method declearation and the caller  is responsible to handle that 