public class process{
    private double checkBalance;
    private double depositAmount;
    private double withdrawnAmount;
    public process(){}
    public double getcheckBalance(){
        return checkBalance;
    }
    public void setcheckbalance(double checkBalance){
        this.checkBalance = checkBalance;
    }
   
     public double getdepositAmount(){
       return depositAmount;
    }
    public void setdepositAmount(double depositAmount){
        this.depositAmount=depositAmount;
       
    }
    public double getwithdrawnAmount(){
        return withdrawnAmount;
    }
    public void setwithdrawnAmount(double withdrawnAmt){
        this.withdrawnAmount = withdrawnAmt;
    }

}
