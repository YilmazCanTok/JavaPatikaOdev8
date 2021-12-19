
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String userName, password;
        int logintries = 3;
        double balance = 5000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("ATM");
        System.out.println("----------------------------------------------------");

        while (logintries > 0) {
            System.out.print("Please Enter Your UserName : ");
            userName = scanner.nextLine();
            System.out.print("Plase Enter Your Password : ");
            password = scanner.nextLine();
            if (userName.equals("Patika") && password.equals("Dev")) {
                System.out.println("Succeed LogIn");
                System.out.println("----------------------------------------------------");
                System.out.println("Please chose a Process :\n"
                        + "1. Deposite money\n"
                        + "2. Withdraw money \n"
                        + "3. Balance inquiry\n"
                        + "4. Quit");
                int process = scanner.nextInt();
                do{
                    switch (process) {
                        case 1:
                            System.out.println("Please enter the amount you want to deposit :");
                            double deposit = scanner.nextDouble();
                            balance = balance + deposit;
                            System.out.println("Your updated balance is : " + balance);
                            break;
                        case 2:
                            System.out.println("Please enter the amount you want to withdraw : ");
                            double withdraw = scanner.nextDouble();

                            if (withdraw > balance) {
                                System.out.println("You cannot withdraw that much money. Your balance is : " + balance);
                                break;
                            } else {
                                balance = balance - withdraw;
                                System.out.println("Your updated balance is : " + balance);
                                break;
                            }
                        case 3:
                            System.out.println("Your balance is : " + balance);
                            break;
                        
                    }
                    if (process<1 || process>=5) {
                        System.out.println("Unavailible Process, Please try again");
                    }
                    System.out.print("Please chose a process if you wanna do something else : ");
                    process = scanner.nextInt();
                    
                }
                while (process != 4) ;
                    System.out.println("Quitting the system...");
                    break;
                
            } else {
                logintries--;
                if (logintries > 0) {
                    System.out.println("Wrong Username or Password. Try Again...");
                    System.out.println("Your log in tries left : " + logintries);
                } else {
                    System.out.println("Your bank account has been blocked by our system. Please meet with bank manager");
                }
            }
        }

    }
}
