import java.util.*;
class BankAccount {
    int initialBalance,remBalance;
    BankAccount(){
        initialBalance = 1000;
        remBalance = 0;
    }
    public int addAmount(int bal){
        remBalance = initialBalance + bal;
        return remBalance;
    }
    public int subAmount(int bal){
        remBalance = initialBalance - bal;
        return remBalance;
    }
    public double invest(double bal){
        double remBalance = initialBalance - bal*initialBalance;
        return remBalance;
    }
    public static void main(String args[]) {
        int c;
        char choice = 'Y';
        int bal;
        double b1;
        int rem;
        BankAccount b = new BankAccount();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Choose an option: 1) Make a deposit, 2) Withdraw money, or 3) Invest money");
            c = sc.nextInt();
            if(c == 1){
                System.out.println("Enter amount you would like to deposit: ");
                bal = sc.nextInt();
                rem = b.addAmount(bal);
                System.out.println("Your remaining balance is: " + rem);
            }
            else if(c == 2){
                System.out.println("Enter amount you would like to withdraw: ");
                bal = sc.nextInt();
                rem = b.subAmount(bal);
                System.out.println("Your remaining balance is: " + rem);
            }
            else if(c == 3){
                System.out.println("Enter the percentage of your account (in decimal form) to invest: ");
                b1 = sc.nextDouble();
                b1 = b.invest(b1);
                System.out.println("Your remaining balance is: " + b1);
            }
            System.out.println("Would you like to retry? (Y/N)");
            choice = sc.next().charAt(0);
            if(choice == 'n' || choice == 'N')
                break;
        }
    }
}