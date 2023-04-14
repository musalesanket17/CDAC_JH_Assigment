import java.util.Scanner;
class Toll{
  private String Vehicle_type ;
  private int Number_of_axles ; 
  private double Distance_Information;
  private double tollFee;
  private double totalAmountDue;

  public void set_vehicle_type(String Vehicle_type){
      this.Vehicle_type = Vehicle_type;
  } 
  public void set_Number_of_axles(int Number_of_axles){
      this.Number_of_axles = Number_of_axles;
  }
  public void set_Distance_Information(double Distance_Information){
      this.Distance_Information =Distance_Information;
  }
  public void set_tollFee(double tollFee){
       this.tollFee = tollFee; 
  }
  public void set_totalAmountDue(double totalAmountDue){
      this.totalAmountDue=totalAmountDue+2;
  }
  public void Generate_bill(){
        System.out.println("For "+ this.Vehicle_type+ " You have to pay  "+(this.totalAmountDue + this.tollFee) + " amoumt of toll for "+this.Distance_Information + " KM " );
  }
  public void calculate_fee(){
    System.out.println(this.Vehicle_type);
        // if(this.Vehicle_type == "car" || this.Vehicle_type == "van" || this.Vehicle_type == "bus"){
            set_tollFee((0.50)*(this.Distance_Information));
        // }
        // else if(this.Vehicle_type == "trucks"){ 
            //  set_tollFee((2)*(this.Distance_Information));
        // }
  }
}


 class Menu{
    
     Scanner sc = new Scanner(System.in );

     Toll t = new Toll();
     public int list(){

             System.out.println("Enter vehicle type EX : car, van the press 1 "  );
             System.out.println("Enter number of axles  then press 2");
             System.out.println("Enter distance travelled  then press 3");
             System.out.println("If you want  Calculate toll fee  then press 4");
             System.out.println("If you want  Generate bill  then press 5");
             System.out.println("If you want to exit then press 0");

             int choice = sc.nextInt();

             return choice;
     }

    public void menu(){
           int choice ;
        while((choice = list()) != 0){

          switch(choice){
           
             case 1 : System.out.println("Enter vehicle type EX : car, van");
                       sc.nextLine();
                       t.set_vehicle_type(sc.nextLine());
                       break;
            case 2 : System.out.println("Enter number of axles");
                    t.set_Number_of_axles(sc.nextInt());
                    break;
            case 3 : System.out.println("Enter distance travelled ");
                   t.set_Distance_Information(sc.nextInt());
                   break;
            case 4: t.calculate_fee();
                     break;
            case 5: t.Generate_bill();
            break;
            default: System.out.println("Plz Enter Valid Inforamtion :) ");
            break; 
            
                 
          }
     }
    }
 }

class As7{

  public static void main(String args[]){
     Menu m = new Menu();
     m.menu();
  }
   
}

