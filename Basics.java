//placement prep 

//JDK -java development kit 
//jdk is a built in set of libraries to write java 
//there are multiple versions of jdk available some  are paid some are free .
// but we are using sun microsystems free open source version of java 
//open jdk is standard 
//after installing the jdk set the environment variables where we can set the path and complie in cmd 

//how file  runs 
//jdk tools and libraries 
//jre-java runtime environment 
//jvm--java virtual machine 


//file.java 
// compilation file.javac
//bytecode is bytecrypted file that humans cant undesrtand but jvm can and thi sprovides the security 
//bytecode make it platform independedn
// interpretation jvm ---converts into machin code ...
//machine code is platform dependent 

//

//compilation is first 
//interprete is slow because it scan the entire file parse and then group the instructions into group thats why jvm is slow 

//in interpretation there is just in time compiler which copiles the code that it thinks is gonna be usful again and again .
//
/** 
 * ---------------------|
 *               jdk       |
 * ---------------|     |
 *           jre  |     |
 * ----------|    |     |
 *   jvm     |    |
 * ----------|    |
 *                |
 *----------------|

//how to run files
javac filename.java

java filename 

*/
//the class name and file name has to be same 

class Basics{
    public static void main(String args[]){
        System.out.println("hello world");
        //if using below line pass the arguments while manually compiling the file 
        System.out.println(args[0]);//commandline arguments 
    }
}

/**
 * everything in java is based on the classes 
 * class is a bluprint to define the object 
 * public static void main is the main method acts as entry point 
 * void is a return type 
 * public is a acess modifirer that a method can be acessed from outside of the class .
 * static indicates this method belongs to the class rather than to a instace of the class 
 * 
 * string [] args 
 * this method acts as a string parameters .help in passing the command line arguments 
 * system class in java .lang package helps in acessing the system methods 
 * out instance of printstream class represents the standard output 
 * println -methos to print 
 *   ; is crusial to tell java the end of statement 
 * 
 * 
 */