/*
  1. Date and Time Converter
*/
import java.util.Scanner;
class Accept{

      int day;
      int month;
      int year;
      int time_in_Hr;
      int time_in_Min;
      int time_in_Sec;

    void acp(){
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter Perticular Day in month :");
          day=sc.nextInt();
           System.out.println("Enter Perticular month in Year :");
          month=sc.nextInt();
          System.out.println("Enter Year :");
          year=sc.nextInt();
          System.out.println("Enter Perticular Time_in_Hr in Day in 24 Formate :");
          time_in_Hr=sc.nextInt();
          System.out.println("Enter Perticular min in Hr :");
          time_in_Min=sc.nextInt();
          System.out.println("Enter Perticular Sec in min :");
          time_in_Sec=sc.nextInt();

          
    }

    void pattern(){

        
        Scanner sc = new Scanner(System.in);
       

        System.out.println("If you want to print in this pattern:  dd/mm/yyyy (e.g., 31/12/2022) then press '1'");
        System.out.println("If you want to print in this pattern:  mm/dd/yyyy (e.g., 12/31/2022) then press '2'");
        System.out.println("If you want to print in this pattern:  yyyy/mm/dd (e.g., 2022/12/31) then press '3'");
        System.out.println("**************************************************************************************");

        System.out.println("If you want to print in this pattern in time:  hh:mm:ss (e.g., 23:59:59) then press '4'");
        System.out.println("If you want to print in this pattern in time:  hh:mm:ss a (e.g., 11:59:59 PM) then press '5'");
        System.out.println("If you want to print in this pattern in time:  hh:mm (e.g., 23:59) then press '6'");
        System.out.println("**************************************************************************************");
 
        System.out.println("If you want to print in this pattern :  dd/mm/yyyy hh:mm:ss (e.g., 31/12/2022 23:59:59) then press '7'");
        System.out.println("If you want to print in this pattern :  mm/dd/yyyy hh:mm:ss a (e.g., 12/31/2022 11:59:59 PM) then press '8'");
        System.out.println("If you want to print in this pattern :  yyyy/mm/dd hh:mm (e.g., 2022/12/31 23:59) then press '9'");

        int pattern_type=sc.nextInt();
        switch(pattern_type){

            case 1:System.out.println(day+"/"+month+"/"+year);break;
            case 2:System.out.println(month+"/"+day+"/"+year);break;
            case 3:System.out.println(year+"/"+month+"/"+day);break;
            case 4:System.out.println(time_in_Hr+":"+time_in_Min+":"+time_in_Sec);break;
            case 5:System.out.println(time_in_Hr+":"+time_in_Min+":"+time_in_Sec);break;
            case 6:System.out.println(time_in_Hr+":"+time_in_Min);break;
            case 7:System.out.println(day+"/"+month+"/"+year + " " + time_in_Hr+":"+time_in_Min+":"+time_in_Sec);break;
            case 8:System.out.println(day+"/"+month+"/"+year + " " + time_in_Hr+":"+time_in_Min+":"+time_in_Sec);break;
            case 9:System.out.println(day+"/"+month+"/"+year + " " + time_in_Hr+":"+time_in_Min);break;

        }



    }
}

class As1{

    public static void main(String args[]){
        
        Accept a1=new Accept();
        a1.acp();
        a1.pattern();
    }
}
