class Operators{
    public static void main(String[] args) {
        //operaors
        //arithmetic 
        /**
         * +,-,*,/,%
         */
        //if we are using two different datatypes then output will be in biggere datatype 
        int a=3;
        double b=9.5;
        double c=a+b;
        System.out.println(c);
//java follows the bodmass rule 
//same pripority left to right 


int k=7;
k+=1;
System.out.println(k);
//k=k+1;
//compund assignment operator performs casting automatically 

//increment decrement operators have high priority that arithmetic operators

//post increment/decrement 
int f=4;
//before modification
System.out.println(f--);//f=4,f=3
System.out.println(f++);//f=3,f=4
//pre increement /decreement
//after modification 
System.out.println(--f);//f=3,f=3
System.out.println(++f);//f=4,f=4

//bitwise operators 
int h=9;
System.out.println(Integer.toBinaryString(h));

//and &
//or |

int four=4;
int five=5;
int and=four&five;//both bits has to be one
int or=four | five;//one of the bit has to be one
int xor=four ^ five;//both bits has to be diffenrent 
int neg=~five;//sign is changes with one increement one complement 

System.out.println(and);
System.out.println(or);
System.out.println(xor);
System.out.println(neg);
//4 =    100
//5 =    101
//ans  =100 //bitwise and 


//left shift 
int num1=5;
System.out.println(num1);
System.out.println(Integer.toBinaryString(num1));//101
int l=a<<1;
System.out.println(l);//1010
System.out.println(Integer.toBinaryString(l));
//right shift
int num2=5;
System.out.println(num2);
System.out.println(Integer.toBinaryString(num2));//101

int s=num2 >> 1;
System.out.println(Integer.toBinaryString(s));
System.out.println(s);//0101
//right shift

//relations /conditional
/**
 * >
 * <
 * >+
 * <=
 * ++
 * !+
 */

//logiacal 
/**
 * &&
 * ||
 * !
 */

        
    }
}