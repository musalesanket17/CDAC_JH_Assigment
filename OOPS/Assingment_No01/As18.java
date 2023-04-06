/*
   18. Write a program to find minimum and maximum number
    as well as to add two integer numbers using methods of Integer.
*/


  class As18{

    static void add(int a,int b){

        System.out.println(a+b);
        
    }
     
      public static void main(String args[]){

          int arr[] = new int[]{12,234,34,43,53};

          int min=Integer.MAX_VALUE;
          int max=0;

          for(int i=0;i<arr.length;i++){
               
                if(arr[i]>Integer.MIN_VALUE && arr[i]>max){
                       
                       max=arr[i];
                }

          }
          System.out.println(max);


          for(int j=0;j<arr.length;j++){
               if(arr[j] < min   ){
        
                 min=arr[j];
       }
          }
          System.out.println(min);

         As18.add(min,max);
      }
  
     

  }