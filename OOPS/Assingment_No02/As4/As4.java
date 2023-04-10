class ElectricityBill{

    String customerName ;
    double unitsConsumed ;
    double billAmount ;

    ElectricityBill(){

        customerName  = "Batman";
        unitsConsumed = 149;

    }

    void set_name_unit(String customerName,double unitsConsumed){
        this.customerName=customerName;
        this.unitsConsumed=unitsConsumed;
    }
    void calculateBillAmount(){
        // For the first 100 units: Rs. 5 per unit
        // For the next 200 units: Rs. 7 per unit
        // For the remaining units: Rs. 10 per uni
         
         
            if(unitsConsumed<=100){
                 billAmount=100*5 ;
                
            }
            else if( unitsConsumed<=200){
                  
                 billAmount=100*5 +(unitsConsumed-100)*7;
            }
            else if(unitsConsumed<=300){
                 billAmount=(100*5)+(100*10)+(unitsConsumed-200)*10;
            }
            else if(unitsConsumed>300){
                billAmount =(100*5)+(100*7)+(100*10)+(unitsConsumed-300)*12;
            }
         System.out.println(customerName+" your toatal bill_Ammount is : "+billAmount);
    }
}

class As4{

    public static void main(String args[]){
          
          ElectricityBill e = new ElectricityBill();
          e.calculateBillAmount();
          e.set_name_unit("Halk",340);
          e.calculateBillAmount();

    }
}

