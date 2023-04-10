import java.util.Scanner;

class Bank {

  private String Account_holder_name;
  private int Account_number;
  private double Account_balance;

  public void set_Account_holder_name(String Account_holder_name) {
    this.Account_holder_name = Account_holder_name;
  }

  public void Set_Create_a_new_account(int Account_number) {
    this.Account_number = Account_number;
  }

  public void Set_Deposit_money_into_an_account(int Account_balance) {
    this.Account_balance += Account_balance;
  }

  public void Withdraw_money_from_an_account(int Withdraw_money) {
    this.Account_balance -= Withdraw_money;
  }

  public double get_Display_the_account_balance() {
    return this.Account_balance;
  }

  public int get_Display_Account_number() {
    return this.Account_number;
  }

  public String get_Display_Account_holder_name() {
    return this.Account_holder_name;
  }
}

class Display_data {

  Bank b = new Bank();
  static Scanner sc = new Scanner(System.in);

   void Display_the_account_holder_information() {
    System.out.println(
      " Account Holder Name is : " +
      b.get_Display_Account_holder_name() +
      " - Account Number " +
      b.get_Display_Account_number() +
      " - Amount " +
      b.get_Display_the_account_balance()
    );
  }

  void Set_All_Field() {
    System.out.print("Enter Your Name : ");
    b.set_Account_holder_name(sc.nextLine());
    System.out.print("Enter Your Account Number :");
    b.Set_Create_a_new_account(sc.nextInt());
    System.out.print("Enter Amount which you want to deposite : ");
    b.Set_Deposit_money_into_an_account(sc.nextInt());
  }

  static int list() {
    int choic;
    System.out.println(" If you want to Add Balance in account then press 1 ");

    System.out.println(" If you want to Debite amount then press 2 ");

    System.out.println(" If you want to View balance then press 3 ");

    System.out.println(
      " If you want to View whole account detail then press 4 "
    );

    System.out.println(" If you want to Exit then press 0  ");
    choic = sc.nextInt();
    return choic;
  }

  void menu() {
    int choice;
    while ((choice = Display_data.list()) != 0) {
      switch (choice) {
        case 1:
          System.out.print(" Enter the Amount : ");
          b.Set_Deposit_money_into_an_account(sc.nextInt());
          break;
        case 2:
          System.out.print(" Enter Amount to deposite : ");
          b.Withdraw_money_from_an_account(sc.nextInt());
          break;
        case 3:
          b.get_Display_the_account_balance();
          break;
        case 4:
           Display_the_account_holder_information();
          break;
        default:
          System.out.println(" PLz Enter Valid Ans : ");
          break;
      }
    }
  }
}

class As6 {

  public static void main(String args[]) {
    Display_data d = new Display_data();
    d.Set_All_Field();
    d.Display_the_account_holder_information();
    d.menu();
  }
}
