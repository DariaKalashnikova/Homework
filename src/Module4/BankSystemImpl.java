package Module4;


public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank bankUser = user.getBank();
        if (amount > user.getBalance()) {
            System.out.println(bankUser + " You have exceeded your limit");
        } else if (amount > bankUser.getLimitOfWithdrawal()) {
            System.out.println(bankUser + " You have exceeded your limit of withdrawal, as for now your limit is: " + bankUser.getLimitOfWithdrawal());
        } else {
            user.setBalance(user.getBalance() - amount - bankUser.getCommision(amount));
        }
    }


    @Override
    public void fundUser(User user, int amount) {
        Bank bankUser = user.getBank();
        if (amount >= bankUser.getLimitOfFunding()) {
            System.out.println(bankUser + " You can't replenish your account, your limit is:" + bankUser.getLimitOfFunding());
        } else {
            user.setBalance(user.getBalance() + amount - bankUser.getCommision(amount));
        }

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank bankUser = fromUser.getBank();
        if (amount > fromUser.getBalance()) {
            System.out.println(bankUser + " You don't have enough money for this transaction");
        } else {
            fromUser.setBalance(fromUser.getBalance() - amount - bankUser.getCommision(amount));
            toUser.setBalance(toUser.getBalance() + amount);
        }

    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());

    }
}
