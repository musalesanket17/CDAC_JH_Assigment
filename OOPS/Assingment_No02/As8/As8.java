import java.util.Scanner;

class Credit_Score {

  private int creditHistory;
  private double creditUtilization;
  private boolean paymentHistory;
  private double creditScore;

  public Credit_Score() {
    this(0, 0, false);
  }

  public Credit_Score(
    int creditHistory,
    double creditUtilization,
    boolean paymentHistory
  ) {
    this.creditHistory = creditHistory;
    this.creditUtilization = creditUtilization;
    this.paymentHistory = paymentHistory;
  }

  public void set_creditHistory(int creditHistory) {
    this.creditHistory = creditHistory;
  }

  public void set_creditUtilization(double creditUtilization) {
    this.creditUtilization = creditUtilization;
  }

  public void set_paymentHistory(boolean paymentHistory) {
    this.paymentHistory = paymentHistory;
  }

  int get_creditHistory() {
    return this.creditHistory;
  }

  public double get_creditUtilization() {
    return this.creditUtilization;
  }

  public boolean get_paymentHistory() {
    return this.paymentHistory;
  }

  public void Calculate() {
    System.out.println(this.paymentHistory);
    if (this.paymentHistory) {
      this.creditScore =
        (this.creditHistory * 15) + (int) (this.creditUtilization * 30) + 55;
    } else this.creditScore =
      (this.creditHistory * 15) + (int) (this.creditUtilization * 30) + 35;
  }

  double get_calculate() {
    Calculate();
    return this.creditScore;
  }
}

class As8 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println(" Plz Enter creditHistory : ");
    int cre_h = sc.nextInt();
    System.out.println(" Plz Enter creditUtilization : ");
    double cre_U = sc.nextDouble();
    System.out.println(
      " Plz Enter paymentHistory if its good then type true and if its not good then type false : "
    );
    boolean cre_P = sc.nextBoolean();

    Credit_Score c = new Credit_Score(cre_h, cre_U, cre_P);
    double res = c.get_calculate();
    System.out.println(" Your Credit_Score is " + res);
  }
}
