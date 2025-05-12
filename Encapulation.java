class BankAccount {
    private double deposite;
    private double withdrawmoney;

    public double getWithdrawmoney() {
        return withdrawmoney;
    }

    public void setWithdrawmoney(double withdrawmoney) {
        this.withdrawmoney = withdrawmoney;
    }

    public double getDeposite() {
        return deposite;
    }

    public void setDeposite(double deposite) {
        this.deposite = deposite;
    }
}


public class Encapulation{
    public static void main(String[]args){
        BankAccount s1 = new BankAccount();
        s1.setDeposite(2634);
        s1.setWithdrawmoney(756);
        System.out.println(s1.getDeposite());
        System.out.println(s1.getWithdrawmoney());
    }
}






