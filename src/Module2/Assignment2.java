package Module2;

public class Assignment2 {

    static double accountWithdraw(double balance,double withdrawl, double commision){
        return balance-withdrawl-withdrawl*commision;
    }

    public static void main(String[] args) {
        double balance=980;
        double withdrawl=520;
        double commission=0.05;

        double balanceAfter=accountWithdraw(980,520,0.05);
        if(balanceAfter>=0){
            System.out.println("OK");
            System.out.println(balanceAfter+""+commission);
        }
        else {
            System.out.println("no");
        }
    }
}

