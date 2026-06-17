public class Conditional {
    public static void main(String[] args) {
        //relational operators 
        //comparison
        char a='a';
        char b='b';
        System.out.println(a==b);
        System.out.println(a>b);

//if else 

int age=18;
String country="India";
if(age>18 && country=="India"){
    System.out.println("you are eligible do drive in india");
}
else if(age==18){
    System.out.println("wait for a year");
}
else{
    System.out.println("you are not eligible");
}



//switch statement 
char op='+';
switch(op){
    case '+':
        System.out.println("operation is addition");
        break;
    case '-':
        System.out.println("operation is sub");
         break;
    case '*':
        System.out.println("operation is multi");
        break;
     case '/':
        System.out.println("operation is div");
         break;
    }


    }
}
