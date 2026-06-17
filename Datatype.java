//lecture number 5 
//datatypes 

//integer numbers 
//according to the capacity 
//byte
//short
//int
//long
public class Datatype {
public static void main(String[] args) {
    //CAPACITY /RANGE OF DATATYPE
    //BYTE
     System.out.println(Byte.MIN_VALUE);
     System.out.println(Byte.MAX_VALUE);

     //SHORT
     System.out.println(Short.MIN_VALUE);
     System.out.println(Short.MAX_VALUE);

     //Int
     System.out.println(Integer.MIN_VALUE);
     System.out.println(Integer.MAX_VALUE);

     //Long
     System.out.println(Long.MIN_VALUE);
     System.out.println(Long.MAX_VALUE);
//decimal 
//float
//double
float mySalary=12345.123456f;
//float makes round figure
//double keeps the precision 
double yoursalary=123.12345678;
System.out.println(mySalary);
System.out.println(yoursalary);

//char

//single character value in single quote
char  letter='t';
System.out.println(letter);

//in memory this will be stored as ascii numer 
//this is called as typecasting 
System.out.println((int)letter);

//limits 
 System.out.println((int)Character.MIN_VALUE);
System.out.println((int)Character.MAX_VALUE);

char heart_symbol=(char)10084;
System.out.println(heart_symbol);

//unicode representaion 
char heart='\u2764';
System.out.println(heart);
//string 

String name="tanushri";
System.out.println(name);


//boolean 

boolean state=false;
System.out.println(state);



//type casting 


//if we are storing the long values in small dataytypes then we have to manually change the type 
//otherwise small data can be easily stored in the long one 

//widening automatic conversion done by java of one data type into another one 
int a=10;
System.out.println(a);
long b=a;
System.out.println(b);
float c=a;
System.out.println(c);

//manual conversion is known as
//narrowing conversion  
float f=1.7f;
int d=(int)f;
System.out.println(d);
//1 byte=8 bits
/**
 * byte=1 byte
 * short=2 byte
 * int=4byte
 * long=8byte
 * float=4byte
 * double=8 byte
 * 
 * 
 * 
 * 
 */






    }
    //string is a class and it it a non -primitive 
   //String datatype-sequence of datatypes 

   String name=new String("INDIA");
   //name is the reference and india is a value 
   String name2="radha";

/**
 * what is the difference between strings created by new keyword and just a simple creation of string 
 * with new keyword the space reserved in heap is different 
 inside stringpool 

*/







    //naming variables 
    /**
     * Meanigful name
     * cannot use numbers at start
     * special symbols are not allowed
     * only _,$ are   allowed 
     * cannot use java keyword as variable name 
     * camelcase--first name small and starting letter of other names is capital 
     * snake case----all names start with small case 
     * --case sensitive
     */

}







