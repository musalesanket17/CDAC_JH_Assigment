class T_Bill{

    String Customer_name;
    long Phone_number;
    long Number_of_calls_made;
    int Duration_of_calls ;//(in minutes)
    long bill;

    T_Bill(){
    
          Customer_name = "Hulk Sharma";
          Phone_number = 98601101;
          Number_of_calls_made = 34;
          Duration_of_calls = (int)(Math.ceil(0.90));

    }
    void cal(){
        
         if(Number_of_calls_made <=100){
             bill = Number_of_calls_made * 50+1000;   
         }
         else if(Number_of_calls_made>100){
            bill = (100*50)+(Number_of_calls_made-100)*25+1000;
         }


          System.out.println(Customer_name+" your total Telephone bill with falt 10$ is :"+bill+" cent");
          System.out.println("Duration_of_calls is : "+Duration_of_calls +" min");
    }


}

class As5{
    
     public static void main(String args[]){
        
        T_Bill t=new T_Bill();
        t.cal();
         
     }
}