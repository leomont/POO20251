package Modulo8;

public class accountLimint extends Account{

    double limit = 0;

    public accountLimint(String name, double balance) {
        super(name, balance);
    }

    public void limitBalance(String name)
    {
        Account limitedAccount = new accountLimint(name, this.getBalance()/2);
    }
}
