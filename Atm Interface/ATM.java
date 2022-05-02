public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    public ATM(){

    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    } 
    public double getDepositAmount(){
        return depositAmount;
    }
    public void setDepositAmount(double depositAmount){
        this.depositAmount=depositAmount;
    } 
    public double getWithDrawAmount(){
        return withdrawAmount;
    }
    public void setWithDrawAmount(double withdrawAmount){
        this.withdrawAmount=withdrawAmount;
    }

}
