import java.util.Scanner;

public class main {
    public static void main (String args[]){
        AtmOperation op=new oasis_atm(); 
        int userid=6018;
        int userpin=3333;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter user id: ");
        int userId=in.nextInt();
        System.out.println("Enter user pin: ");
        int userPin=in.nextInt();
        if((userid==userId)&&(userpin==userPin)){
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Transaction History\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch=in.nextInt();
                if(ch==1){
                    op.viewBalance();
                }
                else if(ch==2){
                    System.out.println("Enter the amount to withdraw ");
                    double withdrawAmount=in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if(ch==3){
                    System.out.println("Enter the Amount to Deposit :");
                    double depositAmount=in.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if(ch==4){
                    op.viewMiniStatement();
                }
                else if(ch==5){
                    System.out.println("Collect your ATM Card\n Thank you for choosing OASIS ATM!!");
                    System.exit(0);
                }
                else{
                    System.out.println("Enter valid choice between 1 to 5");
                }
            }
        }
        else{
            System.out.println("Sorry! incorrect user name or pin!! ");
        }
    }
}        