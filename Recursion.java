public class Recursion {
    public static void main(String[] args) {
        // the method which call itself
        // base case is important

        // int number = 4;
        // int fact = 1;
        // for (int i = 1; i <= number; i++) {
        // fact = fact * i;

        // }
        // System.out.println("factorial of number" + number + " = is : " + fact);
        System.out.println(factorial(5));
     System.out.println(sum(5));
    }

    int fact;

    public static int factorial(int number) {
        if (number == 1) {
            return number;
        }
        return number * factorial(number - 1);

    }
    //call stack is a part of memory stack which waits till all the task 
    //as long as task is not completed the task remains in stack 
    //so the recursion is time and memory space 


    // sum of n numbers

    public static int sum(int k){
        if(k==1){
            return k;
        }
        return k+=sum(k-1);
    }



}
