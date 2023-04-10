import java.util.Scanner;
class BMI{
  
   double height;
   double weight;

   BMI(double a, double b){
    
      this.height= a;
      this.weight= b;

   }

   void set_height(double height){
      this.height = height;
   }
   void set_weight(double weight){
      this.weight = weight;
   }
   double get_height( ){
        return  this.height ;  
   }
   double get_weight( ){
        return  this.weight ;  
   }
   double calculateBMI(){
       double h = height/100;
       double res = weight / (h * h);
        
       return res;
   }



}

class As2{

    public static void main(String args[]){

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Height : ");
         double a = sc.nextDouble();
         System.out.println("Enter the weight : ");
         double b = sc.nextDouble();
           
         BMI bmi=new BMI(a,b);
         double ans=bmi.calculateBMI();
         System.out.println("Your BMI is: "+ans);

         bmi.set_height(180);
         bmi.set_weight(70);
         
         System.out.println(bmi.height);
         System.out.println(bmi.weight);
            
    }
}

