public class Array {
    public static void main(String[] args) {
        // collection of similar thype of data

        // reference is in stack but actual value is in heap
        // 0 based index
        int arr[] = new int[5];
        // all values are zero as we have not specified values
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        arr[3] = 10;
        int arr1[] = { 1, 2, 3, 4 };
System.out.println(arr1);//hashcode 

//foreach loop it works only on array ,collection 
for(int i :arr1){
    System.out.println(i);
}



//search element in an array 
int search=7;
for(int i :arr1){  
if(i==search){
  System.out.println("found");
}
else{
    System.out.println("not found");
}

}

//find maximum element 
int max=arr1[0];
for(int i:arr1){
    if(i>max){
        max=i;
    }
}


System.out.println(max);



//find sum of array
int sum=0;
for(int i:arr1){
sum+=i;
}
System.out.println(sum);

//2dimension 
int arr2d[][]=new int[3][3];
arr2d[0][0]=1;
int [][] matrix={
    {1,2,3},
{1,2,3},
{4,5,6}
};

System.out.println(matrix[1][2]);
/**
 * +-+-+-+-+-+-
 * |0 | 0 | 0 |
 * +-+-+-+-+-+-
 * |0 | 0 | 0 |
 * +-+-+-+-+-+-
 * |0 | 0 | 0 |
 * +-+-+-+-+-+-
 */
//2dd array is array of arrays 
//jagged array is one when we do noy have the equal number of  rows and columns 

char carr[][]=new char[3][];

carr[0]=new char[2];//length of first row
carr[1]=new char[3];
carr[2]=new char[2];
carr[0][0]='a';
carr[0][1]='c';
carr[1][0]='d';
carr[1][1]='e';
carr[1][2]='f';
carr[2][0]='g';

carr[2][1]='h';




    }
}
