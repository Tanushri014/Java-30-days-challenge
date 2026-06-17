public class loops {
    public static void main(String[] args) {
        //for
        for(int i=1;i<10;i++){
            System.out.println("hello");
        } 


        
        //while
        int k=1;
        while(k<5){
            System.out.println("while");
            k=k+1;
        }
        //do -while
        do{
            System.out.println("do");

        }while(false);




        //table of 7
        for(int i=1;i<=10;i++){
            System.out.printf("%d * 7 = %d \n",i,i*7);
        } 
        //sum of first 10 numbers
        int a=0;
        int sum=0;
    while(a<=10){
        sum+=a;
a++;
    }
    System.out.println(sum);

        //count digits of number
int num=1234;
int count=0;
while(num>0){
    
    num=num/10;
    count++;
}
System.out.println(count);



// factorial of number
int number=4;
int fact=1;
for(int i=1;i<=number;i++){
fact=fact*i;

}
System.out.println("factorial of number"+ number +" = is : "+fact);


//brak pass continue

//continue --only that iterstion is skipped
int j=1;
while(j<10){
    if(j==5){
        j++;
        continue;
        
    }
    System.out.println(j);
    j++;
    
}
// all iteration after break will be stopped 
int n=1;
while(n<10){
    if(n==5){
       
        break;
    }
    System.out.println(n);
     n++;
}
   
    

//patterns
//contineous pattern
System.out.println("straight pattern");
 for(int i=1;i<=5;i++){
            for(int l=1;l<5;l++){
System.out.print('*');
            }
            System.out.println();
        } 
//triangular
System.out.println("triangular pattern");
        for(int i=1;i<=5;i++){
            for(int l=1;l<i;l++){
System.out.print('*');
            }
            System.out.println();
        } 

        //inverted triangular 
System.out.println(" inverted triangular pattern");
        for(int i=5;i>1;i--){
            for(int l=1;l<i;l++){
System.out.print('*');
            }
            System.out.println();
        } 










    }
}
